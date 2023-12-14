package JavaClass;

import java.util.Scanner;

public class locateLargestElement_P8 {

	public static void main(String[] args) {
	//create scanner object.
	Scanner input = new Scanner(System.in);
	//Prompt the user for rows and columns 
	System.out.print("Please enter the number of rows : ");
	int rows = input.nextInt();
	System.out.print("Please enter the number of columns : ");
	int columns = input.nextInt();
	//create array to store inputs
	double[][] array = new double[rows][columns];
	//get array values from getarray method.
	array = getarray(rows, columns);
	System.out.println("The enterred array is:");
	//print array.
    printarray(array);
    //create array to store results.
    int[] indices = new int[2];
    //get indices for the location of largest element.
    indices = locateLargest(array);
    //Print the result to the screen.
    System.out.print("The location of the largest element is at " + "(" + indices[0] + "," + indices[1] + ")");
	}
	
	public static double[][] getarray(int a, int b) {
		double[][] array = new double[a][b];
		System.out.println("Please enter values for the elements for array(hit enter after each element) : ");
		Scanner input = new Scanner(System.in);
		//for loop to get inputs from user
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		return array;
	}
	public static void printarray(double[][] a) {
		//for loop to print the array.
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				System.out.print("[" + a[i][j] + "]");
			}
			System.out.println("");
		}
		
	}
	
	public static int[] locateLargest(double[][] a) {
		double large = 0;
		int p1 = 0;
		int p2 = 0;
		//for loop to find the largest element.
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				if(a[i][j] > large) {
					large = a[i][j];
					p1 = i;
					p2 = j;
				}
				else
					continue;
					
			}
		}
		 int[] indices = new int[2];
		 indices[0] = p1;
		 indices[1] = p2;
		return indices;
		
	}

}
