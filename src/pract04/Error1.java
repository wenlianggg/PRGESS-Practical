package pract04;
import java.util.Scanner;

//	Mouse over to read the error messages.
//	Resolve all the syntax errors.

public class Error1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x;
		System.out.println((1/2 + 2.5) * 3.0);
		System.out.print("Enter an integer:");
		x = in.nextInt();
		System.out.println("You have entered " + x);
		in.close();
	}
}