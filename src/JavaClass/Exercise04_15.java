package JavaClass;

import java.util.Scanner;

public class Exercise04_15 {

	public static void main(String[] args) {
	 // TODO Auto-generated method stub
     //Create scanner object.
	 //Generate a input object.
	 Scanner input = new Scanner(System.in);
	 

	 System.out.println("Please enter a character from A to Z, If enterred more than 1 character then the 1st character will be selected.");
	 char ch = input.next().charAt(0);
     System.out.println("The selected character is " + ch);
	 if (ch >= 'A' && ch <= 'C') {
		System.out.println("The associated number to selected character is 2");}
	 else if(ch >= 'D' && ch <= 'F'){
		System.out.println("The associated number to selected character is 3");}
	 else if(ch >= 'G' && ch <= 'I'){
		System.out.println("The associated number to selected character is 4");}
	 else if(ch >= 'J' && ch <= 'L'){
		System.out.println("The associated number to selected character is 5");}	
	 else if(ch >= 'M' && ch <= 'O'){
		System.out.println("The associated number to selected character is 6");}	 
	 else if(ch >= 'P' && ch <= 'S'){
		System.out.println("The associated number to selected character is 7");}
	 else if(ch >= 'T' && ch <= 'V'){
		System.out.println("The associated number to selected character is 8");}
	 else if(ch >= 'W' && ch <= 'Z'){
		System.out.println("The associated number to selected character is 9");}
	 else {System.out.println("The input is invalid. Please, enter a character from A to Z.");};
	 
	 }



	}


		
	
	

