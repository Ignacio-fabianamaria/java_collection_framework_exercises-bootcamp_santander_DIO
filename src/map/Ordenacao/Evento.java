package map.Ordenacao;

public class Evento {
     //atributos
  private String nome;
  private String atracao;
  //constructor
    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }
  //metodos
    public String getNome() {
        return this.nome;
    }
    public String getAtracao() {
        return this.atracao;
    }

    @Override
    public String toString() {
        return "{" +
          getNome() + " - " +
             getAtracao() + "'" +
            "}";
    }

  
}
