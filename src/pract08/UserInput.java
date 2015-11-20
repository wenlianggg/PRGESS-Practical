package pract08;
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

	public static void main(String[] args) {
		int number = readOddNumber();
		System.out.println("The odd integer is " + number);
	}
	
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
		System.out.print("Enter your mark from 0 to 100 : ");
		input = sc.nextInt();
		} while (input >= 100 && input <= 0);
		return input;
	}
}
