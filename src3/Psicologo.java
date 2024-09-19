package br.edu.ifs.academico;

public class Psicologo extends Pessoa {

	public Psicologo(String nome) {
		super(nome);
	}
	
	private String crp;
	private String especialidade;
	private String alocacao;
	
	public String getCrp() {
		return crp;
	}
	public void setCrp(String crp) {
		this.crp = crp;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getAlocacao() {
		return alocacao;
	}
	public void setAlocacao(String alocacao) {
		this.alocacao = alocacao;
	}
	
}
