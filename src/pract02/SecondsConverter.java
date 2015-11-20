package pract02;

/* Program Name: SecondsConverter.java
 * Description: To convert seconds to weeks, days, hours, minutes and seconds.
 * Author: Wen Liang
 * PEM Group: SF1503
 * Admin Number: 154473G
 * Date Created: 30 April 2015
 */


import java.util.*;


public class SecondsConverter {
private static Scanner sc;

public static void main(String args[]) {
  long seconds = 0;
  long secondsInput = 0;
  long minutes;
  long hours;
  long days;
  long weeks;
  sc = new Scanner(System.in);
  try {
  System.out.print("Enter the number of seconds: ");
  seconds = sc.nextLong();
  secondsInput = seconds; 
  } catch (InputMismatchException e) {
	  System.out.println("PROGRAM EXITTED WITH ERROR (2 - Non-Integer Input Detected!)");
  }
  if (seconds >= 60) {
	  weeks = seconds / 604800;
	  days = (seconds - (weeks * 604800))/86400;
	  hours = (seconds - (weeks * 604800) - (days * 86400))/3600;
	  minutes = (seconds - (weeks * 604800) - (days * 86400) - (hours * 3600))/60;
	  seconds = (seconds - (weeks * 604800) - (days * 86400) - (hours * 3600) - (minutes * 60));
	  System.out.println("Input: " + secondsInput + " seconds");
	  System.out.println(weeks + " week(s), " + days + " day(s), " + hours + " hour(s), " + minutes + " minute(s), " + seconds + " second(s)."); 
	  System.out.println("PROGRAM FINISHED AND EXITTED (0)");
  } else {
	  System.out.println("Input: " + secondsInput + " seconds");
	  System.out.println("Your input does not require any conversion!");
	  System.out.println("PROGRAM EXITTED WITH ERROR (1 - Conversion Not Required!)");
  }
}
}