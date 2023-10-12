package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ProdutosEstoque {
  // atributos
  private Map<Long, Produto> estoqueProdutosMao;

  // constructor
  public ProdutosEstoque() {
    this.estoqueProdutosMao = new HashMap<>();
  }

  // metodos
  public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
    estoqueProdutosMao.put(codigo, new Produto(nome, quantidade, preco));
  }

  public void exibirProdutos() {
    System.out.println(estoqueProdutosMao);
  }

  public double calculaValorTotalEstoque() {
    double valorTotal = 0d;
    if (!estoqueProdutosMao.isEmpty()) {
      for (Produto p : estoqueProdutosMao.values()) {
        valorTotal += p.getQuantidade() * p.getPreco();
      }
    }
    return valorTotal;
  }
  public Produto obterProdutoMaisCaro(){
    Produto produtoMaisCaro = null;
    double maiorPreco = Double.MIN_VALUE;
    if (!estoqueProdutosMao.isEmpty()) {
      for(Produto p : estoqueProdutosMao.values()){
        if(p.getPreco() > maiorPreco){
          produtoMaisCaro = p;
          maiorPreco = p.getPreco();
        }
      }
    }
    return produtoMaisCaro;
  }
   public Produto obterProdutoMaisBarato(){
    Produto produtoMaisBarato = null;
    double menorPreco = Double.MAX_VALUE;
    if (!estoqueProdutosMao.isEmpty()) {
      for(Produto p : estoqueProdutosMao.values()){
        if(p.getPreco() < menorPreco){
          produtoMaisBarato = p;
          menorPreco = p.getPreco();
        }
      }
    }
    return produtoMaisBarato;
  }
  public static void main(String[] args) {
    ProdutosEstoque estoque = new ProdutosEstoque();
    estoque.exibirProdutos();

    estoque.adicionarProduto(01l, "Produto01", 5, 3.5);
    estoque.adicionarProduto(02l, "Produto02", 2, 75.5);
    estoque.adicionarProduto(03l, "Produto03", 8, 2.5);
    estoque.adicionarProduto(04l, "Produto04", 1, 1.5);

    estoque.exibirProdutos();

    System.out.println("Valor total do estoque: R$: " + estoque.calculaValorTotalEstoque());
    System.out.println("O produto mais caro é: " + estoque.obterProdutoMaisCaro());
    System.out.println("O produto mais barato é: " + estoque.obterProdutoMaisBarato());
  }
}
