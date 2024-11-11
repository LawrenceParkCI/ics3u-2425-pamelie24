package unit2;

import java.util.Scanner;

/**
 * Description: In this code, I show different ways to print and compare strings
 * Date: 2024-11-11
 * @author Ethan Pameli
*/

class StringComparison {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    
    String answer;

    System.out.println("What is the capital of Ontario?");
    answer = in.nextLine();

    if (answer == "Toronto") {
      System.out.println("Correct!");
    } else {
      System.out.println("Sorry, that's incorrect.");
    }
    
    //Run the code. What happens when you type the correct answer? The incorrect answer?
    // when you input the correct answer and the incorrect answer it prints out sorry, that's incorrect for both

    /*
      Strings are objects, not primitives and as such are a 
      *reference* data type. These variables hold an address 
      to the value. (Scanner is also a reference data type)

      int, double, char, etc. are all *primitive* data types. 
      These variables hold the actual value.

      Look at the website:
      https://www.javatpoint.com/string-comparison-in-java

      Demonstrate the use of the functions:
        .compareTo()
        .equals()
        .equalsIgnoreCase()
    */
    //compareTo() code
    String str1 = "Bananna";  
    String str2 = "Bananna";  
    String str3 = "Grape";  
    System.out.println(str1.compareTo(str2));      // 0  
    System.out.println(str1.compareTo(str3));      // 1 (str1 > str3)  
    System.out.println(str3.compareTo(str1));      // -1 (str3 < str1)  
    
    //equals() code
    String s1="Bananna";  
    String s2="Bananna";  
    String s3=new String("Bananna");  
    String s4="Grape";  
    System.out.println(s1.equals(s2));//true  
    System.out.println(s1.equals(s3));//true  
    System.out.println(s1.equals(s4));//false  
    
    
    //equalsIgnoreCase() code
    String s11 = "Car";  
    String s21 = "cAr";  
    
    boolean equalsResult = s11.equals(s21);  
    System.out.println("Using equals() method: " + equalsResult); // Output: false  
     
    boolean equalsIgnoreCaseResult = s11.equalsIgnoreCase(s21);  
    System.out.println("Using equalsIgnoreCase() method: " + equalsIgnoreCaseResult); // Output: true  


    //What values does compareTo() return?  compareTo() prints out 0, -5, 5

    //what value does equals() and equalsIgnoreCase() return? equals() prints out true true false, and equalsIgnoreCase() prints false and true
    //What is the difference between these two functions? the difference between the two functions is that equals is case sensitive (meaning it checks weather the words include capitals ect) and the other codes are not case sensitive
  }
}
