import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		/**
		 * Procedure
		 * ====================================================
		 *  1.Taking user input of email
		 *  3.calling method to print true false
		 *  2.created method to check email
		 *  ==================================================
		 */

		/*
		 * 1.Taking user input of email
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Example: govind123@gmail.com\n");
		System.out.println("Enter the Email address : ");
		String emailId = sc.nextLine();
		/*
		 * 3.calling method to print true false
		 */
		System.out.println(email(emailId));

	}

	/*
	 * 2.created method to check email min 3-char min 2-number minimum one @ minimum
	 * one . min 3 char at last
	 */
	public static boolean email(String email) {
		return email.matches("[a-z]{3,}[0-9]{2,}@{1}[a-z]{2,}[.][a-z]{3}");

	}
}
