package list.Pesquisa;

public class Livro {
    //atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;

    //construtor
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    //metodos

    public String getTitulo() {
        return this.titulo;
    }
    public String getAutor() {
        return this.autor;
    }
    public int getAnoPublicacao() {
        return this.anoPublicacao;
    }

    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", autor='" + getAutor() + "'" +
            ", anoPublicacao='" + getAnoPublicacao() + "'" +
            "}";
    }





    
}
