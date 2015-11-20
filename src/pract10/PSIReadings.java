package pract10;
/* Program Name: PSIReadings
 * Description: Find the average PSI input
 * Author: Wen Liang
 * PEM Group: SF1503
 * Admin Number: 154473G
 * Date Created: 2 July 2015
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class PSIReadings {
	private static Scanner sc;
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("00");
		sc = new Scanner(System.in);
		int[] psi = new int[24];
		System.out.println("An array of size 24 has been created.");
		for(int i = 0; i < psi.length; i++) {
			do {
			System.out.print("Enter PSI for " + df.format(i) + "00 hour -> ");
				psi[i] = sc.nextInt();
			} while(psi[i] < 0 || psi[i] > 1000);
		}
		float average = findAverage(psi);
		System.out.print("The average PSI for the hour is " + average);
	}
	
	public static float findAverage(int[] psi) {
		float total = 0;
		for(int i = 0;i < psi.length; i++) {
			total += (float)psi[i];
		}
		float average = total / psi.length;
		return average;	
	}
	
}
