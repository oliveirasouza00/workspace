package br.testes;

import java.util.Scanner;

public class Prestacao {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		double valorProduto;
		double valorPrestacao;
		double valorParcela ;
		double juros = 0.10;
		double totalPagar ;
		System.out.println("Digite o valor de Compra");
		valorProduto = input.nextDouble();
		
		
		System.out.println("Quantas Parcelas");
		valorParcela = input.nextDouble();
			
		
		valorPrestacao = (valorProduto / valorParcela) + juros;
		totalPagar = (valorPrestacao * valorParcela);
		
		
		System.out.println("O valor da Parcela é R$ " + valorPrestacao);
		
		System.out.println("O valor total do produto é R$ " + totalPagar);

	}

}
