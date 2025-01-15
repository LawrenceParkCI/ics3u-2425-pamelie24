package culminating;

import java.util.Random;
import java.util.Scanner;
/**
 * Date: 2025-01-14
 * Description: This is my culminating code, this code is a 12 question, grade 11 accounting test. This code includes random number, fill in the blank,and multiple choice.
 * @author Ethan Pameli
 */
public class culminatingReal {

	/**
	 * Description: This method calculates the score after each correct or incorrect question
	 * @param totalScore => adds 1 to the score if the answer is correct
	 * @param isCorrect => if answer is correct it adds 1 if its incorrect it returns to the current score 
	 * @return => This returns the score after each question 
	 */
	public static double calculateScore(double totalScore, boolean isCorrect) {
		if (isCorrect) {
			totalScore += 1;
		}
		return totalScore;
	}

	/**
	 * Description: This method is used to check if an answer inputed by the user is correct or not
	 * @param correctAnswer => correct answer is used to compare the user input to the correct answer
	 * @param userAnswer =>  stores the answer inputed by the user for each question 
	 * @return => this returns if the answer is correct or incorrect 
	 */
	public static boolean checkAnswer(String correctAnswer, String userAnswer) {
		return correctAnswer.equalsIgnoreCase(userAnswer.trim());
	}

