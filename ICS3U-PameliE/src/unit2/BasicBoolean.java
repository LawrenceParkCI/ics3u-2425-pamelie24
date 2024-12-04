package unit2;

/**
* Description:
* Date:
* @author
*/

public class BasicBoolean {
	/**
	 * This is the entry point to the program
	 * @param args
	 */

	
  public static void main(String[] args) {
    //we've declared a variable called isPurple of boolean type
    //Recall: boolean holds either ________ or __________
    boolean isPurple = false;


    /*
      Boolean Operators, Expressions
    */

    //boolean expressions are ways we can "calculate" whether
    //something is true or false

    int firstNum = 5;
    int secondNum = 10;
    double thirdNum = 5.5;

    //this prints out true because 5 is less than 10
    System.out.println("1: " + (firstNum < secondNum)); 

    //this prints out false because 5 is less than 10
    System.out.println("2: " + (firstNum > secondNum)); 

    int firsttNum = 0;
	//this prints out true because 5 is less than 5.5
    System.out.println("3: " + (firsttNum <= (int)thirdNum)); 
    //this prints out true because 5 is less than
    System.out.println("4: " + (firstNum <= thirdNum)); 

    /*Test out these boolean operators. Figure out the meaning
      * > means: greater than
      * < means:less than
      * <= means:less than or equal to
      * >= means:greater than or equal to
      * == means: equal to
      * != means: not equal to
    */

  }
}