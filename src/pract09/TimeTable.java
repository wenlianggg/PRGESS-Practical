package pract09;
import java.util.Scanner;

public class TimeTable 
{
	public static void main(String[] args) 
	{
		/*
		 * There are a few errors in this program.
		 * The correct output is shown on Step 3 of your Lab sheet.
		 * You've previously learnt how to use the debugger is Practical 3.
		 * Try to use the debugger to find the bug inside this program and 
		 * fix it
		 */
		Scanner sc = new Scanner(System.in);
		int line;
		do
		{
			System.out.print("Enter a postive number less than 10: ");
			line = sc.nextInt();
			if (line < 1 || line > 10)
				System.out.println("Invalid Input!");
		} while (line < 1 || line > 10);
		
		System.out.println("The " + line + " x " +
					line + " multiplication table is:");
		
		for (int i = 1; i <= line; i++)
		{
			for (int j = 1; j <= line; j++)
				System.out.print(i * j + " ");
			System.out.println();
		}
		sc.close();
	}
}
