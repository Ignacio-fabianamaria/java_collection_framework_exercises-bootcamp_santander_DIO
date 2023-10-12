package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
  // atributos
  private Map<LocalDate, Evento> eventosMap;

  // constructor
  public AgendaEventos() {
    this.eventosMap = new HashMap<>();
  }

  // metodos
  public void adicionarEvento(LocalDate data, String nomeEvento, String descricaoAtracao) {
    Evento evento = new Evento(nomeEvento, descricaoAtracao);
    eventosMap.put(data, evento);
  }
  public void obterProximoEvento() {
    LocalDate dataAtual = LocalDate.now();
    LocalDate proximaData = null;
    Evento proximoEvento = null;
    for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
      LocalDate dataEvento = entry.getKey();
      if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
        proximaData = dataEvento;
        proximoEvento = entry.getValue();
        break;
      }
    }
    if (proximoEvento != null) {
      System.out.println("O próximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
    } else {
      System.out.println("Não há eventos futuros na agenda.");
    }
  }
  public void exibirEventos(){
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
    System.out.println(eventosTreeMap);
  }
  public static void main(String[] args){
    AgendaEventos agendaEventos = new AgendaEventos();
    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 5), "Evento 01", "Descrição 01");
    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 18), "Evento 02", "Descrição 01");
    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.NOVEMBER, 5), "Evento 03", "Descrição 01");
    agendaEventos.exibirEventos();
    agendaEventos.obterProximoEvento();
    }

}
