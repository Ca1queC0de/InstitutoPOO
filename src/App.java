package br.edu.ifs.academico;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	
	static Scanner scanner = new Scanner(System.in);

	static String nome;
	static char sexo;
	static String dataNascimento;
	static String localNascimento;
	static String curso;
	static String formacao;
	static String periodoAtual;
	static String instituicaoVinculada;

	public static void main(String[] args) {
		
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		ArrayList<Professor> professores = new ArrayList<Professor>();
		ArrayList<Tecnico> tecnicos = new ArrayList<Tecnico>();
		ArrayList<Psicologo> psicologos = new ArrayList<Psicologo>();
		ArrayList<Pedagogo> pedagogos = new ArrayList<Pedagogo>();
		ArrayList<Vigilante> vigilantes = new ArrayList<Vigilante>();
		ArrayList<Merendeira> merendeiras = new ArrayList<Merendeira>();
		
		Menu menu = new Menu();
		menu.imprimirMenu();
		
		int opcao = scanner.nextInt();
		
		while (opcao != 0) {
			
			switch (opcao) {
			case 1:
				System.out.println("Cadastrando Aluno: ");
				cadastrarAluno(alunos);
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
	
	private static void cadastrarAluno(ArrayList<Aluno> alunos) {
		System.out.print("Nome do Aluno: ");
		nome = scanner.next();
		System.out.print("Curso: ");
		System.out.print("Sexo: ");
		sexo = scanner.next().toUpperCase().charAt(0);
		System.out.print("Local de Nascimento: ");
		localNascimento = scanner.next();
		System.out.print("Data de Nascimento: ");
		dataNascimento = scanner.next();
		/*System.out.print("Nota 1: ");
		nota1 = scanner.nextInt();
		System.out.print("Nota 2: ");
		
		Aluno aluno = new Aluno(nome) {
			aluno.set
		}*/
		
	}

}
