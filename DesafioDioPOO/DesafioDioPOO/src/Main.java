import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria");
        mentoria.setData(LocalDate.now());

        curso1.setCargaHoraria(25);
        curso1.setDescricao("Descrição do 1º curso");
        curso1.setTitulo("Introdução ao Java");

        curso2.setCargaHoraria(30);
        curso2.setDescricao("Descrição do 2º curso");
        curso2.setTitulo("Intrudução POO");

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);

        System.out.println(devMatheus.getNome() + " está inscrito nos seguintes conteudos: \n" + devMatheus.getConteudoInscritos() + "\n");
        
        devMatheus.progredir();

        System.out.println(devMatheus.getNome() + " já concluiu os seguintes conteudos: \n" + devMatheus.getConteudosConcluidos() + "\n");

        System.out.println(" XP de " +  devMatheus.getNome() + ": " + devMatheus.calcularTotalXp() + "\n");


        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println(devJoao.getNome() + " está inscrito nos seguintes conteudos: \n" + devJoao.getConteudoInscritos() + "\n");

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();

        System.out.println(devJoao.getNome() + " já concluiu nos seguintes conteudos: \n" + devJoao.getConteudosConcluidos() + "\n");

        System.out.println(" XP de " +  devJoao.getNome() + ": " + devJoao.calcularTotalXp() + "\n");







    }
}
