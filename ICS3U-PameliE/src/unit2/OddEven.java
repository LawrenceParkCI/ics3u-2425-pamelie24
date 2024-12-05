package unit2;

import java.util.Scanner;

/**
 * Description: this code will take an inputed integer and test to see if it is odd or even
 * Date: 2024-11-04
 * @author Ethan Pameli
 */
public class OddEven {
	/**
	 * This is the entry point to the program
	 * @param args
	 */

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		
		System.out.println("ODD OR EVEN?\n------------");

		//recive user input
		System.out.print("Type in an integer of your choice and press <Enter>: ");
		int num = sc.nextInt();

		//test number is it even or odd
		if (num%2 == 0) {
			System.out.println("Your integer is even.");
		}
		else {
			System.out.println("Your integer is odd.");
		}

		sc.close();

	}

}