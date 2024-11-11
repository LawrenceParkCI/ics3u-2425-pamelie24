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
