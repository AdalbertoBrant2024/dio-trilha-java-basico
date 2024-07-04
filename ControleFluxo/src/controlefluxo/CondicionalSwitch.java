
package controlefluxo;

import java.util.Scanner;



public class CondicionalSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do {
        System.out.println("=================================");
        System.out.println("1 - Jogar");
        System.out.println("2- Sair");
        System.out.println("============");
        System.out.println("Digite a opcao -> ");
        opcao = scanner.nextInt();
        
        switch( opcao){
            case 1:
                System.out.println("Vamos jogar agora ");
                break;
            case 2:
                System.out.println("Saindo do programa ");
                break;
            default:
                System.out.println("========================");
                break;
        }
        
        } while(opcao != 2);
    }
}
