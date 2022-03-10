import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstNameValidation {

	public static void main(String[] args) {
		/**
		 * Procedure
		 * ====================================================
		 *  1.Taking user input of first name and last name
		 *  3.calling method to print true false
		 *  2.created method to check 1st letter 
		 *  is capital and has minimum 3 letters
		 *  ==================================================
		 */

		/*
		 * 1.Taking user input of first name and last name
		 */
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 3.calling method to print true false
		 */
		System.out.println("Enter the first Name ");
		String fname = sc.nextLine();
		System.out.println(name(fname));
		
		System.out.println("\nEnter the Last Name ");
		String lname = sc.nextLine();
		System.out.println(name(lname));
		
		
	}

	/*
	 * 2.created method to check 1st letter is capital and has minimum 3 letters
	 */
	public static boolean name(String firstName) {
		return firstName.matches("[A-Z]{1}[a-z]{3,}");
	}
}
