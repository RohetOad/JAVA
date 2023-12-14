/*
 Project 1: Computing Tax (50 points)
Problem Description:
The United States federal personal income tax is calculated based on
filing status and taxable income. There are four filing statuses:
single filers, married filing jointly, married filing separately, and
head of household. The tax rates vary every year. Table 3.2 shows the
rates for 2009. If you are, say, single with a taxable income of
$10,000, the first $8,350 is taxed at 10% and the other $1,650 is taxed
at 15%. So, your tax is $1,082.5.
Table 1
2009 U.S. Federal Personal Tax Rates
Marginal
Tax Rate Single Married Filing Jointly
or Qualified Widow(er)
Married Filing
Separately Head of Household
10% $0 – $8,350 $0 – $16,700 $0 – $8,350 $0 – $11,950
15% $8,351– $33,950 $16,701 – $67,900 $8,351 – $33,950 $11,951 – $45,500
25% $33,951 – $82,250 $67,901 – $137,050 $33,951 – $68,525 $45,501 – $117,450
28% $82,251 – $171,550 $137,051 – $208,850 $68,525 – $104,425 $117,451 – $190,200
33% $171,551 – $372,950 $208,851 – $372,950 $104,426 – $186,475 $190,201 - $372,950
35% $372,951+ $372,951+ $186,476+ $372,951+
You are to write a program to compute personal income tax. Your program should
prompt the user to enter the filing status and taxable income and compute the tax. Enter 0
for single filers, 1 for married filing jointly, 2 for married filing separately, and 3 for head
of household.
 */



package JavaClass;

import java.util.Scanner;

public class ComputingTax {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	//Prompt user for filling status
	System.out.print("Pleas, enter the filling status. 0-Single filer, 1-Married jointly or qualifying widower, 2-Married separately, 3-Head of household");
	int status = input.nextInt();
	
	//Prompt user for taxable income.
	System.out.print("Please, Enter taxable Income");
	int income = input.nextInt();
	
	//Create a variable to store tax as double.
	double tax = 0;
	
	if(status == 0)
	 { //single
	 if(income <= 8350)
		tax = (income * 0.10);
	 else if(income <= 33950)
		 tax = 8350 * 0.10 + (income - 8350) * 0.15;
	 else if(income <= 82250)
		 tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
	 else if(income <= 171550)
		 tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
	 else if(income <= 372950)
		 tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
	 else
		 tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33
		 + (income - 372950) * 0.35; 
		}
	else if(status == 1)
	 {//1-Married jointly or qualifying widower
	 if(income <= 16700)
		tax = (income * 0.10);
	 else if(income <= 67900)
		tax = 16700 * 0.10 + (income - 16700) * 0.15;
	 else if(income <= 137050)
		tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
	 else if(income <= 208850)
		tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
	 else if(income <= 372950)
		tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (income - 208850) * 0.33;
	 else
		tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (372950 - 208850) * 0.33
				 + (income - 372950) * 0.35; 
		}
	else if(status == 2)
	{//Married separately file
	 if(income <= 8350)
		tax = (income * 0.10);
	 else if(income <= 33950)
		tax = 8350 * 0.10 + (income - 8350) * 0.15;
	 else if(income <= 68525)
		tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
	 else if(income <= 104425)
	    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (income - 68525) * 0.28;
	 else if(income <= 186475)
		tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (income - 104425) * 0.33;
	 else
		tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (186475 - 104425) * 0.33
		 + (income - 186475) * 0.35; 
	  }
	else if(status == 3)
	{//Head of Household
	 if(income <= 11950)
		tax = (income * 0.10);
	 else if(income <= 45500)
		tax = 11950 * 0.10 + (income - 11950) * 0.15;
	 else if(income <= 117450)
		tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (income - 45500) * 0.25;
	 else if(income <= 190200)
		tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (income - 117450) * 0.28;
	 else if(income <= 372950)
		tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (income - 190200) * 0.33;
	 else
		tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (372950 - 190200) * 0.33
		+ (income - 372950) * 0.35; 
	 }
	else {
	 System.out.print("Invalid status, please choose from 0, 1, 2, and 3");	
	 System.exit(1);
	  }
	System.out.print("Your tax amount =" + tax);
	 }
	
	

	}
