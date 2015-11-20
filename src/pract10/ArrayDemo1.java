package pract10;
import java.util.stream.IntStream;

/* Program Name: ArrayDemo1
 * Description: Find the average value of the array
 * Author: Wen Liang
 * PEM Group: SF1503
 * Admin Number: 154473G
 * Date Created: 24 June 2015
 */

public class ArrayDemo1 {
	public static void main(String[] args) {
		int total = 0;
		int average;
		int [] numbers = {60, 55, 91, 80, 75, 64};
		total = IntStream.of(numbers).sum();
		average = total / numbers.length;
		System.out.println("The average of all the numbers in the array is: " + average);
	}
}
