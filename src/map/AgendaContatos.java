package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos
    private Map<String, Integer> agendaContatoMap;
    //constructor

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
    //metodos
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Fabiana", 123456);
        agendaContatos.adicionarContato("Fabiana", 777777);
        agendaContatos.adicionarContato("Fabiana Maria", 17456);
        agendaContatos.adicionarContato("Ana", 1277456);
        agendaContatos.adicionarContato("Bia", 18923456);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Fabiana");
        agendaContatos.exibirContatos();
        System.out.println("O numero do contato é: " + agendaContatos.pesquisarPorNome("Ana"));

    }
}
