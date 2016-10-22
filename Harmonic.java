/*
  file name:Harmonic.java
  Created by:Dhiresh Bhoir
  Create Date:-04-10-2016
  Purpose:Calculate the harmonic value of entered Number
*/
package com;
import java.util.Scanner;
class Harmonic
{
	public static void main(String args[])
	{
		Utility utility=new Utility();
		int number;
		float harmonic;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to calculate harmonic value");
		number=sc.nextInt();
		//check if number is greater than 0 to calculate harmonic Value
		if(number>0)
		{
			//call calharm method to return return harmonic value 
			System.out.println("Harmonic value");			
			harmonic=utility.calHarmonic(number);
			System.out.println("="+harmonic);
		} 
		//if the entered no is 0
			else
		{
			System.out.println("Enter number Greater than 0");
		}
	}
}
