package list.OperacoesBasicas;

public class Tarefas {
    // atributos
    private String descricao;

    //construtor
    public Tarefas(String descricao) {
        this.descricao = descricao;
    }
    //metodos
    public String getDescricao() {
        return this.descricao ;
    }

    @Override
    public String toString() {
        return descricao;
    }


}
