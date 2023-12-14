package JavaClass;

import java.util.Scanner;

public class GeometryPointInRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Prompt user to insert x coordinate
		System.out.print("Please enter x coordinate of the position");
		double x = input.nextInt();
		
		//Prompt user to insert y coordinate
		System.out.print("Please enter y coordinate of the position");
		double y = input.nextInt();
		
		//display the coordinates.
		System.out.print("The Coordinates are (" + x + "," + y + ")");
		
		//The dimensions of rectangle are 10x5 (WxH)
		/*If we take the reference point as (0,0) in the center of rectangle, then x <=5 and y <=2.5 satisfies the condition for
		 the point location inside the rectangle(first quarter). 
		 */
		if((x <= 5 & x >= 0 ) & (y <= 2.5 & y >= 0))
			System.out.print("The enterred point is with in the rectangle.");
		else if((x >= -5 & x <= 0 ) & (y <= 2.5 & y >= 0))
			System.out.print("The enterred point is with in the rectangle (Second quarter of rectangle).");
		else if((x >= -5 & x <= 0 ) & (y >= -2.5 & y <= 0))
			System.out.print("The enterred point is with in the rectangle (Third quarter of rectangle).");
		else if((x <= 5 & x >= 0 ) & (y >= -2.5 & y <= 0))
			System.out.print("The enterred point is with in the rectangle (Fourth quarter of rectangle).");
		else
			System.out.print("The enterred point is not within the rectangle");
	}

}
