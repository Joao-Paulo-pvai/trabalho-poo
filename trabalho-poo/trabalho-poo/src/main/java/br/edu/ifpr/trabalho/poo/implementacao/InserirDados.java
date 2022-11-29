package br.edu.ifpr.trabalho.poo.implementacao;

import java.sql.SQLException;

import br.edu.ifpr.trabalho.poo.conexao.Conexao;
import br.edu.ifpr.trabalho.poo.interfaces.IInserirDados;
import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Campus;
import br.edu.ifpr.trabalho.poo.modelo.Curso;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class InserirDados implements IInserirDados {

	public void salvarAluno(Aluno aluno) {
		AlunoDAO al = new AlunoDAO();
		al.salvarAluno(aluno);
	}

	public void salvarProfessor(Professor professor) {
		ProfessorDAO pr = new ProfessorDAO();
        pr.salvarProfessor(professor);
	}

	public void salvarCurso(Curso curso) {
		CursoDAO cur = new CursoDAO();
		cur.salvarCurso(curso);
	}

	public void salvarTurma(Turma turma) {
		TurmaDAO tu = new TurmaDAO();
		tu.salvarTurma(turma);
	}

	public void salvarDisciplina(Disciplina disciplina) {
		DisciplinaDAO di = new DisciplinaDAO();
		di.salvarDisciplina(disciplina);
	}

	public void salvarMatricula(Matricula matricula) {
		// TODO Auto-generated method stub

	}

	public void salvarCampus(Campus campus) {
		CampusDAO ca = new CampusDAO();
		ca.salvarCampus(campus);
	}

}
