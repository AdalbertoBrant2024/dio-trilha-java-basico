
package contabanco;

import java.util.Scanner;

/**
 *
 * @author adalberto caldeira
 * @version 0.0.1
 */
public class ContaTerminal {

    /**
     * @param args argumentos não será usado
     * @param numero é inteiro e representa o número da conta
     * @param agencia é uma string do tipo xxx-xx
     * @param nomeCliente string com o nome do cliente
     * @param saldo é um Decimal com o saldo em conta do cliente
     */
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        String msg = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.";
        return msg;
        
    }
    
    public static void main(String[] args) {
        
        ContaTerminal contaTerminal = new ContaTerminal();
        
        // TODO: Aprender classe scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();
        contaTerminal.setAgencia(agencia);
        
        System.out.println("Por favor, digite o número da conta !");
        int numero = scanner.nextInt();
        scanner.nextLine();
        contaTerminal.setNumero(numero);
        
        System.out.println("Por favor, entre o nome do cliente !");
        String nome = scanner.nextLine();
        contaTerminal.setNomeCliente(nome);
        
        System.out.println("Por favor, entre o saldo do cliente !");
        double saldo = scanner.nextDouble();
        scanner.nextLine();
        contaTerminal.setSaldo(saldo);
        
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("  ");
        System.out.println(contaTerminal.toString());
    }
    
}
