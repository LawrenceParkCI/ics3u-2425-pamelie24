package unit1;
/**
 * Description: this code prints and analyzes the sentence imputed in by the user
 * Date: 2024-10-08
 * @author Ethan Pameli
 */
import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Declare variables
		String sentence;
		
		//Receive user input
		System.out.println("Type in a sentence");
		sentence = sc.nextLine();
		
		//print output
		System.out.println("\nThe following has been printed");
		System.out.println("\n" + sentence);
		System.out.println(sentence.toUpperCase());
		System.out.println(sentence.toLowerCase());
		System.out.println("The sentence is " + sentence.length() + "characters long");
		System.out.println("At index 5, the character displayed is:" + sentence.charAt(5));
		sc.close();
		
		//BONUS
		
		System.out.println("BONUS");
		
		

	}

}
