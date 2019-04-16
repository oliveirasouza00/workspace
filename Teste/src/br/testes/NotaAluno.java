package br.testes;

import java.util.Scanner;

public class NotaAluno {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		String Aluno;
		double nota1;
		double nota2;
		double nota3;
		double MediaFinal;
		
		
		System.out.println("Digite o Nome do Aluno");
		Aluno = input.nextLine();
		
		System.out.println("Digite Nota Primeira da Prova");
		nota1 = input.nextDouble();
		
		System.out.println("Digite Nota Segunda da Prova");
		nota2 = input.nextDouble();
		
		
		System.out.println("Digite Nota Terceira da Prova");
		nota3 = input.nextDouble();
		
		MediaFinal = (nota1 + nota2 + nota3)/3;
		
		System.out.println("Nome do Aluno: " + Aluno );
		System.out.println("A média final do Aluno é : " + MediaFinal);
		
	}

}
