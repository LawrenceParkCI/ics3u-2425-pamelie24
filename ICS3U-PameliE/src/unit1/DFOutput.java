package unit1;
/*
 * DEscription
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class DFOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Run the following program with a cost of 10.00.
		//What value is displayed in the output?
		
		final double TAX_RATE = 0.13;
		DecimalFormat money = new DecimalFormat("$0.##");
		DecimalFormat percent = new DecimalFormat("#.#%");

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);
		
		System.out.println("The cost of your item with tax is " + money.format(total));		

		//Change the above print statement on line 19 to:
		//System.out.println("The cost of your item with tax is " + money.format(total));
		//Run the program again, how is the output different? Why? THe OUtput adds an extra decimal point
		
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$0.00"
		//Run the program again with the cost of 10, how is the output different? the output is different because there is now a dollar sign 
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Run the program again with the cost of 10, how is the output different? There is 1 reduced to one decimal place 
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Calculate 10.50 x 1.13 = 11.865
		//Run the program again with the cost of 10.50, what is happening? the output rounded the decimal places by 2
		
		//Modify the parameter for the DecimalFormat on line 15 as you think is appropriate for money.
		//Run the program again with the cost of 123456, what is displayed? the cost of your item with tax $139505.28
		
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$#,###,##0.00"
		//Run the program again with the cost of 123456, how is the output different? Explain what is happening.
		//$139,505.28. It is different because commas were added
		
		
		//Uncomment the following print line, and run the program with any value for the cost.
		//What value is printed for the TAX_RATE?
		System.out.println("The tax rate is " + TAX_RATE);
		
		


		sc.close();
	}

}