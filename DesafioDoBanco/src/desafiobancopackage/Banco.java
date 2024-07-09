
package desafiobancopackage;

import desafiobancopackage.clientes.Cliente;
import desafiobancopackage.contas.Conta;
import desafiobancopackage.contas.ContaCorrente;
import desafiobancopackage.contas.ContaPoupanca;

public class Banco {
    private String nomeDoBanco;
    
    public static void main(String[] args) {
        // cpf gerado no site -> https://www.4devs.com.br/gerador_de_cpf
        Cliente bancoCliente = new Cliente("Joséerts", "Nomesdf deres Fantasiasstrs",
                "502.507.000-77", "Rua tatuísdfawer 451341513", "00-00000-0001" );
        
        Conta cc = new ContaCorrente(bancoCliente);
        Conta poupa = new ContaPoupanca(bancoCliente);
        
        cc.depositar(12345.89);
        cc.sacar(345.74);
        cc.imprimirDados();
        cc.transferir(345.74, poupa);
        cc.imprimirDados();
        poupa.imprimirDados();
        
    }
}
