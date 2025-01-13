package culminating;

import java.util.Random;
import java.util.Scanner;

public class culminatingReal {

    // Method to calculate the total score
    public static int calculateScore(int currentScore, boolean isCorrect) {
        if (isCorrect) {
            currentScore += 1;
        }
        return currentScore;
    }

    // Method to check if the user's answer is correct
    public static boolean checkAnswer(String correctAnswer, String userAnswer) {
        return correctAnswer.equalsIgnoreCase(userAnswer.trim());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
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
        //Next line checks if the correct answer was chosen 
        boolean isCorrect = checkAnswer("A", userAnswer);
        totalScore = calculateScore(totalScore, isCorrect);
        System.out.println(isCorrect ? "Correct!" : "Incorrect. The correct answer is A.");
        questionNumber++;

        // Question 2: True or False
        System.out.println("\nQuestion " + questionNumber + ": True or False: Depreciation is a way to allocate the cost of an asset over its useful life.");
        System.out.print("Enter your answer (True/False): ");
        userAnswer = scanner.nextLine();
        isCorrect = checkAnswer("True", userAnswer);
        totalScore = calculateScore(totalScore, isCorrect);
        System.out.println(isCorrect ? "Correct!" : "Incorrect. The correct answer is True.");
        questionNumber++;

        // Question 3: Random number-based question
        int randomNumber = random.nextInt(1000) + 1; // Generate a random number 
        //ASk user question
        System.out.println("\nQuestion " + questionNumber + ": Suppose a company purchases equipment for $" + randomNumber + ". If the equipment depreciates by 10% annually, what will its value be after one year?");
        System.out.print("Enter your answer: ");
        double userAnswerDouble = scanner.nextDouble();
        double correctValue = randomNumber * 0.9;
        isCorrect = Math.abs(userAnswerDouble - correctValue) < 0.01; // Allow small margin of error
        totalScore = calculateScore(totalScore, isCorrect);
        System.out.println(isCorrect ? "Correct!" : String.format("Incorrect. The correct answer is %.2f.", correctValue));
        questionNumber++;

        // Question 4: Fill in the blank
        System.out.println("\nQuestion " + questionNumber + ": Fill in the blank: Revenue - Expenses = ______.");
        System.out.print("Enter your answer: ");
        scanner.nextLine(); // Consume the newline
        userAnswer = scanner.nextLine();
        isCorrect = checkAnswer("Net Income", userAnswer);
        totalScore = calculateScore(totalScore, isCorrect);
        System.out.println(isCorrect ? "Correct!" : "Incorrect. The correct answer is Net Income.");
        questionNumber++;

        // Question 5: True or False
        System.out.println("\nQuestion " + questionNumber + ": True or False: Accounts payable is an asset account.");
        System.out.print("Enter your answer (True/False): ");
        userAnswer = scanner.nextLine();
        isCorrect = checkAnswer("False", userAnswer);
        totalScore = calculateScore(totalScore, isCorrect);
        System.out.println(isCorrect ? "Correct!" : "Incorrect. The correct answer is False.");
        questionNumber++;
        // Display final score
        System.out.println("\nTest Completed!");
        System.out.println("Your total score is: " + totalScore + " out of " + (questionNumber - 1));

        scanner.close();
    }
}

