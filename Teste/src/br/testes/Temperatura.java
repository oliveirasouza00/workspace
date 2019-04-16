package br.testes;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Double C , F;
		
		System.out.println("Digite a Temperatura em Graus Celsius");
		C = input.nextDouble();
		
		F = (9 * C + 160) / 5;
		
		System.out.println("A Temperatura convertida para Fahrenheit é : " + F);
		
		

	}

}
