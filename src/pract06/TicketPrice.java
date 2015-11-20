package pract06;
/* Program Name: TicketPrice.java
 * Description: To get the price of tickets.
 * Author: Wen Liang
 * PEM Group: SF1503
 * Admin Number: 154473G
 * Date Created: 27 May 2015
 */

import java.text.DecimalFormat;
import java.util.*;

public class TicketPrice {
	private static Scanner sc;
	public static void main(String[] args) {
		
		int age, day = 0;
		String longday;
		DecimalFormat priceForm = new DecimalFormat("0.00");
		double price = 0.00;
		
		sc = new Scanner(System.in);
		System.out.print("Enter age: ");
		age = sc.nextInt();
		System.out.print("Enter day of week: ");
		day = sc.nextInt();
		
		if (age > 4 && age < 130){
		if (age < 16)
			price = 7.50;
		else if (age >= 16)
			price = (age < 65) ? 10.00 : 5.50;
		} else {
			System.out.println("You have entered an invalid age!");
		}
		price = (day == 6 || day == 7) ? 10.00 : price;
		switch(day) {
			case 1: longday = "Monday";
					break;
			case 2: longday = "Tuesday";
					break;
			case 3: longday = "Wednesday";
					break;
			case 4: longday = "Thursday";
					break;
			case 5: longday = "Friday";
					break;
			case 6: longday = "Saturday";
					break;
			case 7: longday = "Sunday";
					break;
			default: longday = "ERROR";
					break;
		}
		System.out.println("The ticket price on a " + longday + " for a person aged " + age + " will be: $" + priceForm.format(price)); 
	}
}
