package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    //atributos
    private List<Pessoa> pessoaList;
    //constructor
    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }
    //metodos
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Nome 01", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Nome 02", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Nome 03", 23, 1.66);
        ordenacaoPessoas.adicionarPessoa("Nome 04", 18, 1.56);

        System.out.println(ordenacaoPessoas.pessoaList);
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());

    }

}
