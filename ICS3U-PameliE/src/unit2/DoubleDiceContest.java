package unit2;

/**
 * Description:  completed worksheet
 * Date: 2024-11-19
 * @author Ethan Pameli
 */
public class DoubleDiceContest {
	/**
	 * This is the entry point to the program
	 * @param args
	 */


	public static void main(String[] args) {
		
		//declare variables
		int die1, die2, die3, die4;
		
		//Human random rolls
		System.out.println("Human Rolls");
		die1=(int)(Math.random()*6)+1;
		System.out.println(die1);
		die2=(int)(Math.random()*6)+1;
		System.out.println(die2);
		System.out.println("The Human Score is " + (die1+die2));
		
		//Computer random rolls
		System.out.println("\nComputer Rolls");
		die3=(int)(Math.random()*6)+1;
		System.out.println(die3);
		die4=(int)(Math.random()*6)+1;
		System.out.println(die4);
		System.out.println("The Computer Score is " + (die3+die4));
		
		if ((die3+die4) > (die1+die2)) {
			System.out.println("\nThe computer has won");
		}
		else {
			System.out.println("\nYou have won");
		}
		/*
		 * Write code that simulates rolling two dice for the user and then two dice for the computer. 
		 * The program should output the total of the two dice for both the user and the computer, 
		 * then announce who won: the computer, the user, or say it was a tie.
		 */


	}

}
