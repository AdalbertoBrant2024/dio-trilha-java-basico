package desafiocontrolefluxo;
/**
 * Exceção personalizada lançada quando `parametroDois` é menor ou igual a `parametroUm` na classe `Contador`.
 *
 * @author Adalberto Caldeira
 */

public class ParametrosInvalidosException extends Exception{
    /**
     * Construtor da exceção com mensagem personalizada.
     *
     * @param mensagem Mensagem descritiva do erro.
     */
    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro.");
    }

    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
