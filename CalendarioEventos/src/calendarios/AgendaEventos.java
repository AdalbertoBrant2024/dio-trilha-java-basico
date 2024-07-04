
package calendarios;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import static java.util.Map.entry;
import java.util.TreeMap;

public class AgendaEventos {
    private Map <LocalDate, Evento> eventosMap;
    
    public AgendaEventos(){
        this.eventosMap = new HashMap<>();
    }
    
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }
    
    // ordenar eventos por data , usando o treeMap
    public void exibirAgenda(){
        Map <LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }
    
    // obter o próximo evento que está disponível
    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        
        // eventos organizados em ordem crescente de data
        Map <LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if ( entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("Data -> " + proximaData);
                System.out.println("Próximo evento -> " + proximoEvento);
                break;
            }
    }
        
    }
}
