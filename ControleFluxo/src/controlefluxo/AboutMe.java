
package controlefluxo;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            String nome, sobreNome;
            int idade;
            double altura;
            System.out.print("Digite o seu nome -> "); nome = scanner.nextLine();
            System.out.print("Digite o seu sobrenome -> ");sobreNome = scanner.nextLine();
            System.out.print("Digite a sua idade -> "); idade = scanner.nextInt();
            System.out.print("Digite a sua altura -> ");altura = scanner.nextDouble();
            
            System.out.println("===================================");
            System.out.println(nome + " " + sobreNome + " idade -> " + idade + " altura -> " + altura);
        } 
        catch (InputMismatchException e){
            System.out.println(e + "\nCampos idade e altura precisam ser numéricos");
        }
    }
}
