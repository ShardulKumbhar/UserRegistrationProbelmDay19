import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

	public static void main(String[] args) {
		/**
		 * Procedure
		 * ====================================================
		 *  1.Taking user input password for scanner class
		 *  2.calling method to print true false
		 *  3.created method to check password must minimum 
		 *  8 char and have minimum 1 uppercase
		 *  ==================================================
		 */

		/*
		 * 1.Taking user input password for scanner class
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("please Enter Minimum one upper case and 8 Char ");
		System.out.println("\nEnter the Password here : ");
		String password = sc.nextLine();
		/*
		 * 2.calling method to print true false
		 */
		System.out.println(number(password));

	}

	/*
	 * 3.created method to check password must minimum 8 char and have minimum 1
	 * uppercase
	 */
	public static boolean number(String number) {
		return number.matches("^(?=.*[A-Z]).{8,}$");

	}
}
