/*
  file name:Gambler.java
  Created by:Dhiresh Bhoir
  Create Date:-05-10-2016
  Purpose:To show how many time Gambler wins or loses
*/
package com;
import java.util.Scanner;

class Gambler
{
	public static void main(String args[])
	{ 
		int stakes;
		int goal;
		int number;
		Utility utility=new Utility();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the stakes");
		stakes=sc.nextInt();
		   
		System.out.println("Enter the goal");
		goal=sc.nextInt();
	  
		System.out.println("Enter the Number of times");
		number=sc.nextInt();
		//Shows the Gambler position wheather he wins or loss
		utility.gamblegame(stakes,goal,number);
	}
}
