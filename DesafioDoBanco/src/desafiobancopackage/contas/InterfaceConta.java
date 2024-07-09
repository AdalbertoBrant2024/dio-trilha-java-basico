
package desafiobancopackage.contas;

public interface InterfaceConta {
    
    // realiza o saque da conta dado um valor de saque
    public void sacar(double valorSaque);
    
    // dado um nome, cpf, agencia e numero, deposita um valor
    public void depositar(double valor);
    
    public void transferir(double valor, Conta conta);
    
    public void imprimirDados();
}
