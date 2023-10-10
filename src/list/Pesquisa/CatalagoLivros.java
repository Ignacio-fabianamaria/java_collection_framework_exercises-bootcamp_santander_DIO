package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
  // atributos
  private List<Livro> livroList;

  // constructor

  public CatalagoLivros() {
    this.livroList = new ArrayList<>();
  }

  // metodos
  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    livroList.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> livrosPorAutor = new ArrayList<>();
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getAutor().equalsIgnoreCase(autor)) {
          livrosPorAutor.add(l);
        }
      }
    }
    return livrosPorAutor;
  }
  public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
    List<Livro> livrosPorIntervaloAno = new ArrayList<>();
    if(!livroList.isEmpty()){
      for(Livro l : livroList){
        if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
          livrosPorIntervaloAno.add(l);
        }
      }
    }
    return livrosPorIntervaloAno;
  }
  public Livro pesquisarPorTitulo(String titulo){
    Livro livroPorTitulo = null;
    if(!livroList.isEmpty()){
      for(Livro l : livroList){
        if(l.getTitulo().equalsIgnoreCase(titulo)){
          livroPorTitulo = l;
          break;
        }
      }
    }
    return livroPorTitulo;
  }
  public static void main(String[] args) {
    CatalagoLivros catalagoLivros = new CatalagoLivros();
    catalagoLivros.adicionarLivro("Livro 01", "Autor 01", 1995);
    catalagoLivros.adicionarLivro("Livro 02", "Autor 02", 1999);
    catalagoLivros.adicionarLivro("Livro 01", "Autor 01", 1995);
    catalagoLivros.adicionarLivro("Livro 03", "Autor 03", 2000);
    catalagoLivros.adicionarLivro("Livro 04", "Autor 04", 1997);

   
    System.out.println(catalagoLivros.pesquisarPorAutor("Autor 04"));
    System.out.println(catalagoLivros.pesquisarPorIntervaloAnos(1997, 1999));
    System.out.println(catalagoLivros.pesquisarPorTitulo("Livro 01"));
  }

}
