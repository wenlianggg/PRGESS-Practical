package pract10;
/* Program Name: NumCount
 * Description: Count how many times a number has been input
 * Author: Wen Liang
 * PEM Group: SF1503
 * Admin Number: 154473G
 * Date Created: 1 July 2015
 */


public class NumCount {
	public static void main(String[] args) {
		// DECLARE
		int [] numbers = new int [20];
		int input;
		// GET INPUT(S)
		for (int i = 0; i < numbers.length; i++) {
			input = UserInput.getInput();
			if (input == -1) break;
			else if (input < 0 || input > 19) ;
			else numbers[input]++;
		}
		// PRINT OUTPUT
		for(int i = 0; i <= numbers.length - 1; i++)
		System.out.println(i + " appears " + numbers[i] + " times.");
	}
}