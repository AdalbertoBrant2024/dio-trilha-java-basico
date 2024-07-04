
package geometria;

public class Geometria {


    public static void main(String[] args) {
        Quadrado qrd = new Quadrado(2);
        Quadrilatero quadri = new Quadrado(10);
        Quadrilatero losango = new Losango(5,2);
        System.out.println("area do losango -> " + losango.area());
        System.out.println("perimetro do losango -> " + losango.perimetro());
        System.out.println("lado do losango é -> " + losango.getLado());
    }
    
}
