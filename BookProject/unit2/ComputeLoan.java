package unit2;

import java.util.Scanner;

public class ComputeLoan {
	public static void main(String[] args) {
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Enter annual interest rate in percentage,e.g.,7.25%
		System.out.println("Enter annual intrest tate,e.g.,7.25%: ");
		double annualInterestRate = input.nextDouble();
		
		//Obtain monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
		
		//Enter number of years
		System.out.print("Enter number of years as an integer,e.g.,5: ");
		int numberOfYears = input.nextInt();
		
		//Enter loan amount
		System.out.print("Enter loan amount,e.g.,120000.95: ");
		double loanAmount = input.nextDouble();
		
		//Calculate payment
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1+monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		//Display results
		System.out.println("The monthly payment is $" + (int)(monthlyPayment * 100) / 100.0);
		System.out.println("The monthly payment is $" + (int)(totalPayment * 100) / 100.0);
	}
}

//Enter annual intrest tate,e.g.,7.25%: 
//5.75
//Enter number of years as an integer,e.g.,5: 15
//Enter loan amount,e.g.,120000.95: 250000
//The monthly payment is $2076.02

//Math����java.lang���У���java.lang�е������������ʽ�������