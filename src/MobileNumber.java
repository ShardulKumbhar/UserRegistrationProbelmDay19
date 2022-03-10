import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumber {

	public static void main(String[] args) {
		/**
		 * Procedure
		 * ====================================================
		 *  1.Taking user input of country code and mobile number
		 *  2.calling method to print true false
		 *  3.created method to check country code and mobile number 
		 *  ==================================================
		 */

		/*
		 * 1.Taking user input of country code and mobile number
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Example 91 9846521868 ");
		System.out.println("Enter country code and mobile number ");
		String mblno = sc.nextLine();
		/*
		 * 2.calling method to print true false
		 */
		System.out.println(number(mblno));
		;

	}

	/*
	 * 3.created method to check country code and mobile number
	 */
	public static boolean number(String number) {
		return number.matches("[0-9]{2}\s[0-9]{10}");
	}
}
