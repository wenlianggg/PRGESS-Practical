package pract06;
/* Program Name: MarkCheckerQ1.java
 * Description: To determine if the user has passed.
 * Author: Wen Liang
 * PEM Group: SF1503
 * Admin Number: 154473G
 * Date Created: 27 May 2015
 */

import java.util.*;


public class MarkCheckerQ1 {
	private static Scanner sc;
	public static void main(String[] args) {
		int mark = 0;
		sc = new Scanner(System.in);
		System.out.println("Please input the marks obtained out of 100");
		mark = sc.nextInt();
		if (mark >= 50) {
			System.out.println("You have passed!");
			System.exit(0);
		} else {
			System.exit(0);
		}
	}
}
