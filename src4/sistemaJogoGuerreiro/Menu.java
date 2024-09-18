package sistemaJogoGuerreiro;

public abstract class Menu {

	/* O método abaixo é do tipo void pois não retorna nada
	Em algumas partes do código foi utilizado o "\n" para pular linha */
	public static void mostrarMenu() {
		System.out.println("\n [1] Criar Espadachim\n"
				+ " [2] Criar Arqueiro\n"
				+ " [3] Criar Mago\n"
				+ " [4] Criar Valquíria\n"
				+ " [5] Criar Templário\n"
				+ " [6] Listar Espadachim\n"
				+ " [7] Listar Arqueiro\n"
				+ " [8] Listar Mago\n"
				+ " [9] Listar Valquíria\n"
				+ "[10] Listar Templário\n"
				+ " [0] Sair\n");
	}
	
}