package br.testes;

import java.util.Scanner;

public class ConsumoCombutivel {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		double TaxaDeConsumo; // Media de Combustivel por Km
		double Km1; 	// Km Inicial
		double Km2; 	// Km Final
		double kmtotal; // km percorrido
		double litros; 	//combutivel gasto
		
		System.out.println(" Informe o KM inicial ");
		Km1 = input.nextDouble();
		
		System.out.println(" Informe o KM final ");
		Km2 = input.nextDouble();
		
		
		System.out.println("Informe a quantidade de litros consumidos");
		litros = input.nextDouble();
		
		kmtotal = Km2-Km1;
		TaxaDeConsumo = kmtotal / litros;
		
		
		
		System.out.println(" O Total percorrido foi de " + kmtotal + " KM ");
		System.out.println(" A Taxa media de Consumo é de " + TaxaDeConsumo + " Litros por KM Percorrido ");
		

	}

}

