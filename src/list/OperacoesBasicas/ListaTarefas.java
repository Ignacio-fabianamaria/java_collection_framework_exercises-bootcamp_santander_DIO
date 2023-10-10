package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
  // atributos
  private List<Tarefas> tarefaLista;

  // construtor
  public ListaTarefas() {
    this.tarefaLista = new ArrayList<>();
  }

  // metodos
  public void adicionarTarefa(String descricao) {
    tarefaLista.add(new Tarefas(descricao));
  }

  public void removerTarefa(String descricao) {
    List<Tarefas> tarefasParaRemover = new ArrayList<>();
    for (Tarefas t : tarefaLista) {
      if (t.getDescricao().equalsIgnoreCase(descricao)) {
        tarefasParaRemover.add(t);
      }
    }
    tarefaLista.removeAll(tarefasParaRemover);
  }

  public int obterNumeroTotalTarefas() {
    return tarefaLista.size();
  }

  public void obterDescricoesTarefas() {
    if(tarefaLista.isEmpty()){
      System.out.println("Nenhuma tarefa foi cadastrada.");
    }else{
      System.out.println(tarefaLista);
    }
  }
  public static void main(String[] args) {
    ListaTarefas listaTarefas = new ListaTarefas();
    System.out.println("Total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());

    /* listaTarefas.adicionarTarefa("Tarefa 01");
    listaTarefas.adicionarTarefa("Tarefa 02");
    listaTarefas.adicionarTarefa("Tarefa 01");
    listaTarefas.adicionarTarefa("Tarefa 03");
    listaTarefas.adicionarTarefa("Tarefa 04"); */
    System.out.println("Total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());

    listaTarefas.removerTarefa("Tarefa 01");
    System.out.println("Total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());

    listaTarefas.obterDescricoesTarefas();
    
  }

}
