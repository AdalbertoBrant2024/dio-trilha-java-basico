
package calendarios;

import java.time.LocalDate;
import java.time.Month;
public class main {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        
        agendaEventos.adicionarEvento(LocalDate.of(2024,Month.JUNE, 4), "Congresso-1","Palestra-1");
        agendaEventos.adicionarEvento(LocalDate.of(2024,Month.NOVEMBER, 14), "Aniversário", "Adalberto");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY,11), "Aniversário", "Lucas");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 21), "Aniversário", "Carol");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.DECEMBER, 19), "Aniversário", "Eliane");
        
        agendaEventos.exibirAgenda();
        
    }
}
