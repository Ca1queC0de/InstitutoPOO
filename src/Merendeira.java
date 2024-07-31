package br.edu.ifs.academico;

public class Merendeira extends Pessoa {

	public Merendeira(String nome) {
		super(nome);
	}
	
	private String especialidade;
	private String vulgo;
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getVulgo() {
		return vulgo;
	}
	public void setVulgo(String vulgo) {
		this.vulgo = vulgo;
	}
	
}
