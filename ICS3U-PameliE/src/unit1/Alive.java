package unit1;
/**
 * Description: this code prints out the calculations for an employees net pay
 * Date:2024-10-07
 * @author Ethan Pameli
 */

import java.util.Scanner;

public class Alive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		//declare variables 
		int year1, month1, day1, year2,month2, day2, tdays;
		
		//get the user input 
		System.out.println("ALIVE");
		System.out.print("Type in the year you were born and <Enter>:");
		year1 = sc.nextInt();
		
		System.out.print("Enter the month # you were born and <Enter>:");
		month1 = sc.nextInt();
		
		System.out.print("Enter the day you were born and <Enter>:");
		day1 = sc.nextInt();
		
		System.out.print("Type in the current year and <Enter>:");
		year2 = sc.nextInt();
		
		System.out.print("Enter the current month # and <Enter>:");
		month2 = sc.nextInt();
		
		System.out.print("Enter the current day and <Enter>:");
		day2 = sc.nextInt();
		
		
		//print the output
		System.out.println("You have been alive for " + (tdays = ((year2 - year1)*365) + ((month2 - month1)*30) + ((day2 - day1))) + " days");
		System.out.println("you have been asleep for " + (tdays)*8);
		sc.close();


		
		//Alive
		//Write a program, called Alive, that calculates the number of hours of your life that you have spent sleeping. Assume that you sleep 8 hours each night. To simplify the problem, assume that there are 30 days in each month and 365 days in each year. The program output should look similar to:

			//Enter your birthdate:
			//Year: 1990
			//Month: 9
			//Day: 8
			//Enter today’s date:
			//Year: 2006
			//Month: 2
			//Day: 12
			//You have been alive for 5634 days.
			//You have slept 45072 hours.
	}

}
