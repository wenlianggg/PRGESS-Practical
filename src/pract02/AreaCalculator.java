package pract02;
/* Program Name: AreaCalculator.java
 * Description: To calculate the area of a triangle
 * Author: Goh Wen Liang
 * PEM Group: SF1503
 * Admin Number: 154473G
 * Date Created: 30 April 2015
 */

import java.util.Scanner;

public class AreaCalculator {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		double base = 0;
		System.out.print("Enter the base here: ");
		base = sc.nextDouble();
		double height = 0;
		System.out.print("Enter the height here: ");
		height = sc.nextDouble();
		double areaTriangle = 0.5 * base * height;
		double areaRectangle = base * height;
		System.out.println("The area of your triangle is " + areaTriangle);
		System.out.println("The area of your rectangle is " + areaRectangle);
	}
}