package unit2;


/** 
 * https://www.geeksforgeeks.org/java-math-random-method-examples/
 * Description: this is randomness
 * Date: 2024-11-19
 * @author: Ethan Pameli
 */


public class Randomness {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println(Math.random()*900+100);
		}

		//Run the program a few times. What do you think is the 
		//range of the numbers generated? 0.0 -> 1.0 

		//Read the demo program. Write the code so that the program 
		//will produce a random number between 100 and 1000.

	}
}