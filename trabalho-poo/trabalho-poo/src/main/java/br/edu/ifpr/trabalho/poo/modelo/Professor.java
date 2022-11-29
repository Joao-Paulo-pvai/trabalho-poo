package br.edu.ifpr.trabalho.poo.modelo;

public final class Professor extends Pessoa{
	private String siape;

	@Override
	public void imprimirDados() {
				
	}
	
Professor(){
	
}

public Professor(String nome, String cpf, String telefone, String endereco, String dataNascimento, String siape){
	super(nome, cpf, telefone, endereco, dataNascimento);
	this.siape = siape;
}

public String getSiape() {
	return siape;
}

public void setSiape(String siape) {
	this.siape = siape;
}

}
