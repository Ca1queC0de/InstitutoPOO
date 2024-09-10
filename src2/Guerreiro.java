package sistemaJogoGuerreiro;

public class Guerreiro {

	// Declaração das variáveis
	private String nome;
	private int forca;
	private int vidas;
	
	// Construtor com os atributos que são obrigatórios
	public Guerreiro(String nome, int vidas) {
		this.setNome(nome);
		this.setVidas(vidas);
	}
	
	// Métodos para definir e pegar valores
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public int getVidas() {
		return vidas;
	}
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	
}
