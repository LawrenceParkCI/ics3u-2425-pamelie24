package unit2;

import java.util.Scanner;

/**
* Description:
* Date: 2024-11-05
* @author Ethan Pameli
*/

public class IfStatements2 {
	/**
	 * This is the entry point to the program
	 * @param args
	 */

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("What is your age?");
    int userAge = in.nextInt();
    
    if (userAge > 18) { //If they're over 18, they are titled an adult
      String title = "Adult";
    } else {  //if they're not over 18, I don't want a title
      System.out.println("Sorry, not quite yet.");
    }

    char[] title = null;
	System.out.println(title);
    
    //Looking at the logic above, why do you think the 
    //program won't work? because title is not a variable

    //Copy the code below, and try to find a solution.
    //Comment the code above to avoid compilation errors.
    
    


  }
}