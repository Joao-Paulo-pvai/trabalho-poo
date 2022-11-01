package br.edu.ifpr.trabalho.poo.modelo;

public class Turma {
	private String nome;
	private int numeroMinimo;
	private int anoIngresso;
	
	private Disciplina disciplina;
	private Matricula matricula;
	
Turma(){
	
}

Turma(String nome, int numeroMinimo, int anoIngresso, Disciplina disciplina, Matricula matricula){
	super();
	this.nome = nome;
	this.numeroMinimo = numeroMinimo;
	this.anoIngresso = anoIngresso;
	this.disciplina = disciplina;
	this.matricula = matricula;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getNumeroMinimo() {
	return numeroMinimo;
}

public void setNumeroMinimo(int numeroMinimo) {
	this.numeroMinimo = numeroMinimo;
}

public int getAnoIngresso() {
	return anoIngresso;
}

public void setAnoIngresso(int anoIngresso) {
	this.anoIngresso = anoIngresso;
}

public Disciplina getDisciplina() {
	return disciplina;
}

public void setDisciplina(Disciplina disciplina) {
	this.disciplina = disciplina;
}

public Matricula getMatricula() {
	return matricula;
}

public void setMatricula(Matricula matricula) {
	this.matricula = matricula;
}

}
