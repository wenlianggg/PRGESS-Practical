package pract06;
/* Program Name: GradeConverter.java
 * Description: Converts grade to GPA value
 * Author: Wen Liang
 * PEM Group: SF1503
 * Admin Number: 154473G
 * Date Created: 27 May 2015
 */

import java.util.*;

public class GradeConverter {
	private static Scanner sc;
	public static void main(String[] args) {
	sc = new Scanner(System.in);
	double gpa = 0;
	char grade;
	System.out.print("Please enter your grade: ");
	grade = Character.toUpperCase(sc.next().charAt(0));
	switch(grade) {
		case 'A': gpa = 4.0; break;
		case 'B': gpa = 3.0; break;
		case 'C': gpa = 2.0; break;
		case 'D': gpa = 1.0; break;
		default:
			System.out.println("An error has occured, value input out of range!");
			System.exit(0);
	}
	System.out.println("Your GPA obtained is: " + gpa);
	}
}
