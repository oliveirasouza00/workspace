package br.testes;

import java.util.Scanner;

import javax.transaction.xa.Xid;

public class Veiculo {

	public static void main(String[] args) {
				
		double valorVeiculo, desconto,veiculoDesconto;
		int anoVeiculo,total2000=0, totalgeral=0;
		boolean continuar =true;
		String decisao;
		
		while (continuar == true) {
			Scanner captura = new Scanner(System.in);
			
		System.out.println("Digite o valor do veiculo:");
		valorVeiculo =captura.nextDouble();
		
		System.out.println("Digite o Ano do Veiculo:");
		anoVeiculo =captura.nextInt();
			
		} 
		
	}

}
