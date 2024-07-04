
package catalogo;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroProduto produtos = new CadastroProduto();
        
        produtos.exibirProdutosPorNome();
        
        for (int i = 0 ; i < 3; i++ ){
            long codigo = 0; String nome; double preco; int quantidade;
            System.out.println("Entre o código do produto");
            codigo = scanner.nextLong();
            scanner.nextLine();
            System.out.println("Entre o nome do produto");
            nome = scanner.nextLine();
            System.out.println("Entre o preço do produto");
            preco = scanner.nextDouble();
            System.out.println("Entre a quantidade do produto");
            quantidade = scanner.nextInt();
            
            produtos.adicionarProduto(codigo, nome, preco, quantidade);
        }
        
        System.out.println("Produtos cadastrados ");
        System.out.println(produtos.exibirProdutosPorNome());
    }
}
