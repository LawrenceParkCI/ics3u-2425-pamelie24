package unit1;

import java.util.Scanner;

/**
 * Description:
 * Date:
 * @author 
 */
public class UsingMathMethods {
	/**
	 * This is the entry point to the program
	 * @param args
	 */


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, num1;

		System.out.println("Part A");

		//Write code to ask the user for any real number to be input.
		//Store their input into the num variable
		System.out.println("Type in any real number and <ENter>");
		num = sc.nextDouble();
		System.out.println(Math.round(num));
		System.out.println(Math.rint(num));
		System.out.println(Math.sqrt(num));
		System.out.println(Math.abs(num));
		System.out.println(Math.pow(num, 2));
		System.out.println(Math.pow(num, num));
		System.out.println(Math.pow(num, 3));
		

		/*
		 * Run the program and write down the output that is produced
		 * when each of the following values are input:
		 * 
		 * 					num = 16.75		| num = 4.0		| num = -23.45
		 * 					-----------------------------------------------
		 * Math.round(num)			17		| 		4		|		-23
		 * Math.rint(num)			17.0	| 		4.0		|		-23.0
		 * Math.sqrt(num)			4.092	|		2.0		|		NaN
		 * Math.abs(num)			16.75	|		4.0		|		23.45
		 * Math.pow(num, 2)		280.5625	|		16.0	|		549.902
		 * Math.pow(num, num)		3.1786	|		256.0	|		NaN
		 * Math.pow(num, 3)			4699.42 |		64.0	|		-12895.2136
		 * 
		 */

		/*Why does the last value(-23.45) give strange output for Math.sqrt(num)?
		 * It gives a strange output because 
		 */
		//Nan stands for Not a number!

		//In your own words describe what the following Math methods does
		/*
		 * round: this rounds to the nearest number
		 * rint: rounds to the nearest decimal place
		 * sqrt: this solves the square root of the number 
		 * abs:  
		 * pow: This solves for exponents 
		 */

		//The methods round, sqrt and abs only have one parameter (which is in the brackets).
		//Why does the pow method have 2 parameters? Explain the purpose of these 2 parameters.

		 System.out.println("Part B");
		 System.out.println("Type in any real number.");
		 num = sc.nextDouble();
		 System.out.println("Type in any real number.");
		 num1 = sc.nextDouble();
		 System.out.print("\tREAL NUMBER");
		 System.out.print("\tSQUARE ROOT");
		 System.out.println("\tRAISED TO POWER " + num1);
		 System.out.println("\t" + num +"\t\t" + Math.sqrt(num) +"\t\t" + Math.pow(num, num1));
		 sc.close();

		//Ask the user for any real number and an integer to be input. Display the real number,
		//and its square root. Also determine and display the real number raised to the integer power.
		//Use suitable headings, displaying the results across the screen.\
		//
		//Eg. If the real number 13.5 nad the integer 2 are input, display
		//REAL NUMBER	SQUARE ROOT		RAISED TO POWER 2 <- display power here
		//   13.5		   3.6742			182.25




		//Write down the results produced by your program when the real number 7.8985 and
		//the integer 3 are input.



		//Change your program so that instead of inputting an integer power, a real number
		//power can be input.
		//Write down the results produced by your program when the following are input:
		//a) the number 16 and the real number power 0.5
		//b) the number 8 and the real number power 0.33


		//Does your program give a different answer if 0.3333333 is input instead of 0.33 for the power?




	}

}
