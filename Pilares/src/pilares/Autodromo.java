
package pilares;

public class Autodromo {

    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("1394871");
        
        jeep.ligar();
        
        Moto z400 = new Moto();
        z400.setChassi("1394872838");
        z400.ligar();
        
        Veiculo coringa = z400;
        coringa.ligar();
        coringa = jeep;
        coringa.ligar();
    }
    
}
