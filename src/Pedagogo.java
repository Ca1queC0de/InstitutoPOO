package br.edu.ifs.academico;

public class Pedagogo extends Pessoa {

	public Pedagogo(String nome) {
		super(nome);
	}
	
	private String experiencia;
	private String faixaClasse;
	
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	public String getFaixaClasse() {
		return faixaClasse;
	}
	public void setFaixaClasse(String faixaClasse) {
		this.faixaClasse = faixaClasse;
	}
	
}
