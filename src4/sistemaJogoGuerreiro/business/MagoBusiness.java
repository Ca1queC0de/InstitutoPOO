package sistemaJogoGuerreiro.business;

import sistemaJogoGuerreiro.Mago;

public class MagoBusiness extends GuerreiroBusiness {

	public Mago cadastrarMago() {
		
		System.out.println("\nCriando Mago...\n");
        System.out.print("Nome do Mago: ");
        String nome = scanner.next();
        System.out.print("Força: ");
        int forca = scanner.nextInt();
        System.out.print("Vida: ");
        int vidas = scanner.nextInt();
        System.out.print("Tipo do Feitiço: ");
        String tipoFeitico = scanner.next();
        System.out.print("Nível da Magia: ");
        int nivelMagia = scanner.nextInt();
        
        Mago mago = new Mago(nome, vidas);
        
        mago.setForca(forca);  
        mago.setTipoFeitico(tipoFeitico);
        mago.setNivelMagia(nivelMagia);
        
        return mago;
		
	}
	
}
