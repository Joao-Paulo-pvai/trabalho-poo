package br.edu.ifpr.trabalho.poo.modelo;

public final class Aluno extends Pessoa{
	private int anoIngresso;
	
	private Matricula matricula;

	@Override
	public void imprimirDados() {
		
		
	}
	
Aluno(){
	
}

Aluno(int anoIngresso, Matricula matricula){
	super();
	this.anoIngresso = anoIngresso;
	this.matricula = matricula;
}

public int getAnoIngresso() {
	return anoIngresso;
}

public void setAnoIngresso(int anoIngresso) {
	this.anoIngresso = anoIngresso;
}

public Matricula getMatricula() {
	return matricula;
}

public void setMatricula(Matricula matricula) {
	this.matricula = matricula;
}



}
