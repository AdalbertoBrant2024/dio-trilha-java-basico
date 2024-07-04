
package ordenacao;

import java.util.Objects;

public class Convidado extends Pessoa{
    private int codigoConvite;

    public int getCodigoConvite() {
        return codigoConvite;
    }

    public void setCodigoConvite(int codigoConvite) {
        this.codigoConvite = codigoConvite;
    }
    
    public Convidado(String nome, int idade, double altura, int codigoConvite){
        super(nome, idade, altura);
        this.codigoConvite = codigoConvite;
}

    @Override
    public String toString() {
        return "Convidado{ " + 
                "nome= " + super.getNome() + '\n'
                + "código convite= " + this.codigoConvite + "\n }";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.codigoConvite);
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Convidado other = (Convidado) obj;
        return this.codigoConvite == other.codigoConvite;
    }
    
}
