package pract08;
/* Program Name: PrimeNumber
 * Description: To compute and check if a number is prime.
 * Author: Wen Liang
 * PEM Group: SF1503
 * Admin Number: 154473G
 * Date Created: 21 June 2015
 */

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Prime numbers from 1 to 50 : ");
		int i = 0;
		while (i < 100) {
			primePrinter(i);
			i++;
		}
	}
	
	public static void primePrinter(int input) {
		boolean checkprime = checkPrime(input);
		if (checkprime == true)
			System.out.print(input + " ");
	}
	
	public static boolean checkPrime(int input) {
		  float divisor = 2;
		  boolean result = false;
		  	while (divisor <= input / 2) {
		      if (input % divisor == 0) {
		         result = false;
		         break;
		      } else {
		    	 result = true;
		    	 divisor++;
		      }
		 }
		  return result;
	}
}
