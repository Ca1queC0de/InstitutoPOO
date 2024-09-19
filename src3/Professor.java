package br.edu.ifs.academico;

public class Professor extends Pessoa {
	
	public Professor(String nome) {
		super(nome);
	}

	private String formacao;

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	@Override
	public String toString() {
		return "Professor [formacao=" + formacao + ", toString()=" + super.toString() + "]";
	}
	
}
