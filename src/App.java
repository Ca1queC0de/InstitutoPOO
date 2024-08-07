package br.edu.ifs.academico;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		Pessoa p = new Pessoa(null);
		Menu menu = new Menu();
		
		menu.imprimirMenu();
		
		int opcao = scanner.nextInt();
		
		while (opcao != 0) {
			
			switch (opcao) {
			case 1:
				System.out.println("Cadastrando Aluno...\n");
				break;
			case 2:
				System.out.println("Imprimindo Lista Alunos...\n");
				break;
			case 3:
				System.out.println("Cadastrando Professor...\n");
				break;
			case 4:
				System.out.println("Imprimindo Lista Professores...\n");
				break;
			case 5:
				System.out.println("Cadastrando Técnico...\n");
				break;
			case 6:
				System.out.println("Imprimindo Lista Técnicos...\n");
				break;
			case 7:
				System.out.println("Cadastrando Pedagogo...\n");
				break;
			case 8:
				System.out.println("Imprimindo Lista Pedagogos...\n");
				break;
			case 9:
				System.out.println("Cadastrando Psicólogo...\n");
				break;
			case 10:
				System.out.println("Imprimindo Lista Psicólogos...\n");
				break;
			case 11:
				System.out.println("Cadastrando Merendeira...\n");
				break;
			case 12:
				System.out.println("Imprimindo Lista Merendeiras...\n");
				break;
			case 13:
				System.out.println("Cadastrando Vigilante...\n");
				break;
			case 14:
				System.out.println("Imprimindo Lista Vigilantes...\n");
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}
			
			menu.imprimirMenu();
			opcao = scanner.nextInt();
		}
		
		
	}

}
