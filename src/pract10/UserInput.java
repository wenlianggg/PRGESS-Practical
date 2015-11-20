package pract10;
/* Program Name: UserInput
 * Description: Get a positive odd number input from the user.
 * Author: Wen Liang
 * PEM Group: SF1503
 * Admin Number: 154473G
 * Date Created: 21 June 2015
 */

import java.util.Scanner;
public class UserInput {
private static Scanner sc;
	
	public static int readOddNumber() {
		int num;
		sc = new Scanner(System.in);
		do {
			System.out.print("Please enter an odd number : ");
			num = sc.nextInt();
			if (num < 0 || num % 2 == 0)
				System.out.println("Wrong input!\n");
		} while (num < 0 || num % 2 == 0);
		return num;
	}
	
	public static int readMark() {
		int input = 0;
		sc = new Scanner(System.in);
		do {
		System.out.print("Enter a mark input from 0 to 100: ");
		input = sc.nextInt();
		if (input >= 100 && input <= 0)
			System.out.println("Invalid input! Try again...");
		} while (input >= 100 && input <= 0);
		return input;
	}
	
	public static int getInput() {
		sc = new Scanner(System.in);
		int input = 0;
		System.out.print("Enter an integer from 0 to 19: ");
		do {
			input = sc.nextInt();
			if (input <= -1 && input >= 0)
				System.out.println("Input is invalid");
		} while (input <= -1 && input >= 19);
		return input;
	}
}
