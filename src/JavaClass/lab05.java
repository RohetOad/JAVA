package JavaClass;

import java.util.Scanner;

public class lab05 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to reverse:");
        int number = input.nextInt();
        
        System.out.print("The reversed number is " + ReverseInteger(number));
        
	}
       public static long ReverseInteger(int num1){
        // YOUR CODE HERE
    	   long reverse = 0;
    	   long remainder;
        if(num1 >= 0 && num1 <= 2147483647) {
        	while(num1 > 0) {
        	remainder = num1 % 10;
        	reverse = reverse * 10 + remainder;
        	num1 = num1/10;
        	};
        };
		return reverse;
        
        };
	}


