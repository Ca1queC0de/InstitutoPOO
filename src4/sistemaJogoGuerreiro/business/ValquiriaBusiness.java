package sistemaJogoGuerreiro.business;

import sistemaJogoGuerreiro.Valquiria;

public class ValquiriaBusiness extends GuerreiroBusiness {

	public Valquiria cadastrarValquiria() {
		
		System.out.println("\nCriando Valquíria...\n");
        System.out.print("Nome da Valquíria: ");
        String nome = scanner.next();
        System.out.print("Força: ");
        int forca = scanner.nextInt();
        System.out.print("Vida: ");
        int vidas = scanner.nextInt();
        System.out.print("Dano do Machado: ");
        int danoMachado = scanner.nextInt();
        System.out.print("Raio de Alcance do Machado: ");
        int raioAlcance = scanner.nextInt();
        
        Valquiria valquiria = new Valquiria(nome, vidas);
        
        valquiria.setForca(forca);
        valquiria.setDanoMachado(danoMachado);
        valquiria.setRaioAlcance(raioAlcance);
        
        return valquiria;
		
	}
	
}
