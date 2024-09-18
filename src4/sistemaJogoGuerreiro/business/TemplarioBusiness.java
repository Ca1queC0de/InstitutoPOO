package sistemaJogoGuerreiro.business;

import sistemaJogoGuerreiro.Templario;

public class TemplarioBusiness extends GuerreiroBusiness {

	public Templario cadastrarTemplario() {
		
		  System.out.println("\nCriando Templário...\n");
          System.out.print("Nome do Templário: ");
          String nome = scanner.next();
          System.out.print("Força: ");
          int forca = scanner.nextInt();
          System.out.print("Vida: ");
          int vidas = scanner.nextInt();
          System.out.print("Nível da Armadura: ");
          int nivelArmadura = scanner.nextInt();
          System.out.print("Velocidade do Cavalo: ");
          int velocidadeCavalo = scanner.nextInt();
          
          Templario templario = new Templario(nome, vidas);
          
          templario.setForca(forca);
          templario.setNivelArmadura(nivelArmadura);
          templario.setVelocidadeCavalo(velocidadeCavalo);
          
		  return templario;
		
	}
	
}
