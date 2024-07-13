
package desafio.bootcamp.dominio.mentorias;

import desafio.bootcamp.dominio.conteudos.Conteudo;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    
    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "*** Mentoria *** " 
                + "\ntitulo = " + super.getTitulo() 
                + "\ndescricao = " + super.getDescricao() + 
                "\ndata = " + data + "\n";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
    
    
}
