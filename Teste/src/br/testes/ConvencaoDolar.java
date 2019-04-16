package br.testes;

import java.util.Scanner;

public class ConvencaoDolar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double real ;	// valor da conversão de dólar
		double dolar;	// quantidade em dólares do US
		double cotacao; // cotação do dólar 
		
		
		System.out.println("Digite a Quantidade em Dolar");
		dolar = input.nextDouble();
		
		System.out.println("Digita a Contacao em Dolar");
		cotacao =input.nextDouble();
		
		real = dolar * cotacao;
		
		System.out.println("Quantida em reais R$ " + real );
		
		
		
		
		
	}

}
