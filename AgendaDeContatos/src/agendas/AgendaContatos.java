
package agendas;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }
    
    public void adicionarContato(String nome, String sobreNome, int telefone){
        contatosSet.add(new Contato(nome, sobreNome, telefone));
    }
    
    public void exibirContatos(){
        System.out.println(contatosSet);
    }
    
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatosSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    
    public Contato atualizarNumeroContato(String nome, String sobreNome, int telefone){
        Contato atualizado = null;
        for(Contato c : contatosSet){
            if (c.getNome().equalsIgnoreCase(nome) && c.getSobreNome().equalsIgnoreCase(sobreNome)){
                c.setNumeroTelefone(telefone);
                atualizado = c;
                break;
            }
        }
        return atualizado;
    }
    
    public int tamAgenda(){
        return contatosSet.size();
    }
}
