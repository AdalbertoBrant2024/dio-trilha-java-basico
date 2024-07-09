
package funcionais;

import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;


public class ExemploConsumer {

    public static void main(String[] args) {
        List <Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23);
        
        // Usar o Consumer com expressao lambda para imprimir numeros impares
        Consumer < Integer> imprimirNumeroImpar = numero -> {
            if (numero % 2 != 0){
                System.out.println(numero);
            }
        };
        
        // Usar o Consumer para imprimir numeros impares o stream
        numeros.stream().forEach(imprimirNumeroImpar);
        
        int[] contador = {0};
        // Imprimir números pares
        numeros.forEach( n-> {
            
            if(n % 2 == 0){
                System.out.print(n + " ");
                contador[0]++;
            }
            
        });
        System.out.println("\nQuantidade de pares -> "+contador[0]);
    }
    
}
