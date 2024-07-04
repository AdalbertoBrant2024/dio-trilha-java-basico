
package ordenacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrdenacaoPessoas {
    List <Pessoa> pessoas;
    
    public OrdenacaoPessoas(){
        this.pessoas = new ArrayList<>();
    }
    
    public void adicionarPessoa(String nome, int idade, double altura ){
        pessoas.add(new Pessoa(nome, idade, altura));
        
    }
    
    public List <Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    
    public List <Pessoa> ordenarPorAltura(){
        List <Pessoa> pessoasPorAltura = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
}

class ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
    
}