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
	 * check whether its matches with the given condition/criteria of valid first name
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
			System.out.println("It is a valid First name");
		}
		else {
			System.out.println("It is not a valid name, Please enter valid name");
		}
	}
	
	/*
	 * Method validLastName is used to take input from user and
	 * check whether its matches with the given condition/criteria of valid last name 
	 */
    public static void validLastName() {
		
		System.out.println("Enter Last Name");
		String name = sc.nextLine();
		String condition = "[A-Z]{1}[a-z]+";
		Pattern p = Pattern.compile(condition);
		Matcher m = p.matcher(name);
		boolean check = m.matches();
		if(check == true) {
			System.out.println("It is a valid Last name");
		}
		else {
			System.out.println("It is not a valid name, Please enter valid name");
		}
	}
    
    /*
	 * Method validEmailid is used to take input from user and
	 * check whether its matches with the given condition/criteria of valid Email id. 
	 */
    public static void validEmailid() {
    	
    	System.out.println("Enter Email Address");
		String name = sc.nextLine();
		String condition = "[A-z a-z 0-9 + -]+([.]{1}[a-z 0-9]+)*[@][a-z 0-9]{1,5}([.][com]{2,3})+([. a-z]{2,3})?";
		Pattern p = Pattern.compile(condition);
		Matcher m = p.matcher(name);
		boolean check = m.matches();
		if(check == true) {
			System.out.println("It is a Valid Email");
		}
		else {
			System.out.println("It is not a valid Email, Please Enter valid Email");
		}
    }
    
    /*
   	 * Method validMobileNumber is used to take input from user and
   	 * check whether its matches with the given condition/criteria of valid Mobile Number. 
   	 */
    public static void validMobileNumber() {
    	
    	System.out.println("Enter Mobile Number");
    	String name = sc.nextLine();
    	String condition = "[91]{2}[0-9]{10}";
    	Pattern p = Pattern.compile(condition);
    	Matcher m = p.matcher(name);
    	boolean check = m.matches();
    	if(check == true) {
    		System.out.println("It is a valid Mobile Number");
    	}
    	else {
    		System.out.println("It is not a valid Number, Please enter valid Mobile Number");
    	}
    }
    
    /*
   	 * Method validPassword is used to take input from user and
   	 * check whether its matches with the given condition/criteria of valid Password. 
   	 */
    public static void validPassword() {
    	
    	System.out.println("Enter Password");
    	String name = sc.nextLine();
    	String condition = "(?=.*[A-Z])(?=.*[0-9])[a-z A-Z 0-9]{8,}";
    	Pattern p = Pattern.compile(condition);
    	Matcher m = p.matcher(name);
    	boolean check = m.matches();
    	if(check == true) {
    		System.out.println("It is a valid Password");
    	}
    	else {
    		System.out.println("It is not a valid password, Enter minimum 8 characters");
    	}
    }
}
