package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
  // atributos
  private Set<Produto> produtoSet;

  // constructor
  public CadastroProdutos() {
    this.produtoSet = new HashSet<>();
  }

  // metodos
  public void adicionarProduto(String nome, long codigo, double preco, int quantidade) {
    produtoSet.add(new Produto(nome, codigo, preco, quantidade));
  }

  public Set<Produto> exibiProdutosPornome() {
    Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
    return produtosPorNome;
  }

  public Set<Produto> exibirProdutosPorPreco() {
    Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
    produtosPorPreco.addAll(produtoSet);
    return produtosPorPreco;
  }

  public static void main(String[] args) {
    CadastroProdutos cadastroProdutos = new CadastroProdutos();
    cadastroProdutos.adicionarProduto("short", 0001l, 20.50, 5);
    cadastroProdutos.adicionarProduto("calça", 0002l, 30.50, 20);
    cadastroProdutos.adicionarProduto("blusa", 0001l, 50.50, 3);
    cadastroProdutos.adicionarProduto("meia", 0004l, 10.50, 8);

    System.out.println(cadastroProdutos.produtoSet);

    System.out.println(cadastroProdutos.exibiProdutosPornome());
    System.out.println(cadastroProdutos.exibirProdutosPorPreco());

  }

}
