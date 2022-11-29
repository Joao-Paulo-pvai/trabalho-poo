package br.edu.ifpr.trabalho.poo.modelo;

public final class Aluno extends Pessoa{
	private int anoIngresso;

	@Override
	public void imprimirDados() {
				
	}
	
public Aluno(){
	
}

public Aluno(String nome, String cpf, String telefone, String endereco, String dataNascimento, int anoIngresso){
	super(nome, cpf, telefone, endereco, dataNascimento);
	this.anoIngresso = anoIngresso;
}

public int getAnoIngresso() {
	return anoIngresso;
}

public void setAnoIngresso(int anoIngresso) {
	this.anoIngresso = anoIngresso;
}

}
