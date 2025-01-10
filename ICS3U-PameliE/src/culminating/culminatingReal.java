package culminating;

import java.util.Scanner;

public class culminatingReal {

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
	
	  }
	}