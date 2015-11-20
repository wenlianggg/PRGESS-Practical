package pract08;
/* Program Name: GradeComputation
 * Description: To compute the grade based on the marks
 * Author: Wen Liang
 * PEM Group: SF1503
 * Admin Number: 154473G
 * Date Created: 21 June 2015
 */

import java.util.Scanner;
public class GradeComputation {
private static Scanner sc;

	public static void main (String[] args) {
		double mark;
		char grade;
		mark = readMark();
		grade = computeGrade(mark);
		System.out.println("Your mark is " + mark);
		System.out.println("Your grade is " + grade);
	}
	
	public static double readMark() {
		double mark;
		sc = new Scanner(System.in);
		System.out.print("Enter mark: ");
		mark = sc.nextDouble();
		return mark;
	}
	
	public static char computeGrade(double mark) {
		char grade;
		if (mark >= 80)
			grade = 'A';
		else if (mark >= 70)
			grade = 'B';
		else if (mark >= 60)
			grade = 'C';
		else if (mark >= 50)
			grade = 'D';
		else
			grade = 'F';
		return grade;
	}
}
