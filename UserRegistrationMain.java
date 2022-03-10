/**
 *@PROBLEM_STATEMENT : UC9_
 *Should clear all email samples provided.
 * @author Kumar Bamankar
 */
package userregistration;

import java.util.Scanner;
public class UserRegistrationMain {
	static Scanner sc = new Scanner(System.in);
	
	/*
	 * Method display is used to to display welcome message and to take choice
	 * from user what he/she wants to do.
	 * In this use case valid first name and Last name option is available.
	 * 
	 */
	public static void display() {
		System.out.println("_________________________");
		System.out.println("USER REGISTRATION");
		System.out.println("_________________________");
		System.out.println("\nEnter 0 : To check first name is valid");
		System.out.println("\nEnter 1 : To check first name is valid");
		System.out.println("\nEnter 2 : To check Lastname is valid");
		System.out.println("\nEnter 3 : To check Emailid is valid");
		System.out.println("\nEnter 4 : To check Mobile Number is valid");
		System.out.println("\nEnter 5 : To check Password is valid");
		
	}
	
	/* 
     * Main method for manipulation linkedList
     * @param args - Default Java param (Not used)
	 */

	public static void main(String[] args) {
		
	/*
	 * PROCEDURE :
	 * 1.Creating a method validFirstName to validate first name.
	 * 2.Creating a method validLastName to validate Last name.
	 * 3.Creating a method validEmailid to validate Email Address.
	 * 4.Creating a method validMobileNumber to validate Mobile Number.
	 * 5.Creating a method validPassword to validate Password.
	 * 6.Creation a method display to display welcome message and take choice from the user.
	 * 7.Using switch case to implement user's choice.	
	 */
		int option;
		do {
		display();
		option = sc.nextInt();
		switch(option) {
		
		case 0 :
			System.exit(0);
		case 1 :
			UserRegistration.validFirstName();
			break;
		case 2 :
			UserRegistration.validLastName();
			break;
		case 3 :
			UserRegistration.validEmailid();
			break;
		case 4 :
			UserRegistration.validMobileNumber();
			break;
		case 5 :
			UserRegistration.validPassword();
			break;
		}
		}while (option != 0);
		
	}

}

/* A. Valid Emails to check
* 1. abc@yahoo.com
* 2. abc-100@yahoo.com
* 3. abc.100@yahoo.com
* 2. abc111@abc.com
* 4. abc-100@abc.net
* 5. abc.100@abc.com.au
* 6. abc@1.com
* 7. abc@gmail.com.com
* 8. abc+100@gmail.com
*/