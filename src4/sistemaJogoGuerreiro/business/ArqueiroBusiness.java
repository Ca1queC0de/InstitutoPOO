package sistemaJogoGuerreiro.business;

import sistemaJogoGuerreiro.Arqueiro;

public class ArqueiroBusiness extends GuerreiroBusiness {

	 public Arqueiro cadastrarArqueiro() {
		 
		 System.out.println("\nCriando Arqueiro...\n");
	     System.out.print("Nome do Arqueiro: ");
	     String nome = scanner.next();
	     System.out.print("Força: ");
	     int forca = scanner.nextInt();
	     System.out.print("Vida: ");
	     int vidas = scanner.nextInt();
	     System.out.print("Habilidade com arcos: ");
	     int habilidadeArco = scanner.nextInt();
	     System.out.print("Alcance: ");
	     int alcance = scanner.nextInt();
	     
	     Arqueiro arqueiro = new Arqueiro(nome, vidas);
	     
	     arqueiro.setForca(forca);
	     arqueiro.setHabilidadeArco(habilidadeArco);
	     arqueiro.setAlcance(alcance);
		
	     return arqueiro;
	     
	 }
     
}
