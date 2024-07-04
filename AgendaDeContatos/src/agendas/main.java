
package agendas;


public class main {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        
        agenda.adicionarContato("Camila", "Pessoa Santos", 98764537);
        agenda.adicionarContato("Fernando", "Silva", 98234567);
        agenda.adicionarContato("Camila", "Pessoa Santos", 98764537);
        agenda.adicionarContato("Fernando", "Silva", 98234567);
        agenda.adicionarContato("Ana", "Ferreira", 91234567);
        agenda.adicionarContato("Lucas", "Oliveira", 98765432);
        agenda.adicionarContato("Isabela", "Santos", 91234567);
        agenda.adicionarContato("Rafael", "Silva", 99887766);
        agenda.adicionarContato("Larissa", "Pereira", 92345678);
        agenda.adicionarContato("Pedro", "Almeida", 91122334);
        
        agenda.exibirContatos();
        System.out.println("Temos " + agenda.tamAgenda() +" contatos " + "na agenda");
        
        
    }
}
