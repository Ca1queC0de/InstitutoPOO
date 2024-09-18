package sistemaJogoGuerreiro;

//Essa classe herda atributos de Guerreiro por isso usa o "extends"
public class Arqueiro extends Guerreiro {

	//Nesse construtor encontramos o "super" que pega os atributos obrigatórios da classe "Geurreiro"
	public Arqueiro(String nome, int vidas) {
		super(nome, vidas);
	}
	
	// Declaração das variáveis
	private int habilidadeArco;
	private int alcance;
	
	// Métodos para definir e pegar valores
	public int getHabilidadeArco() {
		return habilidadeArco;
	}
	public void setHabilidadeArco(int habilidadeArco) {
		this.habilidadeArco = habilidadeArco;
	}
	public int getAlcance() {
		return alcance;
	}
	public void setAlcance(int alcance) {
		this.alcance = alcance;
	}
	
	@Override
	public String toString() {
		return "Arqueiro [habilidadeArco=" + habilidadeArco + ", alcance=" + alcance + ", toString()="
				+ super.toString() + "]";
	}
	
}