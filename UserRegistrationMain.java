/**
 *@PROBLEM_STATEMENT : UC7_Rule-8
 * As a User need to enter a Password
 * having minimum 8 characters and have one uppercase letter atleast and have one number atleast
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
		
		display();
		int option = sc.nextInt();
		switch(option) {
		
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
		
	}

}
