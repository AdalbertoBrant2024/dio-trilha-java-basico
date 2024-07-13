
package desafio.bootcamp;
// importando os pacotes e classes criados
import desafio.bootcamp.dominio.cursos.Curso;
import desafio.bootcamp.dominio.mentorias.Mentoria;

import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();
        
        curso.setTitulo("Curso de Java");
        mentoria.setTitulo("Mentoria Básica de Java");
        curso.setDescricao("Curso de fundamentos de POO");
        mentoria.setDescricao("Fazendo um bootcamp em POO");
        curso.setCargaHoraria(2);
        mentoria.setData(LocalDate.now());
        
        // Imprimindo para teste da toString()
        
        System.out.println(curso.toString());
        System.out.println("--------------------");
        System.out.println(mentoria.toString());
        System.out.println("--------------------");
        System.out.println("Xp do Curso -> "+curso.calcularXp());
        System.out.println("--------------------");
        System.out.println("Xp da Mentoria -> "+ mentoria.calcularXp());
    }
    
}
