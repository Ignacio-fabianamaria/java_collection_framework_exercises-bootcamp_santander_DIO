package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  // atributos
  private Set<Contato> contatoSet;;
  // constructor

  public AgendaContatos() {
    this.contatoSet = new HashSet<>();
  }

  // metodos
  public void adicionarContato(String nome, int numero) {
    contatoSet.add(new Contato(nome, numero));
  }

  public void exibirContato() {
    System.out.println(contatoSet);
  }

  public Set<Contato> pesquisarPorNome(String nome) {
    Set<Contato> contatosPorNome = new HashSet<>();
    for (Contato c : contatoSet) {
      if (c.getNome().startsWith(nome)) {
        contatosPorNome.add(c);
      }
    }
    return contatosPorNome;
  }

  public Contato atualizarNumeroContato(String nome, int numero) {
    Contato contatoAtualizado = null;
    for (Contato c : contatoSet) {
      if (c.getNome().equalsIgnoreCase(nome)) {
        c.setNumero(numero);
        contatoAtualizado = c;
        break;
      }
    }
    return contatoAtualizado;
  }
  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.exibirContato();
    agendaContatos.adicionarContato("fabiana", 123456);
    agendaContatos.adicionarContato("fabiana", 123456);
    agendaContatos.adicionarContato("fabiana maria", 123456);
    agendaContatos.adicionarContato("fana", 7894561);

    agendaContatos.exibirContato();

    System.out.println(agendaContatos.pesquisarPorNome("fabiana"));

    System.out.println("Contato Atualizado: " + agendaContatos.atualizarNumeroContato("fana", 7700000));
  }

}
