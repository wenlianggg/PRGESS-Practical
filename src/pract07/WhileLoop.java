package pract07;
/* Program Name: WhileLoop.java
 * Description: Testing while loops.
 * Author: Wen Liang
 * PEM Group: SF1503
 * Admin Number: 154473G
 * Date Created: 28 May 2015
 */

import java.util.Scanner;

public class WhileLoop {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int num, sum = 0;
		int i = 1;
		double average;
		System.out.print("Enter number: ");
		num = sc.nextInt();
		while (num != 0) {
			sum += num;
			i++;
			System.out.println("The current sum is = " + sum);
			System.out.print("Enter number again: ");
			num = sc.nextInt();
		}
		System.out.println("The final sum is = " + sum);
		average = (double)(sum) / i;
		System.out.println("The average sum across " + i + " inputs = " + average );
		sc.close();
	}
	
}
