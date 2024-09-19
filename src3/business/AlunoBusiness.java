package br.edu.ifs.academico.business;

import br.edu.ifs.academico.Aluno;

public class AlunoBusiness extends PessoaBusiness {

	public Aluno cadastrarAluno() {
		
		System.out.println("Cadastrando Aluno...");
		System.out.print("Nome do aluno: ");
		String nome = scanner.next();
		System.out.print("Local de Nascimento: ");
		String localNascimento = scanner.next();
		System.out.print("Sexo: ");
		char sexo = scanner.next().toUpperCase().charAt(0);
		System.out.print("Nota 1: ");
		double nota1 = scanner.nextDouble();
		System.out.print("Nota 2: ");
		double nota2 = scanner.nextDouble();

		Aluno aluno = new Aluno(nome);

		aluno.setLocalNascimento(localNascimento);
		aluno.setSexo(sexo);
		aluno.setNota1(nota1);
		aluno.setNota2(nota2);
		
		return aluno;
		
	}
	
}
