package br.edu.ifpr.trabalho.poo.modelo;

public class Curso {
	private String nome;
	private String duracao;
	private String modalidade;
	
	private Turma turma;
	
Curso(){
	
}

Curso(String nome, String duracao, String modalidade, Turma turma){
	super();
	this.nome = nome;
	this.duracao = duracao;
	this.modalidade = modalidade;
	this.turma = turma;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getDuracao() {
	return duracao;
}

public void setDuracao(String duracao) {
	this.duracao = duracao;
}

public String getModalidade() {
	return modalidade;
}

public void setModalidade(String modalidade) {
	this.modalidade = modalidade;
}

public Turma getTurma() {
	return turma;
}

public void setTurma(Turma turma) {
	this.turma = turma;
}

}
