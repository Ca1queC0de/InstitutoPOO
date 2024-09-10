package sistemaJogoGuerreiro;

//Essa classe herda atributos de Guerreiro por isso usa o "extends"
public class Mago extends Guerreiro {
	
	//Nesse construtor encontramos o "super" que pega os atributos obrigatórios da classe "Geurreiro"
	public Mago(String nome, int vidas) {
		super(nome, vidas);
	}
	
	// Declaração das variáveis
	private String tipoFeitico;
	private int nivelMagia;
	
	// Métodos para definir e pegar valores
	public String getTipoFeitico() {
		return tipoFeitico;
	}
	public void setTipoFeitico(String tipoFeitico) {
		this.tipoFeitico = tipoFeitico;
	}
	public int getNivelMagia() {
		return nivelMagia;
	}
	public void setNivelMagia(int nivelMagia) {
		this.nivelMagia = nivelMagia;
	}
	
}
