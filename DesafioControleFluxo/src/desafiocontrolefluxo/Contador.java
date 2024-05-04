package desafiocontrolefluxo;

import java.util.Scanner;

/**
 * Classe `Contador` conta números inteiros em um dado intervalo
 *
 * @author Adalberto Caldeira
 */
public class Contador {

    /**
     *Solicita ao usuário dois numeros inteiros, valida os valores e chama o método `contar` para realizar a contagem.
     *
     * @param args Argumentos da linha não tem 
     */
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        boolean parametrosValidos = false;

        while (!parametrosValidos) {
            try {
                System.out.print("Digite o primeiro parâmetro -> ");
                int parametroUm = terminal.nextInt();
                System.out.print("Digite o segundo parâmetro -> ");
                int parametroDois = terminal.nextInt();

                if (parametroDois <= parametroUm) {
                    throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
                } else {
                    // Chamando o método contendo a lógica de contagem
                    contar(parametroUm, parametroDois);
                    parametrosValidos = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Formato de número inválido. Insira um número inteiro.");
            } catch (ParametrosInvalidosException e) {
                // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Realiza a contagem dos números inteiros no intervalo `[parametroUm, parametroDois]`. Lança uma exceção `ParametrosInvalidosException` caso `parametroDois` seja menor ou igual a `parametroUm`.
     *
     * @param parametroUm Limite inferior da contagem.
     * @param parametroDois Limite superior da contagem.
     * @throws ParametrosInvalidosException Se `parametroDois` for menor ou igual a `parametroUm`.
     */
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validação dos parâmetros
        if (parametroDois <= parametroUm) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        // Lógica de contagem
        int contagem = parametroDois - parametroUm;
        System.out.println("\n++++++++++++++++++++++++++++++++");
        System.out.println("\tIMPRIMINDO A CONTAGEM\n");
        System.out.println("++++++++++++++++++++++++++++++++\n");
        for (int i = 1; i <= contagem; i++) {
            System.out.println("\tImprimindo o número " + i);
        }
        System.out.println("");
    }
}