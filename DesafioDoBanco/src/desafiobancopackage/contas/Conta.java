
package desafiobancopackage.contas;

import desafiobancopackage.clientes.Cliente;

public abstract class Conta implements InterfaceConta{
    
    // Temos apenas uma única agência
    private static final int AGENCIA_PADRAO = 3247; 
    private static int SEQUENCIAL = 34519;
    
    protected int agencia, numero;
    protected double saldo = 0.0;
    // Cada conta deve ter sempre um cliente
    protected Cliente cliente;
    
    public Conta(Cliente cliente) throws IllegalArgumentException{
        if (!cliente.verificaCpf()) {
        throw new IllegalArgumentException("CPF inválido!");
    }
        this.cliente = cliente;
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valorSaque) {
        if (this.saldo > 0  && saldo >= valorSaque)
            saldo -= valorSaque;
        else{
            System.out.println("Favor entrar em contato com o gerente da agência");
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0 )
            saldo += valor;
        else {
            System.out.println("Não aceitamos valores menores que Zero ( 0 )");
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public String toString() {
        return "Titular : " + cliente.getNome() + " " + 
                cliente.getSobreNome()+"\n"+"agencia= " + agencia+
                "\ncc= " + numero +"\nsaldo= "+saldo;
    }
    @Override
    public void imprimirDados(){
        System.out.println(this.toString());
    }
    
}
