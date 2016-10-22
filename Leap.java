/*
  file name:Leap.java
  Created by:Dhiresh Bhoir
  Create Date:-03-10-2016
  Purpose:To check year is a Leap Year or not.
*/
package com;
import java.util.Scanner;
class Leap
{
	public static void main(String args[])
	{
		int year;
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the year in Digits");
		year=sc.nextInt();
		// cast integer to String to count length
		int length=Integer.toString(year).length();
		System.out.println("Year length:"+length);
		//year length Should be equal to 4
		if(length==4)
		{
            //if year is divisible by 4, it is a leap year
              if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                      System.out.println("Year " + year + " is a leap year");
              else
                      System.out.println("Year " + year + " is not a leap year");
		}
		else
		{
			System.out.println("enter the year in 4 Digits only");
		}
	}
}
