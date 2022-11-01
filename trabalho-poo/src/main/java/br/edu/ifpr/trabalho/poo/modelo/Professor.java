package br.edu.ifpr.trabalho.poo.modelo;

public final class Professor extends Pessoa{
	private String siape;

	@Override
	public void imprimirDados() {
		
		
	}
	
Professor(){
	
}

Professor(String siape){
	super();
	this.siape = siape;
}

public String getSiape() {
	return siape;
}

public void setSiape(String siape) {
	this.siape = siape;
}

}
