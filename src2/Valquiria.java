package sistemaJogoGuerreiro;

//Essa classe herda atributos de Guerreiro por isso usa o "extends"
public class Valquiria extends Guerreiro{

	//Nesse construtor encontramos o "super" que pega os atributos obrigatórios da classe "Geurreiro"
	public Valquiria(String nome, int vidas) {
		super(nome, vidas);
	}

	// Declaração das variáveis
	private int danoMachado;
	private int raioAlcance;
	
	// Métodos para definir e pegar valores
	public int getDanoMachado() {
		return danoMachado;
	}
	public void setDanoMachado(int danoMachado) {
		this.danoMachado = danoMachado;
	}
	public int getRaioAlcance() {
		return raioAlcance;
	}
	public void setRaioAlcance(int raioAlcance) {
		this.raioAlcance = raioAlcance;
	}
	
}
