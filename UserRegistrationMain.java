package userregistration;
import java.util.Scanner;
public class UserRegistrationMain {
	static Scanner sc = new Scanner(System.in);
	
	static void display() {
		System.out.println("_________________________");
		System.out.println("USER REGISTRATION");
		System.out.println("_________________________");
		System.out.println("\nEnter 1 : To valid first name");
		
	}

	public static void main(String[] args) {
		
		display();
		int option = sc.nextInt();
		switch(option) {
		
		case 1 :
			UserRegistration.validFirstName();
			break;		
		}
		
	}

}
