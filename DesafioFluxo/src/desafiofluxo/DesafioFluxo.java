package desafiofluxo;

import java.util.Scanner;

public class DesafioFluxo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 

            int opcao = scanner.nextInt(); 
        // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
        switch( opcao ){
          case 1:
            System.out.println("Qual valor a ser depositado ?"); 
            saldo = saldo + scanner.nextDouble();
            System.out.println("Saldo atual: " + saldo);
            break;
          case 2:
            System.out.println("Qual o valor a ser sacado ?");
            double valor = scanner.nextDouble();
            if (saldo >= valor){
              saldo = saldo - valor;
              System.out.println("Saldo atual: " + saldo);
            }
            else {
              System.out.println("Saldo insuficiente.");
            }
            break;
          case 3:
            System.out.println("Saldo atual: " + saldo);
            break;
          case 0:
            System.out.println("Programa encerrado.");
            break;
            default:
                    System.out.println("Opção inválida. Tente novamente."); 
        }
       
                
            }
        }
    }

