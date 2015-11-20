package pract04;

/* Program Name: Myself.java
 * Description: The whole of practical 4
 * Author: Wen Liang
 * PEM Group: SF1503
 * Admin Number: 154473G
 * Date Created: 7 May 2015
 */

import java.util.*;
import java.text.*;

public class Myself {
	final static double KG_TO_POUNDS = 2.20462;
	final static double METRE_TO_FEET = 3.28084;
	final static double CPF = 0.2;
	final static double LOAN_REPAYMENT = 1500;
	final static double TAX = 0.07;
	final static double DELIVERY_CHARGE = 0.5;
	private static Scanner sc;
	final static DecimalFormat numForm = new DecimalFormat("0.00");
	public static void main(String args[]) {
		int questionnumber = 0;
		sc = new Scanner(System.in);
		System.out.println("Welcome to Wen Liang's Practical 4!");
		System.out.print("Enter the question number you want to run (1 to 6): ");
		try {
		questionnumber = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("An error has occured");
			System.exit(0);
		} 
		if (questionnumber == 1) {
			String name;
			String adminnum;
			char gender;			
			double weight, height, heightInFeet, bmi, weightInPounds;
			int age;
			age = 17;
			name = "Wen Liang";
			gender = 'M';
			adminnum = "154473G";
			weight = 83.5;
			height = 1.78;
			heightInFeet = height * METRE_TO_FEET;
			bmi = (weight/(height*height));
			weightInPounds = weight * KG_TO_POUNDS;
			System.out.println("Name: " + name);
			System.out.println("Admin Number: " + adminnum);
			System.out.println("Age: " + age + " years old");
			System.out.println("Gender: " + gender);
			System.out.println("Weight: " + weight + "kg (" + weightInPounds + "lbs)");
			System.out.println("Height: " + height + " or " + heightInFeet + " feet");
			System.out.println("BMI: " + bmi);
			
		} else if (questionnumber == 2) {
			char a = 'A';
			System.out.println("a is " + a);
			int i = a;
			System.out.println("i is " + i);
			a = 65;
			System.out.println("a is " + a);
			
		} else if (questionnumber == 3) {
			int yearlygross = 0;
			System.out.print("Enter the yearly gross salary: ");
			try {
			yearlygross = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("An error has occured");
				System.exit(0);
			}
			int monthlygross = yearlygross / 12;
			double monthlycpf = CPF * monthlygross;
			double takehome = monthlygross - monthlycpf - LOAN_REPAYMENT;
			System.out.println("The monthly take home pay is: $" + numForm.format(takehome));
			
		} else if (questionnumber == 4) {
			double itemprice = 0;
			int itemamt = 0;
			try {
			System.out.print("Enter the price of each item: ");
			itemprice = sc.nextDouble();
			System.out.print("Enter the number of items: ");
			itemamt = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("An error has occured");
				System.exit(0);
			}
			double totalprice = (((itemamt * itemprice) + DELIVERY_CHARGE) * (1 + TAX));
			System.out.println("The total price is: $" + numForm.format(totalprice));
			
		} else if (questionnumber == 5) {
				long seconds = 0;
				long secondsInput = 0;
				long minutes;
				long hours;
				System.out.print("Enter the amount of seconds you would like to convert: ");
				try {
				seconds = sc.nextLong();
				} catch (InputMismatchException e) {
					System.out.println("An error has occured!");
					System.exit(0);
				}
				if (seconds >= 60) {
				secondsInput = seconds;
				  hours = (seconds)/3600;
				  minutes = (seconds- (hours * 3600))/60;
				  seconds = (seconds - (hours * 3600) - (minutes * 60));
				  System.out.println("Input: " + secondsInput + " seconds");
				  System.out.println(hours + " hour(s), " + minutes + " minute(s), " + seconds + " second(s)."); 
				} else {
					System.out.println("Your input does not require any converting.");
				}
				
		} else if (questionnumber == 6) {
			System.out.println("The error in the first file is that the println requires quotation marks, x needs to be declared and java.util.scanner requires importing");
			System.out.println("The error in the second file is that the System.in should not have quotation marks");
		} else {
			System.out.println("Question number is not found, enter question number 1 to 6!");
			System.exit(0);
		}
	}
}
