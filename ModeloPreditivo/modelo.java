import java.net.http.*;
import java.util.*;
import java.net.*;

public class modelo{


	public static void main(String[] Args)throws Exception{
	
		/**
			Importante lembrar de entregar dados em modelo JSON, em java necessario usar caracteres de escape, como ' \" ' para imprimir uma aspas
		
		**/
		String body = "{\"Inputs\": {\"input1\": [{\"senha\": \"kzde5577\",\"special character\": 0,\"uppercase\": 0,\">=8\": 1,\"number\": 1,\"strength\": 1}]},\"GlobalParameters\": {}}";
		
		

		String url = "https://ussouthcentral.services.azureml.net/workspaces/4d96d3e3b28a41ff843a5480ceffea83/services/6cff6a1efc9b44d8ae467c039d17d76f/execute?api-version=2.0&format=swagger";//encontrada na pagina de detalhes da API criada
		
   	     HttpClient client = HttpClient.newHttpClient();
		HttpRequest req = HttpRequest.newBuilder()
		                .uri(URI.create(url)).header("Content-Type","application/json").header("Authorization","Bearer *CODIGO DE AUTORIZACAO*")//Nao esquecer do espaço apos o bearer 
		                .header("Accept","application/json")
		                .POST(HttpRequest.BodyPublishers.ofString(body))
		                .build();
		                
		HttpResponse<String> resp = client.send(req,HttpResponse.BodyHandlers.ofString());
		
		MyIO.println(resp.body());//usando MyIO do Max, caso nao possua pode ser alterado para System.out.println()
	}
}