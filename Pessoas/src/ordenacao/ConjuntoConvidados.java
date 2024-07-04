
package ordenacao;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;
    
    public ConjuntoConvidados(){
        this.convidadosSet = new HashSet<>();
    }
    // adicionar Convidado
    public void adicionarConvidado(String nome, int idade, double altura, int codigoConvite ){
        convidadosSet.add(new Convidado(nome, idade, altura, codigoConvite));
    }
    
    // remover convidado por código do convite
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadosSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
        System.out.println("Convidado "+ convidadoParaRemover.getNome()+ " removido do set");
    }
    
    // contar convidados
    
    public int contarConvidados(){
        return convidadosSet.size();
    }
    
    // exibir convidados
    public void exibirConvidados(){
        System.out.println(convidadosSet);
        
    }
}
