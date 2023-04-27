import java.util.*;
public class ExtraCredit {

	/**
	 * 
	 * Write a Java application that will prompt the user for an
	 * integer and display a message
	 * that tells whether the number is an odd or even number.
	 * Handle the following exceptions:
	 * 	InputMismatchException
	 *  NegativeNumberException
	 * and terminate the program if an exception is thrown.
	 * 
	 */

	public static void main (String[] arg) {
		boolean noError=true;
		
		do {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an postitive number: ");
		
		try {
			int num = scan.nextInt();
			
			if (num < 0)
				throw new NegativeNumberException("Negative number.\n");
			
			if (num%2!=0) 
				throw new OddNumberException("You have entered an odd number, please try again. Wrong number entered: ", num);
				
			noError=false;
				
		}
		
		catch(InputMismatchException ex) {
			System.out.println("Not an integer... Goodbye.");
			System.exit(1);
		}

		catch(NegativeNumberException ex) {
			System.out.print(ex);
			noError=true;
		}
		catch(OddNumberException ex) {
			System.out.println(ex.getMessage() + ex.getNum());
			noError=true;
		}
		
		
		}while (noError);
	System.out.println("Congrats the number is EVEN and POSITIVE");
	}
}



/* EC +5 pts
 * Modify your program to prompt for a positive even number and throw an
 * 	OddNumberException if the user entered an odd number.
 * Create the OddNumberException class.
 * 
 * EC+5 pts
 * Instead of exiting when an exception is thrown, modify your program
 * to allow the user to enter another value until no exceptions are thrown.
 */



















