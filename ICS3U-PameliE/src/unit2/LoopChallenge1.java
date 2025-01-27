package unit2;
/**
 Description: password code
 Date: November 22, 2024
 @author Ethan Pameli                                      
 */

import java.util.Scanner;
public class LoopChallenge1 {
	/**
	 * This is the entry point to the program
	 * @param args
	 */

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);

		//correct password
		String correctPassword = "ethanisaw"; 

		// Set up variables
		String enteredPassword;
		int attempts = 0;
		boolean isCorrect = false;

		// Do-while loop
		do {
			System.out.print("Enter the password: ");
			enteredPassword = scanner.nextLine(); 
			attempts++;  // Increase attempt count

			if (enteredPassword.equals(correctPassword)) {
				isCorrect = true;  // Password is correct
			} else {
				System.out.println("Incorrect password. Try again.");
			}
		} while (!isCorrect && attempts < 3);  // Repeat while the password is wrong and attempts are less than 3

		// Check if the user was successful or failed after 3 attempts
		if (isCorrect) {
			System.out.println("Welcome!");
		} else {
			System.out.println("Sorry, you have exceeded the maximum number of attempts.");
		}

		scanner.close(); 
	}

	/*
      Create a program that will ask for the password.  If they answer 
      incorrectly, tell them, and repeat. If they answer correctly, 
      welcome them in.

      Extra: if they don't give a proper answer within 3 
      Decide on whether you should use the while or do while loop.
	 */
}