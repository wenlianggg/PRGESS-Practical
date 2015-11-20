package pract08;
/* Program Name: Q1_OnlineOrder
 * Description: Prints out the total price of order input
 * Author: Wen Liang
 * PEM Group: SF1503
 * Admin Number: 154473G
 * Date Created: 2 July 2015
 */

import java.util.Scanner;

public class Q1_OnlineOrder 
{
	// define constants
	static final double HAMBURGER = 1.5;
	static final double CHEESE_BURGER = 2.50;
	static final double FRENCH_FRIES = 2.0;
	static final double DRINK = 1.95;
	private static Scanner sc;
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int choice, quantity;
		double price = 0, total = 0;
		// variables to format messages on console
		String msg = "";
		String output = "You have ordered";
		boolean toCont;
		boolean firstTime = true;
		choice = readChoice();
		switch (choice) 
		{
			case 1:
				msg = "hamburgers";
				price = HAMBURGER;
				break;
			case 2:
				msg = "cheeseburgers";
				price = CHEESE_BURGER;
				break;
			case 3:
				msg = "French fries";
				price = FRENCH_FRIES;
				break;
			case 4:
				msg = "soft drinks";
				price = DRINK;
				break;
			default:
				msg = "Invalid Choice!";
		}
				System.out.print("Enter the quantity of "+ msg + ":");
				quantity = sc.nextInt();
				sc.nextLine();	//Still remember why we need this here?

				total += price * quantity;

				if (firstTime) 
				{
					output = output + " " + quantity + " " + msg;
					firstTime = false;
				} 
				else {
					output = output + ", " + quantity + " " + msg;
			}

			System.out.print("\nDo you want to continue (yes/no)? ");
			toCont = readYesNo();
			if (toCont == true) {

				boolean isStudent;
				System.out.print("Are you a student (yes/no) ");
				isStudent = readYesNo();
				if (isStudent == true)
					total = total * 0.9;
				System.out.println(output);
				System.out.printf("You have to pay total of $%.2f", total);
				sc.close();
			}
}

	public static boolean readYesNo() {
		sc = new Scanner (System.in);
		boolean toCont;
		String choice = sc.nextLine();
		if (choice.charAt(0) == 'y' || choice.charAt(0) == 'Y')
			toCont = true;
		else
			toCont = false;
		return toCont;
	}
	
	
	public static int readChoice() {
		int choice = 0;
		int invalid = 0;
		sc = new Scanner(System.in);
		System.out.println("Item\t\t\tPrice");
		System.out.println("====\t\t\t=====");
		System.out.printf("1. Hamburger\t\t%.2f\n", HAMBURGER);
		System.out.printf("2. Cheeseburger\t\t%.2f\n", CHEESE_BURGER);
		System.out.printf("3. French Fries\t\t%.2f\n", FRENCH_FRIES);
		System.out.printf("4. Soft drinks\t\t%.2f\n", DRINK);
		System.out.print("Enter your choice (1,2,3 or 4): ");
		do {
			choice = sc.nextInt();
			if (choice >= 5 || choice <= 0) {
				invalid = 1;
			}
		} while (invalid == 1);
		return choice;
	}
}
