import java.net.http.*;
import java.util.*;
import java.net.*;

public class teste{


	public static void main(String[] Args)throws Exception{
	
		String body = "{\"Inputs\": {\"input1\": [{\"senha\": \"kzde5577\",\"special character\": 0,\"uppercase\": 0,\">=8\": 1,\"number\": 1,\"strength\": 1}]},\"GlobalParameters\": {}}";

		String url = "https://ussouthcentral.services.azureml.net/workspaces/4d96d3e3b28a41ff843a5480ceffea83/services/6cff6a1efc9b44d8ae467c039d17d76f/execute?api-version=2.0&format=swagger";
		
   		 HttpClient client = HttpClient.newHttpClient();
		HttpRequest req = HttpRequest.newBuilder()
		                .uri(URI.create(url)).header("Content-Type","application/json").header("Authorization",
						"Bearer WfO/4WHZMD4XrbsuQywY8d+6IKlXNkufZVnbovRVJ84q8BDGPXf7cHXS1Q1dX/YrTVqabzBQktRV+AMCgZr6PQ==").header("Accept","application/json")
		                .POST(HttpRequest.BodyPublishers.ofString(body))
		                .build();
		HttpResponse<String> resp = client.send(req,HttpResponse.BodyHandlers.ofString());
		        System.out.println(resp.body());


	
	

	
	
	
	}



}