/*
 Project: Occurrence of Max Value (100 points)
Problem Description:
Write a program that reads integers, finds the largest of them, and counts its occurrences.
Assume that the input ends with number 0. Suppose that you entered 3 5 2 5 5 5 0; the
program finds that the largest is 5 and the occurrence count for 5 is 4. (Hint: Maintain
two variables, max and count. max stores the current max number, and count stores its
occurrences. Initially, assign the first number to max and 1 to count. Compare each
subsequent number with max. If the number is greater than max, assign it to max and
reset count to 1. If the number is equal to max, increment count by 1.)
 */


package JavaClass;

import java.util.Scanner;

public class exercise05_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize the variables
		int max;
		int count = 1;
		
		//Print the message to get input from user.
		System.out.println("Please, enter the integers for the comparison.");
		
		//get input from user
		Scanner input = new Scanner(System.in);
		max = input.nextInt();
		
		//while loop to find the MAX value and its occurrence
		while (max != 0) {
			System.out.println("Please, enter the next integer");
			int integer = input.nextInt();
			if (integer > max ) {
				max = integer;
				count = 1;
			}
			else if (integer == max)
				count++;
			else if (integer == 0)
				break;
			else 
				continue;
		};
		//Prints the out result
		System.out.println("The Max int value is " + max);
		System.out.println("The occurrences of the max value = " + count);

	}

}
