import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição Curso Java");
        curso.setCargaHoraria(4);



//        System.out.println(mentoria);
//        System.out.println(curso);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev devMichael = new Dev();
        devMichael.setNome("Michael");
        devMichael.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devMichael.getConteudoInscritos());
        devMichael.progredir();
        System.out.println("-");
        System.out.println("Conteúdos concluídos: " + devMichael.getConteudoConcluidos());
        System.out.println("Conteúdos restantes: " + devMichael.getConteudoInscritos());
        System.out.println("XP: "+ devMichael.calcularTotalXp());

        System.out.println("-----------------");
        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devLuiz.getConteudoInscritos());
        devLuiz.progredir();
        devLuiz.progredir();

        System.out.println("-");
        System.out.println("Conteúdos concluídos: " + devLuiz.getConteudoConcluidos());
        System.out.println("Conteúdos restantes: " + devLuiz.getConteudoInscritos());
        System.out.println("XP: " + devLuiz.calcularTotalXp());


    }
}
