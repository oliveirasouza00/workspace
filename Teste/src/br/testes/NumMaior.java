package br.testes;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class NumMaior {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digit um Numero:");
		num = input.nextInt();
		
		
		if (num >=20){
			
			System.out.println("Numero " + num + " é maior 20.");
			
		}else{
			
			if (num < 20 ){
				
				System.out.println("numero " + num + " é menor que 20.");
			}
			
		}
		
		
		
	}

}
