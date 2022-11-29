package br.edu.ifpr.trabalho.poo.implementacao;

import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.conexao.Conexao;
import br.edu.ifpr.trabalho.poo.interfaces.IBuscaDeDados;
import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Campus;
import br.edu.ifpr.trabalho.poo.modelo.Curso;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class BuscaDados implements IBuscaDeDados{

	public ArrayList<Matricula> buscarMatriculasAtivas() {
		MatriculaDAO matAt = new MatriculaDAO();
		return matAt.listarAtivas();
	}

	public ArrayList<Matricula> buscarTodasMatriculas() {
		MatriculaDAO mat = new MatriculaDAO();
		return mat.listar();
	}

	public ArrayList<Aluno> buscarAlunos() {
		AlunoDAO al = new AlunoDAO();
		return al.listar();
	}

	public ArrayList<Turma> buscarTurmas() {
		TurmaDAO tu = new TurmaDAO();
		return tu.listar();
	}

	public ArrayList<Professor> buscarProfessores() {
		ProfessorDAO pr = new ProfessorDAO();
		return pr.listar();
	}

	public ArrayList<Disciplina> buscarDisciplinas() {
		DisciplinaDAO di = new DisciplinaDAO();
		return di.listar();
	}

	public ArrayList<Curso> buscarCursos() {
		CursoDAO cur= new CursoDAO();
		return cur.listar();
	}

	public ArrayList<Campus> buscarCampi() {
		CampusDAO ca = new CampusDAO();
		return ca.listar();
	}

}
