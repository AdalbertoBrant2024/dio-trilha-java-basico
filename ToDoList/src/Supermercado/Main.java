
package Supermercado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int opcao = 0;
         CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        do {
            System.out.println("=======Carrinho de Compras =========");
            System.out.println(" 1- Adicionar Item no Carrinho");
            System.out.println(" 2- Remover Item do Carrinho");
            System.out.println(" 3- Listar Itens do Carrinho");
            System.out.println(" 4- Calcular Compras do Carrinho");
            System.out.println(" 5- Sair");
            System.out.println("=====================================");
            System.out.println("=======================================");
            System.out.print(" Digite uma opção -> ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcao){
                case 1:
                    String nome; double preco; int quantidade;
                    System.out.print("Digite o Nome do Item -> ");
                    nome = scanner.nextLine();
                    System.out.println("Digite o Preço do Item -> ");
                    preco = scanner.nextDouble();
                    System.out.println("Digite a Quantidade do Item -> ");
                    quantidade = scanner.nextInt();
                    carrinho.adicionarItem(nome, preco, quantidade);
                    break;
                    
                case 2:
                    System.out.println("Qual item deseja remover ?");
                    nome = scanner.nextLine();
                    carrinho.removerItem(nome);
                    break;
                    
                case 3:
                    System.out.println("Itens no Carrinho de Compras");
                    carrinho.exibirItems();
                    break;
                    
                case 4:
                    System.out.println("Valor das Compras está dando R$ "
                    + carrinho.calcularValorTotal());
                    break;
            }
            
        } while (opcao != 5);
    }
}

