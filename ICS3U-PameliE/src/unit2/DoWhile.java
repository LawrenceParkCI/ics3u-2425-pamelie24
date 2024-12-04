package unit2;

/**
Description:  completed worksheet
Date: 2024-11-21
@author Ethan Pameli
*/

import java.util.Scanner;

public class DoWhile {
	/**
	 * This is the entry point to the program
	 * @param args
	 */

 public static void main(String[] args) {
   /*
   A loop is another control structure that allows for repetition. It 
   does not make a decision on which branch to go on, like the 
   conditional.
   It makes a decision whether it should go back to redo a set of code.
   */
   Scanner in = new Scanner(System.in);
   String name;
   do {
     System.out.print("What is your name? ");
     name = in.nextLine();
   } while (!name.equals("Mr. Lee"));

   System.out.println("You are welcome into the secret secret pogchamp club.");



   //Run the code. Explain the code in your own words
   //this code will print out the question "What is your name" and will receive user input until the name entered is Mr.Lee

   //What code is repeated?
   // do {System.out.print("What is your name? ");
   //name = in.nextLine();
   //When does it decide whether to repeat or not?
   //  } while (!name.equals("Mr. Lee"));
   //What is the condition for repeating?
   //while, and do


   /*
    Note:Pay attention to the brackets, and the semicolon
   */

   /*
     When constructing a loop, there are many strategies. I like to 
     break down the problems this way:
       1. What commands am I going to repeat?
       2. How many times/until when will I repeat the code?
   */

   //Create a do-while loop that asks for a word, and 
   //prints it out 20 times.
   
   String inputedWord;
   int counter = 1;
     System.out.println("\nWhat word do you want to be printed");
	   inputedWord = in.nextLine();
	 do {
	   System.out.println(inputedWord);
	   counter += 1;
	   
   } while (counter <= 20);
   
   System.out.println("#1 Victory Royal");
   
   in.close();
 }
}