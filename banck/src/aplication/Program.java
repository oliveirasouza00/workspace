package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc =  new Scanner(System.in);
		Account account;
		
		System.out.println("Enter Account Number : ");
		int number = sc.nextInt();
	
		System.out.println("Enter Account Hold: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		
		
		System.out.println("Is there an initial deposit (y/n) ");
		char response = sc.next().charAt(0);
		

		if( response == 'y') {
			System.out.println("Enter initial deposit value");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder , initialDeposit);
		}
		else { 
			
			account = new Account(number, holder);
		}
		
				
		 
		System.out.println();
		System.out.println("Account Data: ");
		System.out.println(account);
		
		//Deposito
		System.out.println();
		System.out.println("Enter Deposit Value: ");
		double depositeValue =  sc.nextDouble();
		account.deposit(depositeValue);
		System.out.println("Update Account data: ");
		System.out.println(account);
		
		//---------------------------------------
		
		//SAC
		System.out.println();
		System.out.println("Enter withDraw Value: ");
		double withdrawValue =  sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Update Account data: ");
		System.out.println(account);
		
		
		
		sc.close();

		
	}

}
