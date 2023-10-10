package set.OperacoesBasicas;

public class Convidado {
    //atributos
    private String nome;
    private int codigoConvite;
    //constructor

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }
    //metodos
    public String getNome() {
        return this.nome;
    }
    public int getCodigoConvite() {
        return this.codigoConvite;
    }
    
    

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", codigoConvite='" + getCodigoConvite() + "'" +
            "}";
    }



}
