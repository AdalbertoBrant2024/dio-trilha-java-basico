
package geometria;

public class Quadrado extends Quadrilatero{
    
    private double lado;
    
    public Quadrado (double lado){
        if (lado > 0){
            this.lado = lado;
        }
        else {
            throw new IllegalArgumentException("O lado do Quadrado deve ser maior que zero");
        }
    }
    
    @Override
    protected final double perimetro(){
        return this.lado + this.lado + this.lado + this.lado;
    }
    @Override
    protected final double area(){
        return this.lado * this.lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado > 0)
            this.lado = lado;
        else {
            throw new IllegalArgumentException("O lado do Quadrado deve ser maior que zero");
        }
    }   
}