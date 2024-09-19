package br.edu.ifs.academico;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.ifs.academico.business.AlunoBusiness;
import br.edu.ifs.academico.business.ProfessorBusiness;

public class App {

	static String nome;
	static String localNascimento;
	static String dataNascimento;
	static char sexo;

	public static void main(String[] args) {

		ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
		ArrayList<Merendeira> listaMerendeira = new ArrayList<Merendeira>();
		ArrayList<Pedagogo> listaPedagogo = new ArrayList<Pedagogo>();
		ArrayList<Professor> listaProfessor = new ArrayList<Professor>();
		ArrayList<Psicologo> listaPsicologo = new ArrayList<Psicologo>();
		ArrayList<Tecnico> listaTecnico = new ArrayList<Tecnico>();
		ArrayList<Vigilante> listaVigilante = new ArrayList<Vigilante>();
		
		Scanner scanner = new Scanner(System.in);
		
		Menu.imprimirMenu();
		
		int opcao = scanner.nextInt();
		
		while (opcao != 0) {
			
			switch (opcao) {
			case 1:
				AlunoBusiness alunoBusiness = new AlunoBusiness();
				listaAluno.add(alunoBusiness.cadastrarAluno());
				break;
			case 2:
				System.out.println("Imprimindo Lista Alunos...\n");
				System.out.println(listaAluno.toString());
				break;
			case 3:
				ProfessorBusiness professorBusiness = new ProfessorBusiness();
				listaProfessor.add(professorBusiness.cadastrarProfessor());
				break;
			case 4:
				System.out.println("Imprimindo Lista Professores...\n");
				System.out.println(listaProfessor.toString());
				break;
			case 5:
				System.out.println("Cadastrando Técnico...\n");
				System.out.print("Nome do Técnico: ");
				nome = scanner.next();
				System.out.print("Local de Nascimento: ");
				localNascimento = scanner.next();
				System.out.print("Sexo: ");
				sexo = scanner.next().toUpperCase().charAt(0);
				System.out.print("Profissão: ");
				String profissao = scanner.next();
				System.out.print("Laboratório: ");
				String laboratorio = scanner.next();
				System.out.print("Sala: ");
				int sala = scanner.nextInt();

				Tecnico tecnico = new Tecnico(nome);

				tecnico.setLocalNascimento(localNascimento);
				tecnico.setSexo(sexo);
				tecnico.setProfissao(profissao);
				tecnico.setLaboratorio(laboratorio);
				tecnico.setSala(sala);

				listaTecnico.add(tecnico);
				break;
			case 6:
				System.out.println("Imprimindo Lista Técnicos...\n");
				break;
			case 7:
				System.out.println("Cadastrando Pedagogo...");
				System.out.print("Nome do Pedagogo: ");
				nome = scanner.next();
				System.out.print("Local de Nascimento: ");
				localNascimento = scanner.next();
				System.out.print("Sexo: ");
				sexo = scanner.next().toUpperCase().charAt(0);
				System.out.print("Experiência: ");
				String experiencia = scanner.next();
				System.out.print("Faixa da Classe: ");
				String faixaClasse = scanner.next();

				Pedagogo pedagogo = new Pedagogo(nome);

				pedagogo.setLocalNascimento(localNascimento);
				pedagogo.setSexo(sexo);
				pedagogo.setExperiencia(experiencia);
				pedagogo.setFaixaClasse(faixaClasse);

				listaPedagogo.add(pedagogo);
				break;
			case 8:
				System.out.println("Imprimindo Lista Pedagogos...\n");
				break;
			case 9:
				System.out.println("Cadastrando Psicólogo...");
				System.out.print("Nome do Psicólogo: ");
				nome = scanner.next();
				System.out.print("Local de Nascimento: ");
				localNascimento = scanner.next();
				System.out.print("Sexo: ");
				sexo = scanner.next().toUpperCase().charAt(0);
				System.out.print("CRP: ");
				String crp = scanner.next();
				System.out.print("Especialidade: ");
				String especialidade = scanner.next();
				System.out.print("Alocação: ");
				String alocacao = scanner.next();

				Psicologo psicologo = new Psicologo(nome);

				psicologo.setLocalNascimento(localNascimento);
				psicologo.setSexo(sexo);
				psicologo.setCrp(crp);
				psicologo.setEspecialidade(especialidade);
				psicologo.setAlocacao(alocacao);

				listaPsicologo.add(psicologo);
				break;
			case 10:
				System.out.println("Imprimindo Lista Psicólogos...\n");
				break;
			case 11:
				System.out.println("Cadastrando Merendeira...");
				System.out.print("Nome da Merendeira: ");
				nome = scanner.next();
				System.out.print("Local de Nascimento: ");
				localNascimento = scanner.next();
				System.out.print("Sexo: ");
				sexo = scanner.next().toUpperCase().charAt(0);
				System.out.print("Especialidade: ");
				String especialidadePrato = scanner.next();
				System.out.println("Vulgo: ");
				String vulgo = scanner.next();

				Merendeira merendeira = new Merendeira(nome);

				merendeira.setLocalNascimento(localNascimento);
				merendeira.setSexo(sexo);
				merendeira.setEspecialidadePrato(especialidadePrato);
				merendeira.setVulgo(vulgo);

				listaMerendeira.add(merendeira);
				break;
			case 12:
				System.out.println("Imprimindo Lista Merendeiras...\n");
				break;
			case 13:
				System.out.println("Cadastrando Vigilante...");
				System.out.print("Nome do Vigilante: ");
				nome = scanner.next();
				System.out.print("Local de Nascimento: ");
				localNascimento = scanner.next();
				System.out.print("Sexo: ");
				sexo = scanner.next().toUpperCase().charAt(0);
				System.out.print("Está armado? ");
				boolean armado = scanner.nextBoolean();
				System.out.print("Horário de trabalho: ");
				String horario = scanner.next();

				Vigilante vigilante = new Vigilante(nome);

				vigilante.setLocalNascimento(localNascimento);
				vigilante.setSexo(sexo);
				vigilante.setArmado(armado);
				vigilante.setHorario(horario);

				listaVigilante.add(vigilante);
				break;
			case 14:
				System.out.println("Imprimindo Lista Vigilantes...\n");
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}
			
			Menu.imprimirMenu();
			opcao = scanner.nextInt();
		}
		
		System.out.println("\nSaindo...");
		
	}

}
