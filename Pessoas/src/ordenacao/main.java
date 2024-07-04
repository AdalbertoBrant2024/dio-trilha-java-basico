
package ordenacao;


public class main {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenaPessoas = new OrdenacaoPessoas();
        
        ordenaPessoas.adicionarPessoa("José da Silva", 50, 1.90);
        ordenaPessoas.adicionarPessoa("Fulano et al", 20, 1.77);
        ordenaPessoas.adicionarPessoa("Gabriel Martins", 38, 2.10);
        ordenaPessoas.adicionarPessoa("Ana Silva", 25, 1.65);
        ordenaPessoas.adicionarPessoa("Carlos Oliveira", 42, 1.80);
        ordenaPessoas.adicionarPessoa("Mariana Santos", 30, 1.70);
        ordenaPessoas.adicionarPessoa("Rafael Lima", 28, 1.75);
        ordenaPessoas.adicionarPessoa("Isabela Ferreira", 22, 1.60);
        ordenaPessoas.adicionarPessoa("Pedro Almeida", 35, 1.85);
        ordenaPessoas.adicionarPessoa("Lúcia Costa", 50, 1.68);
        ordenaPessoas.adicionarPessoa("Gustavo Rodrigues", 19, 1.73);
        ordenaPessoas.adicionarPessoa("Camila Oliveira", 27, 1.62);
        ordenaPessoas.adicionarPessoa("Fernando Souza", 33, 1.78);
        ordenaPessoas.adicionarPessoa("Amanda Pereira", 24, 1.67);
        ordenaPessoas.adicionarPessoa("Diego Martins", 29, 1.79);
        ordenaPessoas.adicionarPessoa("Juliana Silva", 31, 1.71);
        ordenaPessoas.adicionarPessoa("Lucas Oliveira", 23, 1.74);
        ordenaPessoas.adicionarPessoa("Patrícia Costa", 45, 1.66);
        ordenaPessoas.adicionarPessoa("Thiago Alves", 26, 1.76);
        ordenaPessoas.adicionarPessoa("Renata Ferreira", 37, 1.69);
        ordenaPessoas.adicionarPessoa("Bruno Lima", 34, 1.81);
        ordenaPessoas.adicionarPessoa("Carolina Santos", 28, 1.63);
        ordenaPessoas.adicionarPessoa("Vinícius Oliveira", 22, 1.77);
        ordenaPessoas.adicionarPessoa("Larissa Rodrigues", 32, 1.72);
        ordenaPessoas.adicionarPessoa("Eduardo Souza", 36, 1.82);
        ordenaPessoas.adicionarPessoa("Beatriz Pereira", 25, 1.68);
        ordenaPessoas.adicionarPessoa("André Martins", 30, 1.75);
        ordenaPessoas.adicionarPessoa("Helena Silva", 48, 1.70);
        ordenaPessoas.adicionarPessoa("Marcelo Oliveira", 27, 1.73);
        ordenaPessoas.adicionarPessoa("Sofia Costa", 23, 1.64);
        ordenaPessoas.adicionarPessoa("Rodrigo Alves", 31, 1.78);
        ordenaPessoas.adicionarPessoa("Laura Ferreira", 29, 1.76);
        ordenaPessoas.adicionarPessoa("José Lima", 40, 1.83);

        // Imprime por idade
       // System.out.println(ordenaPessoas.ordenarPorIdade());
        // Imprime por altura
        //System.out.println(ordenaPessoas.ordenarPorAltura());
        
        ConjuntoConvidados convidados = new ConjuntoConvidados();
        
        convidados.adicionarConvidado("José Lima", 40, 1.83, 1234);
        convidados.adicionarConvidado("Laura Ferreira", 29, 1.76, 12345);
        convidados.adicionarConvidado("Carolina Santos", 28, 1.63,123498);
        convidados.adicionarConvidado("Carolina Santos", 28, 1.63,123498);
        System.out.println("Imprime a lista de Convidados");
        convidados.exibirConvidados();
        convidados.removerConvidadoPorCodigoConvite(12345);
        convidados.exibirConvidados();
    }
}
