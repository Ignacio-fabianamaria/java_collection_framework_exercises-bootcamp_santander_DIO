package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
  // atributo
  private String nome;
  private long codigo;
  private double preco;
  private int quantidade;

  // constructor
  public Produto(String nome, long codigo, double preco, int quantidade) {
    this.nome = nome;
    this.codigo = codigo;
    this.preco = preco;
    this.quantidade = quantidade;
  }
  @Override
  public int compareTo(Produto p){
    return nome.compareToIgnoreCase(p.getNome());
  }

  // metodos
  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public long getCodigo() {
    return this.codigo;
  }

  public void setCodigo(long codigo) {
    this.codigo = codigo;
  }

  public double getPreco() {
    return this.preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public int getQuantidade() {
    return this.quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  @Override
  public String toString() {
    return "{" +
        getNome() + " - " +
        getCodigo() + " - " +
        getPreco() + " - " +
        getQuantidade() + " - " +
        "}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Produto produto))
      return false;
    return getCodigo() == produto.getCodigo();
  }
  @Override
  public int hashCode(){
    return Objects.hash(getCodigo());
  }

}
class ComparatorPorPreco implements Comparator<Produto>{

  @Override
  public int compare(Produto p1, Produto p2) {
    return Double.compare(p1.getPreco(), p2.getPreco());
  }
 
  
}
