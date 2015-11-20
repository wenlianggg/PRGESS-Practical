package pract10;
/* Program Name: HighPSI
 * Description: Enter an input into the array
 * Author: Wen Liang
 * PEM Group: SF1503
 * Admin Number: 154473G
 * Date Created: 2 July 2015
 */
public class HighPSI {
	public static void main(String[] args) {
		int[] highPSIArr = {100,200,250,130,120,100,200,270,90,105};
		int lowest = 1000;
		int lindex = 0;
		for(int i = 0; i < highPSIArr.length; i++) {
			if (lowest > highPSIArr[i]) {
				lowest = highPSIArr[i];
				lindex = i;
			}
			System.out.println("The current lowest average reading in the array is " + lowest + " at index " + lindex);
			highPSIArr[lindex] = 95;
		}
	}
}
