package unit1;

/**
 * Description: 
 * Date: 2024-10-21
 * Author:Ethan Pameli
 */

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.time.LocalDateTime;


public class GroceryShopping {
	/**
	 * This is the entry point to the program
	 * @param args
	 */


	public static void main(String[] args) {

		

		Scanner sc =  new Scanner(System.in);
		
		//My Variables
		String item1, item2;
		double itemCost1, itemCost2;
		int itemAmount1, itemAmount2;

		System.out.println("\n|| $$$ \\\\\\ ========== \"Ethans Groceries\" ========== /// $$$ ||\n\n");

		System.out.print("What would you like to purchase?: ");
		item1 = sc.nextLine();
		System.out.print("How much does it cost?: ");
		itemCost1 = sc.nextDouble();
		System.out.print("How many are you buying?: ");
		itemAmount1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Thank you.\n");

		System.out.print("What would you like to purchase?: ");
		item2 = sc.nextLine();
		System.out.print("How much does it cost?: ");
		itemCost2 = sc.nextDouble();
		System.out.print("How many are you buying?: ");
		itemAmount2 = sc.nextInt();
		System.out.println("Thank you.\n");

		sc.close();

		System.out.println("this is your receipt:\n\n\n");

		System.out.format("%24s"+ "Ethans" + "'s Groceries\n\n", "");

		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));

		
		double itemTotalPrice1 = itemCost1*itemAmount1, itemTotalPrice2 = itemCost2*itemAmount2, 
				cost = itemTotalPrice1 + itemTotalPrice2, tax = 0.13, total = cost + cost*tax, taxAmnt = cost*tax;

		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percentage = NumberFormat.getPercentInstance();
		
		System.out.format("\n%19s|%20s|%19s|%18s\n", "Item   ", "Price   ", "Quant.   ","Total   ");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.format("%-19s|%20s|%19d|%18s\n", item1, money.format(itemCost1), itemAmount1, money.format(itemTotalPrice1));
		System.out.format("%-19s|%20s|%19d|%18s\n", item2, money.format(itemCost2), itemAmount2, money.format(itemTotalPrice2));
		System.out.println("-------------------------------------------------------------------------------");
		System.out.format("\n%61s%18s","Subtotal:",money.format(cost));
		System.out.format("\n%61s%18s","Tax ("+ percentage.format(tax)+"):",money.format(taxAmnt));
		System.out.format("\n%61s%18s","Total:",money.format(total));
		System.out.format("\n\n%63s","Thank you for shopping at " + "Ethan" + "'s groceries. Come back again!");
	}

}