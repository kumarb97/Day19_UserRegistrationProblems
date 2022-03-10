/*
 * USER REGISTRATION
 */
package userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration {
	public static Scanner sc = new Scanner(System.in);
	
	/*
	 * Method validFirstName is used to take input from user and
	 * check whether its matches with the given condition/criteria of valid name
	 * 
	 */
	public static void validFirstName() {
		
		System.out.println("Enter First Name");
		String name = sc.nextLine();
		String condition = "[A-Z]{1}[a-z]+";
		Pattern p = Pattern.compile(condition);
		Matcher m = p.matcher(name);
		boolean check = m.matches();
		if(check == true) {
			System.out.println("It is a valid name");
		}
		else {
			System.out.println("It is not a valid name, Please enter valid name");
		}
	}
}
