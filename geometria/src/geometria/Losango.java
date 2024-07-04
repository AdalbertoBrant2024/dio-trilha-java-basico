
package geometria;


public class Losango extends Quadrilatero{
    
    private double lado = 10;
    private double diagonalMaior, diagonalMenor;

    public Losango(double diagonalMaior, double diagonalMenor){
        if(diagonalMaior > 0 && diagonalMenor > 0){
            if(diagonalMaior != diagonalMenor){
                this.lado = Math.sqrt(Math.pow(diagonalMaior/2,2) + Math.pow(diagonalMenor / 2,2));
                this.diagonalMaior = diagonalMaior;
                this.diagonalMenor = diagonalMenor;
            }
            else{
                throw new IllegalArgumentException("As diagonais não podem ter valores iguais");
            }
        }
        else {
            throw new IllegalArgumentException("Diagonais deve ser maiores que zero");
        }
    }
    
    @Override
    protected double perimetro() {
        return this.lado * 4;
    }

    @Override
    protected double area() {
        return (this.diagonalMaior * this.diagonalMenor) / 2;
    }
    
    public double getLado() {
        return this.lado;
    }

    public double getDiagonalMaior() {
        return diagonalMaior;
    }

    public void setDiagonalMaior(double diagonalMaior) {
        if (diagonalMaior > 0)
            this.diagonalMaior = diagonalMaior;
        else {
            throw new IllegalArgumentException("Lado do losango deve ser maior que zero");
        }
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        if ( diagonalMenor > 0)
            this.diagonalMenor = diagonalMenor;
        else {
            throw new IllegalArgumentException("Lado do losango deve ser maior que zero");
        }
    }
}
