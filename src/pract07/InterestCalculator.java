package pract07;
/* Program Name: InterestCalculator.java
 * Description: To calculate compound interest of a principal over a term.
 * Author: Wen Liang
 * PEM Group: SF1503
 * Admin Number: 154473G
 * Date Created: 28 May 2015
 */

import java.text.*;
import java.util.*;


public class InterestCalculator {
	public static final double RATE = 0.02;
	private static Scanner sc;
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		sc = new Scanner(System.in);
		double pamt, totalamt, yearitr, totalitr = 0;
		int term = 1;
		System.out.print("Enter your principal amount: $");
		pamt = sc.nextDouble();
		System.out.print("Enter the number of years: ");
		term = sc.nextInt();
		totalamt = pamt;
		for (int y = 1; y <= term; y++) {
			yearitr = totalamt * RATE;
			totalitr = yearitr + totalitr;
			totalamt = totalamt + yearitr;
		}
		System.out.println("The interest compounded over 5 years = $" + df.format(totalitr));
		System.out.println("The total amount accumulated = $" + df.format(totalamt));
	}
}