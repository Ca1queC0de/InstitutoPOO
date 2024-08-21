package br.edu.ifs.academico;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		String nome;
		String localNascimento;
		String dataNascimento;
		char sexo;
		
		Aluno[] listaAluno = new Aluno[10];
		Merendeira[] listaMerendeira = new Merendeira[10];
		Pedagogo[] listaPedagogo = new Pedagogo[10];
		Professor[] listaProfessor = new Professor[10];
		Psicologo[] listaPsicologo = new Psicologo[10];
		Tecnico[] listaTecnico = new Tecnico[10];
		Vigilante[] listaVigilante = new Vigilante[10];
		
		int contAluno = 0;
		int contMerendeira = 0;
		int contPedagogo = 0;
		int contProfessor = 0;
		int contPsicologo = 0;
		int contTecnico = 0;
		int contVigilante = 0;
		
		Scanner scanner = new Scanner(System.in);

		Pessoa p = new Pessoa(null);
		Menu menu = new Menu();
		
		menu.imprimirMenu();
		
		int opcao = scanner.nextInt();
		
		while (opcao != 0) {
			
			switch (opcao) {
			case 1:
				System.out.println("Cadastrando Aluno...");
				System.out.print("Nome do aluno: ");
				nome = scanner.next();
				Aluno aluno = new Aluno(nome);
				System.out.print("Local de Nascimento: ");
				localNascimento = scanner.next();
				aluno.setLocalNascimento(localNascimento);
				System.out.print("Sexo: ");
				sexo = scanner.next().toUpperCase().charAt(0);
				aluno.setSexo(sexo);
				listaAluno[contAluno] = aluno;
				contAluno++;
				break;
			case 2:
				System.out.println("Imprimindo Lista Alunos...\n");
				break;
			case 3:
				System.out.println("Cadastrando Professor...");
				System.out.print("Nome do professor: ");
				nome = scanner.next();
				Professor professor = new Professor(nome);
				System.out.print("Local de Nascimento: ");
				localNascimento = scanner.next();
				professor.setLocalNascimento(localNascimento);
				System.out.print("Sexo: ");
				sexo = scanner.next().toUpperCase().charAt(0);
				professor.setSexo(sexo);
				listaProfessor[contProfessor] = professor;
				contProfessor++;
				break;
			case 4:
				System.out.println("Imprimindo Lista Professores...\n");
				break;
			case 5:
				System.out.println("Cadastrando Técnico...\n");
				System.out.print("Nome do Técnico: ");
				nome = scanner.next();
				Tecnico tecnico = new Tecnico(nome);
				System.out.print("Local de Nascimento: ");
				localNascimento = scanner.next();
				tecnico.setLocalNascimento(localNascimento);
				System.out.print("Sexo: ");
				sexo = scanner.next().toUpperCase().charAt(0);
				tecnico.setSexo(sexo);
				listaTecnico[contTecnico] = tecnico;
				contTecnico++;
				break;
			case 6:
				System.out.println("Imprimindo Lista Técnicos...\n");
				break;
			case 7:
				System.out.println("Cadastrando Pedagogo...");
				System.out.print("Nome do Pedagogo: ");
				nome = scanner.next();
				Pedagogo pedagogo = new Pedagogo(nome);
				System.out.print("Local de Nascimento: ");
				localNascimento = scanner.next();
				pedagogo.setLocalNascimento(localNascimento);
				System.out.print("Sexo: ");
				sexo = scanner.next().toUpperCase().charAt(0);
				pedagogo.setSexo(sexo);
				listaPedagogo[contPedagogo] = pedagogo;
				contPedagogo++;
				break;
			case 8:
				System.out.println("Imprimindo Lista Pedagogos...\n");
				break;
			case 9:
				System.out.println("Cadastrando Psicólogo...");
				System.out.print("Nome do Psicólogo: ");
				nome = scanner.next();
				Psicologo psicologo = new Psicologo(nome);
				System.out.print("Local de Nascimento: ");
				localNascimento = scanner.next();
				psicologo.setLocalNascimento(localNascimento);
				System.out.print("Sexo: ");
				sexo = scanner.next().toUpperCase().charAt(0);
				psicologo.setSexo(sexo);
				listaPsicologo[contPsicologo] = psicologo;
				contPsicologo++;
				break;
			case 10:
				System.out.println("Imprimindo Lista Psicólogos...\n");
				break;
			case 11:
				System.out.println("Cadastrando Merendeira...");
				System.out.print("Nome da Merendeira: ");
				nome = scanner.next();
				Merendeira merendeira = new Merendeira(nome);
				System.out.print("Local de Nascimento: ");
				localNascimento = scanner.next();
				merendeira.setLocalNascimento(localNascimento);
				System.out.print("Sexo: ");
				sexo = scanner.next().toUpperCase().charAt(0);
				merendeira.setSexo(sexo);
				listaMerendeira[contMerendeira] = merendeira;
				contMerendeira++;
				break;
			case 12:
				System.out.println("Imprimindo Lista Merendeiras...\n");
				break;
			case 13:
				System.out.println("Cadastrando Vigilante...");
				System.out.print("Nome do Vigilante: ");
				nome = scanner.next();
				Vigilante vigilante = new Vigilante(nome);
				System.out.print("Local de Nascimento: ");
				localNascimento = scanner.next();
				vigilante.setLocalNascimento(localNascimento);
				System.out.print("Sexo: ");
				sexo = scanner.next().toUpperCase().charAt(0);
				vigilante.setSexo(sexo);
				listaVigilante[contVigilante] = vigilante;
				contVigilante++;
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
