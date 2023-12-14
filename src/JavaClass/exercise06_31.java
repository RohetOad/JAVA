package JavaClass;

import java.util.Scanner;

public class exercise06_31 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Ask user for credit card number
        System.out.print("Please, enter a credit card number to validate: ");
        long credit = scanner.nextLong();

        // Validation step.
        if (Validator(credit)) {
            System.out.println("The credit card number is valid.");
        } else {
            System.out.println("The credit card number is invalid.");
        }

        // close scanner
        scanner.close();
    }

    //luhn algorithm. 
    public static boolean Validator(long credit) {
        int total = 0;
        boolean alternate = false;

        // digits from right to left.
        while (credit > 0) {
            int number = (int) (credit % 10);
            if (alternate) {
            	number *= 2;
                if (number > 9) {
                	number = number % 10 + 1;
                }
            }
            total += number;
            alternate = !alternate;
            credit /= 10;
        }

        // Finally check if the total is divisible by 10.
        return total % 10 == 0;
    }
}
	


