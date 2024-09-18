package sistemaJogoGuerreiro.business;

import sistemaJogoGuerreiro.Espadachim;

public class EspadachimBusiness extends GuerreiroBusiness {
	
	public Espadachim cadastrarEspadachim() {
		
		System.out.println("\nCriando Espadachim...\n");
        System.out.print("Nome do Espadachim: ");
        String nome = scanner.next();
        System.out.print("Força: ");
        int forca = scanner.nextInt();
        System.out.print("Vida: ");
        int vidas = scanner.nextInt();
        System.out.print("Habilidade com espadas: ");
        int habilidadeEspadas = scanner.nextInt();
        System.out.print("Velocidade: ");
        int velocidade = scanner.nextInt();
        
        Espadachim espadachim = new Espadachim(nome, vidas);
        
        espadachim.setForca(forca);
        espadachim.setHabilidadeEspada(habilidadeEspadas);
        espadachim.setVelocidade(velocidade);
		
        return espadachim;
        
	}

}
