package br.edu.ifpr.trabalho.poo.modelo;

public class Campus {
	private String nome;
	private String endereco;
	private String cidade;
	
	private Curso curso;
	
Campus(){
	
}

Campus(String nome, String endereco, String cidade, Curso curso){
	super();
	this.nome = nome;
	this.endereco = endereco;
	this.cidade = cidade;
	this.curso = curso;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public String getCidade() {
	return cidade;
}

public void setCidade(String cidade) {
	this.cidade = cidade;
}

public Curso getCurso() {
	return curso;
}

public void setCurso(Curso curso) {
	this.curso = curso;
}

}
