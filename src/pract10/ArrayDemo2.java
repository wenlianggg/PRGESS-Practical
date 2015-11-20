package pract10;
/* Program Name: ArrayDemo2
 * Description: Find the highest input to the array
 * Author: Wen Liang
 * PEM Group: SF1503
 * Admin Number: 154473G
 * Date Created: 24 June 2015
 */


public class ArrayDemo2 {
	public static void main(String[] args) {
		int [] input = new int[100];
		int i = 1;
		// STORE MARK
		do {
			i++;
			input[i] = UserInput.readMark();
		} while (input[i] != 0);
		// FIND MAX MARK
		int maxval = 0;
		for (int j = 1; j < input.length; j++) {
			if (input[j] >= maxval) {
				maxval = input[j];
			}
		}
	}
}
