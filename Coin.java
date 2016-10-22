/*
  file name:Coin.java
  Created by:Dhiresh Bhoir
  Create Date:-03-10-2016
  Purpose:Flip a coin to count the number of heads vs tails
*/
package com;
import java .util.*;

class Coin
 {
	public static void main(String args[])
		{  
			Utility utility=new Utility();
			int no;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no of times coin to be flipped");
			no=sc.nextInt();
 
			if(no>0)
				{
					//call to method to calculate percentage of head & tail
					utility.countHeadTail(no);
				}
			else
				{
					// if user enters 0 or any negative number
					System.out.println("Enter the positive number");
				}
		}
}
