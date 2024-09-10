package sistemaJogoGuerreiro;

// Essa classe herda atributos de Guerreiro por isso usa o "extends"
public class Espadachim extends Guerreiro {
	
	//Nesse construtor encontramos o "super" que pega os atributos obrigatórios da classe "Geurreiro"
	public Espadachim(String nome, int vidas) {
		super(nome, vidas);
	}
	
	// Declaração das variáveis
	private int habilidadeEspada;
	private int velocidade;

	// Métodos para definir e pegar valores
	public int getHabilidadeEspada() {
		return habilidadeEspada;
	}

	public void setHabilidadeEspada(int habilidadeEspada) {
		this.habilidadeEspada = habilidadeEspada;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
}
