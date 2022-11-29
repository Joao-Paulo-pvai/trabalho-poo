package br.edu.ifpr.trabalho.poo.implementacao;

import java.util.Scanner;

import br.edu.ifpr.trabalho.poo.interfaces.ILeituraDeDados;
import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Campus;
import br.edu.ifpr.trabalho.poo.modelo.Curso;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class LeituraDados implements ILeituraDeDados{

	public Aluno lerDadosAluno() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o nome do aluno: ");
		String nome = teclado.nextLine();
		System.out.println("Informe o cpf: do aluno: ");
		String cpf = teclado.nextLine();
		System.out.println("Informe o telefone do aluno: ");
		String telefone = teclado.nextLine();
		System.out.println("Informe o endereço do aluno: ");
		String endereco = teclado.nextLine();
		System.out.println("Informe a data de nascimento do aluno: ");
		String dataNascimento = teclado.nextLine();
		System.out.println("Informe o ano de ingresso do aluno: ");
		int anoIngresso = teclado.nextInt();
		Aluno aluno = new Aluno(nome, cpf, telefone, endereco, dataNascimento, anoIngresso);
		return aluno;
	}

	public Professor lerDadosProfessor() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o nome do professor: ");
		String nome = teclado.nextLine();
		System.out.println("Informe o cpf do professor: ");
		String cpf = teclado.nextLine();
		System.out.println("Informe o telefone do professor: ");
		String telefone = teclado.nextLine();
		System.out.println("Informe o endereço do professor: ");
		String endereco = teclado.nextLine();
		System.out.println("Informe a data de nascimento do professor: ");
		String dataNascimento = teclado.nextLine();		
		System.out.println("Informe o siape do professor: ");
		String siape = teclado.nextLine();
		Professor professor = new Professor(nome, cpf, telefone, endereco, dataNascimento, siape);
		return professor;
	}

	public Curso lerDadosCurso() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o nome do curso: ");
		String nome = teclado.nextLine();
		System.out.println("Informe a duração do curso: ");
		String duracao = teclado.nextLine();
		System.out.println("Informe a modalidade do curso: ");
		String modalidade = teclado.nextLine();
		Campus campus = new Campus();
		Curso curso = new Curso(nome, duracao, modalidade, campus);
		return curso;
	}

	public Turma lerDadosTurma() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o nome:");
		String nome = teclado.nextLine();
		System.out.println("Informe o número mínimo");
		int numeroMinimo = teclado.nextInt();
		System.out.println("Informe o ano ingresso");
		int anoIngresso = teclado.nextInt();
		Curso curso = new Curso();
		Turma turma = new Turma(null, 0, 0, null);
		return turma;
	}

	public Turma lerDadosTurma(Curso curso) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o nome:");
		String nome = teclado.nextLine();
		System.out.println("Informe o número mínimo");
		int numeroMinimo = teclado.nextInt();
		System.out.println("Informe o ano ingresso");
		int anoIngresso = teclado.nextInt();
		Turma turma = new Turma(nome, numeroMinimo, anoIngresso, curso);
		return turma;
	}

	public Disciplina lerDadosDisciplina(Professor professor, Turma turma) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o nome da disciplina: ");
		String nome = teclado.nextLine();		
		System.out.println("Informe a carga horária da disciplina: ");
		int cargaHoraria = teclado.nextInt();		
		Disciplina disciplina = new Disciplina(nome, cargaHoraria, professor, turma);
		return disciplina;
	}

	public Matricula lerDadosMatricula() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o R.A. da matrícula: ");
		String ra = teclado.nextLine();
		System.out.println("Informe a data da matrícula: ");
		String data = teclado.nextLine();
		System.out.println("Informe a situação da matrícula: ");
		boolean situacao = teclado.nextBoolean();
		Aluno aluno = new Aluno();
		Turma turma = new Turma();
		Matricula matricula = new Matricula();
		return matricula;
	}

	public Matricula lerDadosMatricula(Aluno aluno, Turma turma) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o ra:");
		String ra = teclado.nextLine();
		System.out.println("Informe a data");
		String data = teclado.nextLine();
		System.out.println("Informe a situação");
		boolean situacao = teclado.nextBoolean();
		Matricula matricula = new Matricula(ra, data, situacao, aluno, turma);
		return matricula;
	}

	public Campus lerDadosCampus() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o nome do campus:");
		String nome = teclado.nextLine();
		System.out.println("Informe o endereço do campus:");
		String endereco = teclado.nextLine();
		System.out.println("Informe a cidade do campus:");
		String cidade = teclado.nextLine();
		Campus campus = new Campus(nome, endereco, cidade);
		return campus;
	}
	
}
