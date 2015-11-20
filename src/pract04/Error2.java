package pract04;
// 	This program no syntax error.
//	It has 1 runtime error and 1 logic error
//	Find and resolve the errors.

import java.util.Scanner;

public class Error2 {

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		double average=0;
		
		System.out.print("Enter 1st number: ");
		x = sc.nextInt();
		
		System.out.print("Enter 2nd number: ");
		y = sc.nextInt();

		average = (double) (x + y) / 2;
		System.out.println("The average is " + average);
		
		sc.close();
	}

}
