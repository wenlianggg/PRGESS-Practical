package pract10;

/* Program Name: ExamResult
 * Description: Create 2D array and compute and print average marks of students
 * Author: Wen Liang
 * PEM Group: SF1503
 * Admin Number: 154473G
 * Date Created: 2 July 2015
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExamResult {
	private static Scanner sc;
	public static void main(String[] args) {
		float[][] result = {{75,80,85},
							{60,68,74},
							{81,63,77},
							{55,76,67},
							{62,45,68},
							{52,47,51}};
		DecimalFormat df = new DecimalFormat("00.#");
		String[] names = {"Jane", "John", "Jerome", "Jason", "Jessica", "Joanne"};
		String[] subjects = {"English", "Math", "Science"};
		for(int i = 0; i < names.length; i++) {
			System.out.println("Average marks for " + names[i] + " = " + df.format((result[i][0]+result[i][1]+result[i][2]) / 3));
		}
		System.out.println("-----------------");
		for(int i = 0; i < subjects.length; i++) {
			System.out.println("Average marks for " + subjects[i] + " = " + df.format((result[0][i]+result[1][i]+result[2][i]+result[3][i]+result[4][i]+result[5][i]) / 6));
		}
		System.out.println("-----------------");
		System.out.print("Enter student name: ");
		sc = new Scanner(System.in);
		String searchname = sc.nextLine();
		for(int i = 0; i < names.length; i++) {
			if(searchname.contains(names[i])) {
				System.out.println("Results of " + names[i]);
				System.out.println("================");
				System.out.println("Results of " + subjects[0] + " = " + result[i][0]);
				System.out.println("Results of " + subjects[1] + " = " + result[i][1]);
				System.out.println("Results of " + subjects[2] + " = " + result[i][2]);
				System.out.println(searchname + " found at index " + i);
				System.exit(0);
			}
		}
		System.out.println("Not found.");
	}
}
