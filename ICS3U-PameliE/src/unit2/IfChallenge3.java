package unit2;
import java.util.Scanner;

/**
 * Description: This code will provide users with a quiz about the toronto maple leafs
 * Date: 2024-11-14
 * @author Ethan Pameli
*/

public class IfChallenge3 {
  public static void main(String[] args) {
	  
	  Scanner sc = new Scanner(System.in);
	  
	  //Stating initial variables
	  String q1;
	  double quizpoints = 0;
	  
	  //Introduction to the quiz, receive user input
	  System.out.print("Are you ready for your quiz!");
	  q1 = sc.next();
	  
	  //Print output
	  if (q1.equalsIgnoreCase("Yes")) {
		  System.out.println("Alright, it is now time to begin The Toronto Maple Leafs Quiz ");
		  
		  System.out.println("\n                                          \r\n"
			  		+ "                                   .$&$.                                   \r\n"
			  		+ "                                  .X&&&X.                                  \r\n"
			  		+ "                              .X;.x&&&&&x.;X.                              \r\n"
			  		+ "                              :&&&&&&&&&&&&&;                              \r\n"
			  		+ "                              ;&&&&&&$$&&&&&+                              \r\n"
			  		+ "                          .X+.+&&&&&&$$&&&&&+.+X.                          \r\n"
			  		+ "                          :&&&&&&&$$&X$&&&&&&&&&;                          \r\n"
			  		+ "                          +&&&&&&&&$xX$&&&&&&&&&+                          \r\n"
			  		+ "                          +&&&&&&&&&&+$&&&&&&&&&+                          \r\n"
			  		+ "                      $&&X+&&&&&&&&&&x$&$$&&&&&&+X&&$                      \r\n"
			  		+ "                      :$&&&&&&&&$$&&$x;$&&&&&&&&&&&&;                      \r\n"
			  		+ "                      .+&&&&&&&&&&X$$x$&&&&&&&&&&&&x.                      \r\n"
			  		+ " ....   .X$;.           +&&&&&&&&&&$++$&&&&&&&&&&&x           .;$X.   .... \r\n"
			  		+ "  X&$X;.;$&&$+. ..      .+&&&&X&&&&&$+$&&&&&X&&&&+.      ..  ;$&&&+.;X$&X  \r\n"
			  		+ "  .&&&&&&&&&&&&x&&x.   :&&&&&&&&x$&&$+$&&&XX&&&&&&&:   .+&&X&&&&&&&&&&&&:  \r\n"
			  		+ "   +&&$$&&&&&&&&&&&&;.  .$&&&&&&&$+$$+$&$;&&&&&&&$:  .;$&&&&&&&&&&&$&&&+.  \r\n"
			  		+ ":XX$&&&$X&$$&&&&&&&&&$: .;$&&&&&&&&$+;++$&&&&&&&&;. :$&&&&&&&&X&&&X&&&&$XX:\r\n"
			  		+ ".+&&&&&&&XX+&&$&&&&&&&&X:.x&&&&&&&&&$+$&&&&&&&&&x.:X&&&&&&&&&&x$x&&&&&&&&x.\r\n"
			  		+ "  .$&&&&$&&xx&&X&&&&&&&&&&;X&&&&&&&&&&&&&&&&&&&X;&&&&&&&&&&&&$:$&&&&&&&$.  \r\n"
			  		+ "   .;$&&&&XXXx+X$&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&$;+++$$&&&&;.   \r\n"
			  		+ "   +&&&&&&&&&&&+X&&&&&&&&&&$;...:$$;.;:.X&+.X&:x&$$&&&&&&&Xx&&&&&&&&&&&+.  \r\n"
			  		+ "    :&&&&&&&&&&&&&&&&x   .&&+.$&.$$;:&X.X$; :X.X&$:  .x&&&&&&&&&&&&&&&:    \r\n"
			  		+ "     .:X&&&&&&&&X;.;&+.X$:;&X.;:.X$;:&X.X$.x.:.$&&;:$&&x::+$&&&&&&&X:.     \r\n"
			  		+ "        .x$&&&&:+:;&&&:;&X.x&.+X.X$;...:XX.$x.:&&X.X&&x.x&+.&&&&$x.        \r\n"
			  		+ "        .X&&&&&&&$::&&X.::.;&$$&$$&&&&&&&$$&&XX&&:;&&X.X&+.X&&&&&$.        \r\n"
			  		+ "       .x&&&&&&&&&$.;$&$X&&&&&&&&&&&&&&&&&&&&&&&&&&&&.:Xx.X&&&&&&&x.       \r\n"
			  		+ "          ;$&&&&&&&&$&$:X&X.$&&:.x&&X...+&X.x&&&+...X&&+:$&&&&&$;          \r\n"
			  		+ "            .:X&&&&&&&$:.x..X&X ;.&&X.$x.&X.x&&&+;&&&&&&&&&&x:.            \r\n"
			  		+ "            ;$&&&&&&&&$:; ;.X&;.+.x&X...+&X.x&&&+:+X&&&&&&&&&$;            \r\n"
			  		+ "             .:X$$&&&&$:xXX.$$:X&;:$X:$&&&X...:&+...X&&&&$$X:.             \r\n"
			  		+ "               ;X$&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&$X;               \r\n"
			  		+ "          .;X&&&&&&&&&$:x&&&X.:;;$&&..+&&$.;;;&X.::.X&&&&&&&&&X;.          \r\n"
			  		+ "          .+$&&&&&&&&&$:x&&&X.;;X&&x.+.$&$.;;$&X..;&&&&&&&&&&&$+.          \r\n"
			  		+ "            ..;X&&&&&&$:x&&&X.X$&&$:.:.;&$.$$&&X+$$.X&&&&&&X;..            \r\n"
			  		+ "              .x&&&&&&$+;;;$X;;;;$$;&&X+$$;&&&&$;;;;$&&&&&&x.              \r\n"
			  		+ "            .x&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&x.            \r\n"
			  		+ "          .+&&&&&&&&&&&&&&&&&&$x+x$&$+;;+x$&&&&&&&&&&&&&&&&&&&$+.          \r\n"
			  		+ "         .X&&&&&$$&&&&$XX$$X+x&&&&$+$&&&&&&$+:;;++x$&&&&&$$&&&&&X.         \r\n"
			  		+ "        :x+:....:&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&$&&&&&&&&&&.....:+x:        \r\n"
			  		+ "               .XXx++;:X&&&&&&&&&X+X&&&;x$&&&&&&&&&X:;++xXX.               \r\n"
			  		+ "                      x&&&&$$X;   .x&&&:   .;X$$&&&&x                      \r\n"
			  		+ "                     ;x;...        .&&&$:       ...;x:                     \r\n"
			  		+ "                                    .$&&$:                                 \r\n"
			  		+ "                                     .X;  ");
			 
			  //Declare new variables 
			  String q2;
			  
			  //print question
			  System.out.println("\nQuestion #1");
			  System.out.println("Who is the team captian of the Toronto Maple Leafs?");
			  System.out.println("a) John Tavares");
			  System.out.println("b) Mitch Marner");
			  System.out.println("c) Auston Matthews");
			  System.out.println("d) Morgan Riley");
			  
			  //receive user input
			  System.out.print("\nWhat is your answer:");
			  q2 = sc.next();
			  
			  //Print output
			  if (q2.equalsIgnoreCase("C")) {
				  System.out.println("That is Correct! Good job");
				  quizpoints +=1;
			  }
			  else {
				  System.out.println("Wrong answer");
			  }
			  
			  //declare new variables
			  String q3;
			  
			  //Print Question
			  System.out.println("\nQuestion #2");
			  System.out.println("How many stanley cups have the Toronto Maple Leafs won?");
			  System.out.println("a) 0");
			  System.out.println("b) 7");
			  System.out.println("c) 14");
			  System.out.println("d) 13");
			  
			  //receive user input
			  System.out.print("\nWhat is your answer:");
			  q3 = sc.next();
			  
			  //Print Output
			  if (q3.equalsIgnoreCase("D")) {
				  System.out.println("That is Correct! Good job");
				  quizpoints +=1;
			  }
			  else {
				  System.out.println("Wrong answer");
			  }
			  
			  //declare variables
			  String q4;
			  
			  //Print Question
			  System.out.println("\nQuestion #3");
			  System.out.println("When was the last time the Toronto Maple leafs won the Stanley Cup?");
			  System.out.println("a) 1967");
			  System.out.println("b) 1972");
			  System.out.println("c) 1990");
			  System.out.println("d) 1963");
			  
			  //receive user input
			  System.out.print("\nWhat is your answer:");
			  q4 = sc.next();
			  
			  //Print Output
			  if (q4.equalsIgnoreCase("A")) {
				  System.out.println("That is Correct! Good job");
				  quizpoints +=1;
			  }
			  else {
				  System.out.println("Wrong answer");
			  }
			  
			  //declare variable
			  String q5;
			  
			  //Print Question
			  System.out.println("\nQuestion #4");
			  System.out.println("Who has the most points Toronto Maple leaf in history?");
			  System.out.println("a) Jackson Teshima");
			  System.out.println("b) Mats Sundin");
			  System.out.println("c) Auston Matthews");
			  System.out.println("d) Darryl sittler");
			  
			  //receive user input
			  System.out.print("\nWhat is your answer:");
			  q5 = sc.next();
			  
			  //Print Output
			  if (q5.equalsIgnoreCase("B")) {
				  System.out.println("That is Correct! Good job");
				  quizpoints +=1;
			  }
			  else {
				  System.out.println("Wrong answer");
			  }
			  
			//Print final parts of the quiz and grade
			  System.out.println("\nYour Quiz is finnished, Well done");
			  System.out.println("Your Score is: " + quizpoints + "/4");
			  System.out.println("\nYour Final Mark is: " + ((quizpoints / 4)*100)+"%");
		  
	  }
	  else {
		  System.out.println("Okay you will recive a 0, but thats your choice!");
	  }
	  
	  //introduction to the quiz
	 
	  
	  
	
    //This is for the portfolio

    /*
    Write an interactive quiz. It should ask the user three 
    multiple-choice or true/false questions about something. 
    It must keep track of how many they get wrong, and print 
    out a "score" at the end.

    Sample:

    Are you ready for a quiz?  N
    Okay, here it comes!

    Q1) What is the capital of Alaska?
      1) Melbourne
      2) Anchorage
      3) Juneau

    > 3

    That's right!
    */
  }
}