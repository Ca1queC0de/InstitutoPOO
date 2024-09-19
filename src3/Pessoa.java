package br.edu.ifs.academico;

public class Pessoa {

	//atributos
	private String nome;
	private String localNascimento;
	private String dataNascimento;
	private String endereco;
	private int idade;
	private char sexo;
	
	public Pessoa(String nome) {
		this.setNome(nome);
	}
	
	//getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocalNascimento() {
		return localNascimento;
	}
	public void setLocalNascimento(String localNascimento) {
		this.localNascimento = localNascimento;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", localNascimento=" + localNascimento + ", dataNascimento=" + dataNascimento
				+ ", endereco=" + endereco + ", idade=" + idade + ", sexo=" + sexo + ", toString()=" + super.toString() + "]";
	}	
	
	
	
}
