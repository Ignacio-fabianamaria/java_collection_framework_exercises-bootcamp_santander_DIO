package map.Pesquisa;

public class Produto {
    //atributos
    private String nome;
    private int quantidade;
    private double preco;
    //constructor

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    //metodos

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "{" +
             getNome() + "'" +
            ", qtd:'" + getQuantidade() + "'" +
            ", R$:'" + getPreco() + "'" +
            "}";
    }

}
