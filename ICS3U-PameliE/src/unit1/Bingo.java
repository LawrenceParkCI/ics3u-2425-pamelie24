package unit1;
/**
 * Description:this code prints out a formated bingo card
 * Date: 2024-09-25
 * @author Ethan Pameli
 * 
 */
public class Bingo {
	/**
	 * This is the entry point to the program
	 * @param args
	 */


	public static void main(String[] args) {
		// The Bingo Steps 
		System.out.println("THE BIG BINGO CARD!!!!!");
		System.out.println("1. The Caller randomly pulls out a numbered bingo ball");
		System.out.println("2. The number is placed on the bingo board and called out");
		System.out.println("3. Players look for the called outnumber on their bingo card");
		System.out.println("4. If the number is located, it is marked off on the players card");
		System.out.println("5. Repeat steps 1-4 until someone scores a BINGO");
		System.out.println("6. The winning player must call out BINGO to make it official");
		System.out.println("------------------------------------------------------------------");
		System.out.format("%10s%10s%10s%10s%10s","B", "I", "N", "G", "O");
		System.out.format("\n%10s%10s%10s%10s%10s","3", "17", "37", "59", "66");
		System.out.format("\n%11s%9s%10s%10s%10s", "13", "28", "43", "49", "73");
		System.out.format("\n%10s%10s%11s%9s%10s", "9", "22", "FREE", "60", "60");
		System.out.format("\n%11s%9s%10s%10s%10s", "10", "24", "33", "55", "68");
		System.out.format("\n%10s%10s%10s%10s%10s", "2", "23", "30", "46", "75");
		System.out.format("\n------------------------------------------------------------------");

	}

}
