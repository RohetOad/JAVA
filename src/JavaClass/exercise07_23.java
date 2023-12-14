/*
 Project: Locker Puzzle
Problem Description:
A school has 100 lockers and 100 students. All lockers are closed on the first day of
school. As the students enter, the first student, denoted S1, opens every locker. Then the
second student, S2, begins with the second locker, denoted L2, and closes every other
locker. Student S3 begins with the third locker and changes every third locker (closes it if
it was open, and opens it if it was closed). Student S4 begins with locker L4 and changes
every fourth locker. Student S5 starts with L5 and changes every fifth locker, and so on,
until student S100 changes L100.
After all the students have passed through the building and changed the lockers, which
lockers are open? Write a program to find your answer. The program should display the
answer like this:
Locker x is open
Locker y is open
...
Locker z is open
 */

package JavaClass;

public class exercise07_23 {

	public static void main(String[] args) {
		
		//Creating array for 100 lockers.
		boolean[] lockers = new boolean[100];
		puzzle(lockers);
		System.out.println("Following lockers are open from locker 1 to locker 100: ");
		display(lockers);
		System.out.print("All other lockers are locked.");
	
	}
	
	//method for puzzle.
	public static void puzzle(boolean[] args) {
		//Creating array for 100 students
		String[] student = new String[100];
		for(int i = 0; i < student.length; i++) {
			student[i] = "S".concat(String.valueOf(i + 1));
		}
		for(int i = 0; i < student.length; i++)
			System.out.print("Student ID =" + student[i] + " ");
		    System.out.print("\n");
		
		//S1 student opens every lock.
		for(int i = 0; i < args.length; i++) {
			args[i] = true;
		}
		
		//rest of the student's changes.
		for(int i = 1; i < args.length; i++) {
			for(int j = i, k = i + 1; j < args.length; j += k)
			if(args[j])
				args[j] = false;
			else
				args[j] = true;
					
		}		
		
	}
	
	//method displaying the result.
	public static void display(boolean[] args) {
		for(int i = 0; i < args.length; i++) {
			if(args[i]) {
			System.out.println("locker" + (i + 1) + " is open");
			}
			
			 
			}
		
	}
}


