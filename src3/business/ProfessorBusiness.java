package br.edu.ifs.academico.business;

import br.edu.ifs.academico.Professor;

public class ProfessorBusiness extends PessoaBusiness {

	public Professor cadastrarProfessor() {
		
		System.out.println("Cadastrando Professor...");
		System.out.print("Nome do professor: ");
		String nome = scanner.next();
		System.out.print("Local de Nascimento: ");
		String localNascimento = scanner.next();
		System.out.print("Sexo: ");
		char sexo = scanner.next().toUpperCase().charAt(0);
		System.out.print("Fomação: ");
		String formacao = scanner.next();
		
		Professor professor = new Professor(nome);

		professor.setLocalNascimento(localNascimento);
		professor.setSexo(sexo);
		professor.setFormacao(formacao);

		return professor;
		
	}
	
}
