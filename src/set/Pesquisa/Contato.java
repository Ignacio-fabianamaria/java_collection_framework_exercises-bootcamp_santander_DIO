package set.Pesquisa;
import java.util.Objects;

public class Contato {
    //atributos
    private String nome;
    private int numero;
    //constructor
    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }
    //metodos
    public String getNome() {
        return this.nome;
    }
    public int getNumero() {
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "{"+ nome + '\'' + ", " + numero + "}";
    }
    @Override
public int hashCode() {
    return Objects.hash(getNome());
}

@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Contato contato)) return false;
    return Objects.equals(getNome(), contato.getNome());
}




}
