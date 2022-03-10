import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

	public static void main(String[] args) {
		/**
		 * Procedure
		 * ====================================================
		 *  1.Taking user input password
		 *  2.calling method to print true false
		 *  3.created method to check password must minimum 8 char 
		 *  ==================================================
		 */

		/*
		 * 1.Taking user input password
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Example  ");
		System.out.println("Enter the Password here ");
		String mblno = sc.nextLine();
		/*
		 * 2.calling method to print true false
		 */
		System.out.println(number(mblno));
		;

	}

	/*
	 * 3.created method to check password must minimum 8 char
	 */
	public static boolean number(String number) {
		return number.matches("[a-z A-Z]{8,}");
	}
}
