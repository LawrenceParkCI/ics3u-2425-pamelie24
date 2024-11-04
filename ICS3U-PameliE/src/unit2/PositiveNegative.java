package unit2;

import java.util.Scanner;

/**
 * Description: 
 * Date:2024-11-04
 * @author Ethan Pameli
 */
public class PositiveNegative {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		
		System.out.println("POSITIVE OR NEGATIVE\n--------------------");
		
		//recive user input
		System.out.print("Type in an integer of your choice and press <Enter>: ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("Your integer is positive.");
		}
		if (num < 0) {
			System.out.println("Your integer is negative");
		}
		
		
		if (num == 0) {
			System.out.println("Your integer is neutral.");
		}

		if (num%7 == 0) {
			System.out.println("Your integer is divisible by seven.");
		}
		else {
			System.out.println("Your integer is not divisible by seven.");
		}
		
		sc.close();

	}

}