	/**
	 * This is the entry point to the program 
	 * @param args unused
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		//declaring variables
		double totalScore = 0;
		int questionNumber = 1;


		System.out.println("Welcome to the Grade 11 Accounting Test!");
		System.out.println("Answer the questions below to the best of your ability.\n");

		// Question 1: Multiple Choice
		//ask question
		System.out.println("Question " + questionNumber + ": What is the accounting equation?");
		//provides answer options
		System.out.println("A. Assets = Liabilities + Equity");
		System.out.println("B. Assets = Revenue - Expenses");
		System.out.println("C. Assets = Liabilities - Equity");
		System.out.print("Enter your answer (A, B, or C): ");
		String userAnswer = scanner.nextLine();
		//Next line checks if the answer is correct 
		boolean isCorrect = checkAnswer("A", userAnswer);
		totalScore = calculateScore(totalScore, isCorrect);
		System.out.println(isCorrect ? "Correct!" : "Incorrect. The correct answer is A.");
		questionNumber++;

		// Question 2: True or False
		//ask user question
		System.out.println("\nQuestion " + questionNumber + ": True or False: Depreciation is a way to allocate the cost of an asset over its useful life.");
		//provides answer options
		System.out.print("Enter your answer (True/False): ");
		userAnswer = scanner.nextLine();
		//Next line checks if the answer is correct
		isCorrect = checkAnswer("True", userAnswer);
		totalScore = calculateScore(totalScore, isCorrect);
		System.out.println(isCorrect ? "Correct!" : "Incorrect. The correct answer is True.");
		questionNumber++;

		// Question 3: Random number-based question
		//generate random number
		int randomNumber = random.nextInt(1000) + 1; 
		//ASk user question
		System.out.println("\nQuestion " + questionNumber + ": Suppose a company purchases equipment for $" + randomNumber + ". If the equipment depreciates by 10% annually, what will its value be after one year?");
		//provides answer instructions
		System.out.print("Enter your answer: ");
		double userAnswerDouble = scanner.nextDouble();
		double correctValue = randomNumber * 0.9;
		//Next line checks if the answer is correct
		isCorrect = Math.abs(userAnswerDouble - correctValue) < 0.01; // Allow small margin of error
		totalScore = calculateScore(totalScore, isCorrect);
		System.out.println(isCorrect ? "Correct!" : String.format("Incorrect. The correct answer is %.2f.", correctValue));
		questionNumber++;

		// Question 4: Fill in the blank
		//ask user question
		System.out.println("\nQuestion " + questionNumber + ": Fill in the blank: Revenue - Expenses = ______.");
		System.out.print("Enter your answer: ");
		//Provides answer instructions
		scanner.nextLine(); 
		userAnswer = scanner.nextLine();
		//Next line checks if the answer is correct
		isCorrect = checkAnswer("Net Income", userAnswer);
		totalScore = calculateScore(totalScore, isCorrect);
		System.out.println(isCorrect ? "Correct!" : "Incorrect. The correct answer is Net Income.");
		questionNumber++;

		// Question 5: True or False
		//ask user question
		System.out.println("\nQuestion " + questionNumber + ": True or False: Accounts payable is an asset account.");
		//provides answer options
		System.out.print("Enter your answer (True/False): ");
		userAnswer = scanner.nextLine();
		//Next line checks if the answer is correct
		isCorrect = checkAnswer("False", userAnswer);
		totalScore = calculateScore(totalScore, isCorrect);
		System.out.println(isCorrect ? "Correct!" : "Incorrect. The correct answer is False.");
		questionNumber++;

		// Question 6: Multiple Choice
		//ask user question
		System.out.println("\nQuestion " + questionNumber + ": Which financial statement shows a company's financial position at a specific point in time?");
		//provides answer options
		System.out.println("A. Income Statement");
		System.out.println("B. Balance Sheet");
		System.out.println("C. Cash Flow Statement");
		System.out.print("Enter your answer (A, B, or C): ");
		userAnswer = scanner.nextLine();
		//Next line checks if the answer is correct
		isCorrect = checkAnswer("B", userAnswer);
		totalScore = calculateScore(totalScore, isCorrect);
		System.out.println(isCorrect ? "Correct!" : "Incorrect. The correct answer is B.");
		questionNumber++;

		// Question 7: Numerical Question
		//ask user question
		System.out.println("\nQuestion " + questionNumber + ": If a company has $500,000 in assets and $200,000 in liabilities, what is the equity?");
		//provides answer instructions
		System.out.print("Enter your answer: ");
		userAnswerDouble = scanner.nextDouble();
		double correctAnswer = 500000 - 200000;
		//Next line checks if the answer is correct
		isCorrect = Math.abs(userAnswerDouble - correctAnswer) < 0.01;
		totalScore = calculateScore(totalScore, isCorrect);
		System.out.println(isCorrect ? "Correct!" : "Incorrect. The correct answer is 300,000.");
		questionNumber++;

		// Question 8: True or False
		//ask user question
		System.out.println("\nQuestion " + questionNumber + ": True or False: Revenue is recorded when cash is received.");
		//provides answer options
		System.out.print("Enter your answer (True/False): ");
		scanner.nextLine(); 
		userAnswer = scanner.nextLine();
		//Next line checks if the answer is correct
		isCorrect = checkAnswer("False", userAnswer);
		totalScore = calculateScore(totalScore, isCorrect);
		System.out.println(isCorrect ? "Correct!" : "Incorrect. The correct answer is False.");
		questionNumber++;

		// Question 9: Multiple Choice
		//ask user question
		System.out.println("\nQuestion " + questionNumber + ": What does GAAP stand for?");
		//provides answer options
		System.out.println("A. Generally Accepted Accounting Principles");
		System.out.println("B. General Accounting and Auditing Practices");
		System.out.println("C. Government and Accounting Procedures");
		System.out.print("Enter your answer (A, B, or C): ");
		userAnswer = scanner.nextLine();
		//Next line checks if the answer is correct
		isCorrect = checkAnswer("A", userAnswer);
		totalScore = calculateScore(totalScore, isCorrect);
		System.out.println(isCorrect ? "Correct!" : "Incorrect. The correct answer is A.");
		questionNumber++;

		// Question 10: Fill in the blank
		//ask user question
		System.out.println("\nQuestion " + questionNumber + ": Fill in the blank: The statement of cash flows is divided into operating, investing, and ______ activities.");
		//provides answer options
		System.out.print("Enter your answer: ");
		userAnswer = scanner.nextLine();
		//Next line checks if the answer is correct
		isCorrect = checkAnswer("Financing", userAnswer);
		totalScore = calculateScore(totalScore, isCorrect);
		System.out.println(isCorrect ? "Correct!" : "Incorrect. The correct answer is Financing.");
		questionNumber++;

		// Question 11: Chart-based Question
		//ask user question
		System.out.println("\nQuestion " + questionNumber + ": Based on the sales chart below, which product had the highest sales in Q1?");
		//provides answer options
		System.out.println("Product A: |||||||||||||||| (150 units)");
		System.out.println("Product B: |||||||||| (100 units)");
		System.out.println("Product C: ||||||||||||||||||||| (170 units)");
		System.out.print("Enter your answer (A, B, or C): ");
		userAnswer = scanner.nextLine();
		//Next line checks if the answer is correct
		isCorrect = checkAnswer("C", userAnswer);
		totalScore = calculateScore(totalScore, isCorrect);
		System.out.println(isCorrect ? "Correct!" : "Incorrect. The correct answer is C.");
	


		// Display final score
		System.out.println("\nTest Completed!");
		System.out.println("Your total score is: " + totalScore + "/" + (questionNumber));
		//calculate %
		System.out.println("Your total score in a percentage is " + totalScore/questionNumber*100 + "%");


		scanner.close();
	}
}

