/**
 *@PROBLEM_STATEMENT : UC3
 * As a User need to enter a valid Email id
 * E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl
 * & co) and 2 optional (xyz & in) with
 * precise @ and . positions
 * 
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
	 * 4.Creation a method display to display welcome message and take choice from the user.
	 * 5.Using switch case to implement user's choice.	
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
		}
		
	}

}
