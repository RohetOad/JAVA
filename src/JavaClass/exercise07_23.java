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


