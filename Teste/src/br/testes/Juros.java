package br.testes;

import java.util.Scanner;

public class Juros {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double deposito;
		double juros;
		double rendimento;
		
		System.out.println("Digite o Valor de Dep�sito");
		deposito = input.nextDouble();
		
		juros = (deposito * 0.70 )/100;
		rendimento = juros + deposito;
		
		
		System.out.println("O Rendimento da Poupan�a no M�s foi de R$ " + rendimento );
		
		
		
		
		
		

	}

}
