package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
  // atributos
  private Set<Convidado> convidadosSet;
  // constructor

  public ConjuntoConvidados() {
    this.convidadosSet = new HashSet<>();
  }

  // metodos
  public void adicionarConvidado(String nome, int codigoConvite) {
    convidadosSet.add(new Convidado(nome, codigoConvite));
  }

  public void removerConvidadoPorCodigoconvite(int codigoConvite) {
    Convidado convidadoParaRemover = null;
    for (Convidado c : convidadosSet) {
      if (c.getCodigoConvite() == codigoConvite) {
        convidadoParaRemover = c;
        break;
      }
    }
    convidadosSet.remove(convidadoParaRemover);
  }
  public int contarConvidados() {
    return convidadosSet.size();
  }
  public void exibirConvidados() {
    System.out.println(convidadosSet);
  }
  public static void main(String[] args) {
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
    System.out.println(
      "Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados"
      );

    conjuntoConvidados.adicionarConvidado("Convidado 01", 12340);
    conjuntoConvidados.adicionarConvidado("Convidado 02", 56788);
    conjuntoConvidados.adicionarConvidado("Convidado 03", 91011);
    conjuntoConvidados.adicionarConvidado("Convidado 04", 12334);
    System.out.println(
      "Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados"
      );

    conjuntoConvidados.removerConvidadoPorCodigoconvite(12340);
    System.out.println(
      "Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados"
      );
    
    conjuntoConvidados.exibirConvidados();
    
  }


}
