
package desafio.bootcamp;
// importando os pacotes e classes criados
import desafio.bootcamp.bootcamp.Bootcamp;
import desafio.bootcamp.dev.Dev;
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
        
        // Criação do BootCamp e adição do curso e Mentoria
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java");
        bootcamp.setDescricao("Aprendendo mais sobre Java com muita prática");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);
        
        // Criação do Dev
        Dev devJose = new Dev();
        devJose.setNome("José da Silva");
        devJose.inscreverBootcamp(bootcamp);
        
        Dev devCamila = new Dev();
        devCamila.setNome("Cami-la");
        devCamila.inscreverBootcamp(bootcamp);
        
        // Ver os conteúdos Inscritos
        System.out.println("Dev José - Conteúdos inscritos-> "+devJose.getConteudosInscritos());
        System.out.println("Dev Camila - Conteúdos inscritos-> "+devCamila.getConteudosInscritos());
        
        // Ver os conteúdos Concluídos
        System.out.println("Dev José\nConteúdos Concluídos\n"+ devJose.getConteudosConcluidos());
        System.out.println("Dev Camila\nConteúdos Concluídos\n"+ devCamila.getConteudosConcluidos());
        
        // José conclui todos os cursos e mentoria Camila apenas Mentoria
        devJose.progredir();
        devJose.progredir();
        devCamila.progredir();
        if(devJose.getConteudosInscritos().isEmpty()){
            System.out.println("Parabéns José\n BootCamp Concluído\n"+devJose.getConteudosConcluidos());
            System.out.println("XP total -> "+devJose.calcularTotalXp());
        }
        System.out.println("Dev Camila\nConteúdos Concluídos\n"+ devCamila.getConteudosConcluidos());
        System.out.println("XP Parcial -> "+devCamila.calcularTotalXp());
    }
}
