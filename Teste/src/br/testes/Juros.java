package br.testes;

import java.util.Scanner;

public class Juros {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double deposito;
		double juros;
		double rendimento;
		
		System.out.println("Digite o Valor de Depósito");
		deposito = input.nextDouble();
		
		juros = (deposito * 0.70 )/100;
		rendimento = juros + deposito;
		
		
		System.out.println("O Rendimento da Poupança no Mês foi de R$ " + rendimento );
		
		
		
		
		
		

	}

}
