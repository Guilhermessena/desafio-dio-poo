import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		// Criação dos objetos

		Curso cursoPoo = new Curso();
		cursoPoo.setTitulo("POO");
		cursoPoo.setDescricao("Curso de Paradigma de Programação Orientada a Objeto");
		cursoPoo.setCargaHoraria(40);

		Curso cursoJpa = new Curso();
		cursoPoo.setTitulo("Curso Jpa");
		cursoPoo.setDescricao("Curso de persistência de dados comm Jpa");
		cursoPoo.setCargaHoraria(40);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Spring Framework");
		mentoria.setDescricao(
				"Falar sobre os módulos presentes no projeto Spring Framework e sua importância para desenvolver na plataforma Spring");
		mentoria.setData(LocalDate.now());

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp POO");
		bootcamp.setDescricao(
				"Bootcamp de Programação Orientada à Objetos com mentorias de Framworks essenciais no desenvolvimento Java");
		bootcamp.getConteudos().add(cursoPoo);
		bootcamp.getConteudos().add(cursoJpa);
		bootcamp.getConteudos().add(mentoria);

		Dev devGuilherme = new Dev();
		devGuilherme.setNome("Guilherme");
		devGuilherme.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos guilherme: " + devGuilherme.getConteudosInscritos());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		devGuilherme.progredir();
		devGuilherme.progredir();
		System.out.println("Conteudos inscritos guilherme: " + devGuilherme.getConteudosInscritos());
		System.out.println("Conteudos concluidos guilherme: " + devGuilherme.getConteudosConcluidos());
		System.out.println("XP: " + devGuilherme.calcularTotalXp());

		System.out.println("------------------------------");

		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos joao: " + devJoao.getConteudosInscritos());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		devJoao.progredir();
		System.out.println("Conteudos inscritos joao: " + devJoao.getConteudosInscritos());
		System.out.println("Conteudos concluidos joao: " + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());
	}

}
