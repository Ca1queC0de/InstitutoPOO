package br.edu.ifs.academico;

public class Menu {

	public Menu() {
		
	}
	
	public void imprimirMenu() {
		System.out.println("::::::: SISTEMA ACADÊMICO IFS :::::::\n"
				+ ":::::::::::     MENU      :::::::::::\n\n"
				+ " [1] Cadastrar Aluno\n"
				+ " [2] Imprimir Lista Alunos\n"
				+ " [3] Cadastrar Professor\n"
				+ " [4] Imprimir Lista professor\n"
				+ " [5] Cadastrar Tecnico\n"
				+ " [6] Imprimir Lista Técnicos\n"
				+ " [7] Cadastrar Pedagogo\n"
				+ " [8] Imprimir Lista Pedagogos\n"
				+ " [9] Cadastrar Psicólogo\n"
				+ "[10] Imprimir Lista Psicólogos\n"
				+ "[11] Cadastrar Merendeira\n"
				+ "[12] Imprimir Lista Merendeiras\n"
				+ "[13] Cadastrar Vigilante\n"
				+ "[14] Imprimir Lista Vigilantes\n"
				+ " [0] Sair\n\n"
				+ ":::::::::::::::::::::::::::::::::::::\n\n");
		System.out.print("SELECIONE UMA OPÇÃO: ");
	}

}
