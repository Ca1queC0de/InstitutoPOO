package sistemaJogoGuerreiro;

//Essa classe herda atributos de Guerreiro por isso usa o "extends"
public class Templario extends Guerreiro{

	//Nesse construtor encontramos o "super" que pega os atributos obrigatórios da classe "Geurreiro"
	public Templario(String nome, int vidas) {
		super(nome, vidas);
	}

	// Declaração das variáveis
	private int nivelArmadura;
	private int velocidadeCavalo;
	
	// Métodos para definir e pegar valores
	public int getNivelArmadura() {
		return nivelArmadura;
	}
	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}
	public int getVelocidadeCavalo() {
		return velocidadeCavalo;
	}
	public void setVelocidadeCavalo(int velocidadeCavalo) {
		this.velocidadeCavalo = velocidadeCavalo;
	}
	
	@Override
	public String toString() {
		return "Templario [nivelArmadura=" + nivelArmadura + ", velocidadeCavalo=" + velocidadeCavalo + ", toString()="
				+ super.toString() + "]";
	}
	
}
