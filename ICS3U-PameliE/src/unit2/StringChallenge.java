package unit2;

import java.util.Scanner;

/**
 * Description:
 * Date: 2024-11-11
 * @author Ethan Pameli
*/

public class StringChallenge {
  public static void main(String[] args) {
	  
	Scanner sc = new Scanner(System.in);
	
	//declare first variables
	String s1, s2;
	
	//receive user input 
	System.out.println("Input the month you were born");
	s1 = sc.next();
	System.out.println("Input another month");
	s2 = sc.next();
	
	//Print Output
	if (s1.compareTo(s2)==0) {
		System.out.println("The same month was inputed!");
	}
	else {
		System.out.println("The months inputed are different");
	}
	
	//declare more variables
	String s3, s4;
	
	//receive user input
	System.out.println("Input a colour");
	s3 = sc.next();
	System.out.println("Input another colour");
	s4 = sc.next();
	
	//Print output
	if (s3.equals(s4)== true) {
		System.out.println("You typed the same colour in twice!");
	}
	else if (s3.equalsIgnoreCase(s4)) {
		System.out.println("you typed in teh same colour but one of them was lowercase!!");
	}
	else {
		System.out.println("you inputed two different colours");
	}
	
	//declaring two new variables
	int s5;
	String s6 = "5";
	
	//recieve user input
	System.out.println("input an intiger");
	s5 = sc.nextInt();
	
	//Print output
	System.out.println("The inputed intiger was:" +5); //implict casting
	System.out.println("The total of the inputed intiger and 5 is:" + (s5 + Integer.parseInt(s6))); //explicit casting
    //This is for the portfolio

    /*
    Create a program that demonstrates the use of .equals(), .equalsIgnoreCase(), .compareTo().  You should be using if statements for this program.

    Also, include an example of explicit and implicit casting.

    Comment to explain:
      -when you use the different String functions
      -when you are casting and how the value is changed
    */
  }
}
