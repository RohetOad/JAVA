/*
 Project Name: Calculating Future Investment Value
Problem Description:
Write a program that reads in investment amount, annual interest rate, and number of
years, and displays the future investment value using the following formula:
futureInvestmentValue =
investmentAmount * (1 + monthlyInterestRate)numberOfYears*12
 */

package JavaClass;

import java.util.Scanner;

public class FutureInvestmentCalculator {
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Enter investment amount
		System.out.print("Enter the investment amount in dollars: ");
		double investmentAmount = input.nextDouble();
		
		//Enter Annual interest rate
		System.out.print("Enter the annaul interestrate: ");
		double annualInterest = input.nextDouble();
		
		//Enter number of years
		System.out.print("Enter the years: ");
		int years = input.nextInt();
		
		//Calculating the monthly interest rate from yearly interest rate. 
		double monthlyInterest = annualInterest/1200;
		
		//Final result, Calculation of futreInvestmentValue
		double futureInvestmentValue = investmentAmount*(Math.pow(1 + monthlyInterest,years*12));
		
		//Print the futureInvestmentValue to screen
		System.out.print("The future Investment value is " + futureInvestmentValue);
		
	

	}

}
