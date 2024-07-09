
package desafiobancopackage.contas;

import desafiobancopackage.clientes.Cliente;

public class ContaPoupanca extends Conta implements InterfaceConta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
    

    @Override
    public void sacar(double valorSaque) {
        super.sacar(valorSaque);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    @Override
    public void transferir(double valor, Conta conta) {
        super.sacar(valor);
        conta.depositar(valor);
    }

    @Override
    public void imprimirDados(){
        System.out.println("=== Conta Poupança ===");
        System.out.println(super.toString());
    }
}
