

public class usuario {
    private int codigo;//codigo que identifica o filme como unico
    private String genero;//terror, acao, suspense, comedia
    private String nome;//inception, barbie, oppenheimer
   

    public Filmes() {
        this.codigo = -1;
        this.genero = "";
        this.nome = "";
      
    }

    public Filmes(int codigo, String genero, String nome, String duracao) {
        this.codigo = codigo;
        this.genero = genero;
        this.nome = nome;
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Filmes [codigo=" + codigo + ", genero=" + genero + ", nome=" + nome + ", duracao=" + duracao + "]";
    }
}