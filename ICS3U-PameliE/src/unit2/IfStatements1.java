package unit2;

/**
* Description: worksheet 1 
* Date: 2024-11-05
* @author Ethan Pameli
*/

public class IfStatements1 {
	
  public static void main(String[] args) {
    int firstNum = 10;
    int secondNum = 30;

    System.out.println("Part 1: If");
    System.out.println("----------");
    if (firstNum > secondNum) {
      System.out.println("KEKW");
      System.out.println("OMEGLUL");
    }    

    //What prints out? Why? part 1 prints If because first number is less than second number

    System.out.println("\nPart 2: If, Else");
    System.out.println("----------------");
    if (firstNum > secondNum) {
      System.out.println("KEKW");
      System.out.println("OMEGALUL");
    } else {
      System.out.println("XQCL");
    }

    //What prints out? Why? prints XQCL because the else block was executed

    System.out.println("\nPart 3: If, Else if, Else");
    System.out.println("-------------------------");
    if (firstNum > secondNum) {
      System.out.println("KEKW");
      System.out.println("OMEGALUL");
    } else if (firstNum % 2 == 0 && secondNum % 3 == 0){
      System.out.println("sykSHY");
    } else {
      System.out.println("XQCL");
    }

    //What prints out? Why? it prints sykSHY because of line 54

    System.out.println("\nPart 4: What's the difference?");
    System.out.println("------------------------------");
    System.out.println(1);
    if (firstNum < secondNum) {
      System.out.println("KEKW");
      System.out.println("OMEGALUL");
    } else if (firstNum % 2 == 0 && secondNum % 3 == 0){
      System.out.println("sykSHY");
    } else {
      System.out.println("XQCL");
    }

    System.out.println(2);
    if (firstNum < secondNum) {
      System.out.println("KEKW");
      System.out.println("OMEGALUL");
    }

    if (firstNum % 2 == 0 && secondNum % 3 == 0){
      System.out.println("sykSHY");
    }

    if (!(firstNum < secondNum)) {
      System.out.println("XQCL");
    }

    //What prints out? Why? it Prints 1, KEW, OMEGALUL, 2, KEKW, OMEGSLUL, sykSHY because of lines 61,66,70
    //What is the difference between the first and second part? the second part prints out skySHY
    
  }
}