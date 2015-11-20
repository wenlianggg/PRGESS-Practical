package pract07;
/* Program Name: ForLoopDemo.java
 * Description: Testing for loops.
 * Author: Wen Liang
 * PEM Group: SF1503
 * Admin Number: 154473G
 * Date Created: 28 May 2015
 */

import java.util.*;

public class ForLoopDemo {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int num, sum = 0;
		System.out.print("Enter number: ");
		num = sc.nextInt();
		for (int i = 2; i < num; i++)
			sum+=i;
		System.out.println("The sum of " + num + " between the range is " + sum);
		sc.close();
	}
	
}
