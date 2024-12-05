package unit2;

import java.util.Scanner;

/**
 * Description: This code informs you if the numbers are in order or not.
 * Date: November 6, 2024
 * @author Ethan Pameli
 */

public class IfChallenge2 {
	/**
	 * This is the entry point to the program
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the first number:");
		int num1 = in.nextInt();

		System.out.println("Enter the second number:");
		int num2 = in.nextInt();

		System.out.println("Enter the third number:");
		int num3 = in.nextInt();


		if (num1 < num2 && num2 < num3) {
			System.out.println("The numbers are strictly increasing.");
		} else if (num1 > num2 && num2 > num3) {
			System.out.println("The numbers are strictly decreasing.");
		} else {
			System.out.println("The numbers are not strictly in order.");
		}
	}

	//This is for the portfolio

	/*Create a program that asks for three numbers.
    Tell the user if the numbers are strictly in order.
    ie.  2 5 11 or 5 6 7 are strictly in order.
    ie.  6 5 7 or 5 5 7 are not
	 */
}