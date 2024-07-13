
package desafio.bootcamp.dominio.cursos;

import desafio.bootcamp.dominio.conteudos.Conteudo;

public class Curso extends Conteudo{
    
    private int cargaHoraria;


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "==== Curso === " + "\ntitulo = " + super.getTitulo() + "\n"
                + "descricao = " + super.getDescricao() + 
                "\ncargaHoraria = " + cargaHoraria
                + "\n";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
    
    
}
