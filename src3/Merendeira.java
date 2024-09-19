package br.edu.ifs.academico;

public class Merendeira extends Pessoa {

	public Merendeira(String nome) {
		super(nome);
	}
	
	private String especialidadePrato;
	private String vulgo;

	public String getEspecialidadePrato() {
		return especialidadePrato;
	}
	public void setEspecialidadePrato(String especialidadePrato) {
		this.especialidadePrato = especialidadePrato;
	}
	public String getVulgo() {
		return vulgo;
	}
	public void setVulgo(String vulgo) {
		this.vulgo = vulgo;
	}
	
}
