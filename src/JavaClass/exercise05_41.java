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
