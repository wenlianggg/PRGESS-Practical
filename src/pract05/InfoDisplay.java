package pract05;

/* Program Name: InfoDisplay.java
 * Description: To collect information from the user and then display it.
 * Author: Wen Liang
 * PEM Group: SF1503
 * Admin Number: 154473G
 * Date Created: 21 May 2015
 */

import java.io.*;
import java.text.*;
import java.util.*;


public class InfoDisplay {
	private static DecimalFormat df = new DecimalFormat("00.##");
	private static Scanner scs;
	public static void main (String[] args) {
		scs = new Scanner(System.in);
		scs.useDelimiter("\\n");
		String name, nric, genderlong, gender, weights, heights, ages;
		int age = 0;
		double weight, height, bmi;
		System.out.print("Enter name: ");
		name = scs.next();
		name = name.trim();
		System.out.print("Enter NRIC: ");
		nric = scs.next();
		nric = nric.trim();
		System.out.print("Enter age in years: ");
		ages = scs.next();
		ages = ages.trim();
		age = Integer.parseInt(ages);
		System.out.print("Enter gender (Male or Female): ");
		genderlong = scs.next();
		gender = genderlong.substring(0, 1);
		System.out.print("Enter weight in kg: ");
		weights = scs.next();
		weights = weights.trim();
		weight = Double.parseDouble(weights);
		System.out.print("Enter height in metres: ");
		heights = scs.next();
		heights = heights.trim();
		height = Double.parseDouble(heights);
		bmi = weight / (height * height);
		try {
		PrintWriter output = new PrintWriter("output.txt");
		System.out.println("Hello, " + name + "!");
		output.println("Hello, " + name + "!");
		System.out.println("Your NRIC is " + nric + " and you are " + age + " years old.");
		output.println("Your NRIC is " + nric + " and you are " + age + " years old.");
		System.out.println("Your gender is " + gender.toUpperCase() + " and your BMI is " + df.format(bmi));
		output.println("Your gender is " + gender.toUpperCase() + " and your BMI is " + df.format(bmi));
		output.close();
		} catch (IOException e) {
			System.out.println("FILE I/O ERROR!");
		}
	}
}
