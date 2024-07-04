
package Agendamentos;


public class main {
    public static void main(String args[]){
        /*AgendaContatos agendaContatos = new AgendaContatos();
        
        agendaContatos.exibirContatos();
        
        agendaContatos.adicionarContato("Adalberto", 991179515);
        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Adalberto");
        agendaContatos.exibirContatos();
        agendaContatos.adicionarContato("Adalberto", 991179515);
        System.out.println(agendaContatos.pesquisarPorNome("Adalberto"));*/
        
        EstoqueProdutos estoque = new EstoqueProdutos();
        
      
        
        estoque.adicionarProduto(1234L, "Banana", 10000, 0.15);
        estoque.adicionarProduto(1111L, "Laranja", 10000, 0.35);
        estoque.adicionarProduto(2221L, "Maçã", 30000, 0.10);
        
        estoque.exibirProdutos();
        System.out.println("Valor em estoque total -> R$ " + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro -> "+estoque.obterProdutoMaisCaro());
    }
}
