package unit2;

import java.util.Scanner;

/**
 * Description: completed worksheet
 * Date: 2024-11-19
 * @author Ethan Pameli
 */
public class NameGame {

	public static void main(String[] args) {
		/*
		 * The application should prompt the user for their name. 
		 * 70% of the time the program should output that the user's name is their favourite, 
		 * and 30% of the time says they hate that name.
		 * */
		
		Scanner sc = new Scanner(System.in);
		//declare variables
		String name1;
		 //receive user input
		System.out.println("Please input your name!");
		name1=sc.next();
		
		//print output
		if (Math.random() >= 0.3) {
			System.out.println("I Love the name " + name1 + " it is my favorite name");
		}
		else {
			System.out.println("I hate the name " + name1 + " it sucks!");
		}


	}

}
