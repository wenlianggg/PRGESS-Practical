package pract08;
/* Program Name: Factorials
 * Description: Prints out the factorials from 1 to 20
 * Author: Wen Liang
 * PEM Group: SF1503
 * Admin Number: 154473G
 * Date Created: 2 July 2015
 */

public class Factorials {
	public static void main(String[] args){
		long maxval = 20;
		for (long i = 1; i <= maxval; i++) {
			System.out.println(i + "! = " + factorial(i));
		}
	}
	
	public static long factorial(long n) {
		long total = 1;
		for (long i = 1; i <= n; i++) {
			total = total * i;
		}
		return total;
	}
}