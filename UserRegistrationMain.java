/**
 *@PROBLEM_STATEMENT : UC1
 * As a User need to enter a valid First Name
 * First name starts with Cap and has minimum 3 character
 * @author Kumar Bamankar
 *
 */
package userregistration;

import java.util.Scanner;
public class UserRegistrationMain {
	static Scanner sc = new Scanner(System.in);
	
	/*
	 * Method display is used to to display welcome message and to take choice
	 * from user what he/she wants to do.
	 * In this use case only valid first name option is available.
	 * 
	 */
	public static void display() {
		System.out.println("_________________________");
		System.out.println("USER REGISTRATION");
		System.out.println("_________________________");
		System.out.println("\nEnter 1 : To valid first name");
		
	}
	
	/* 
     * Main method for manipulation linkedList
     * @param args - Default Java param (Not used)
	 */

	public static void main(String[] args) {
		
	/*
	 * PROCEDURE :
	 * 1.Creating a method vaidFirstName to validate first name.
	 * 2.Creation a method display to display welcome message and take choice from the user.
	 * 3.Using switch case to implement user's choice.	
	 */
		
		display();
		int option = sc.nextInt();
		switch(option) {
		
		case 1 :
			UserRegistration.validFirstName();
			break;		
		}
		
	}

}
