/*
  file name:CouponNumbers.java
  Created by:Dhiresh Bhoir
  Create Date:-05-10-2016
  Purpose:To print distinct coupons
*/
package com;
import java.util.*;
class CouponNumbers
{
	public static void main(String args[])
	{
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of coupon to generate :");
		number=sc.nextInt();
		CouponNumbers c=new CouponNumbers();
		c.printDistinctElements(number);	//call printDistinctElements to print distinct coupons	
	}
	//To generate distinct values
	public void printDistinctElements(int number)
	{
		//Use random class to Generate Random Numbers
        	Random ranObj=new Random();
		int random=ranObj.nextInt(10000);;
		int i=0; 
		int arr[]=new int[number];
		arr[0]=random;       
		for(i=1;i<number;i++)
		{	
			random=ranObj.nextInt(10000);
           		boolean isDistinct = false;
            		for(int j=0;j<i;j++)
			{		
				if(random == arr[j])
				{
        		            isDistinct = true;
        		        }
       			     	if(!isDistinct)
				{
					arr[i]=random;
				}
				else
				i--;
			}
		}
		System.out.println("Distinct coupon numbers :");
		for(i=0;i<number;i++)
		{                
			System.out.print("\t"+arr[i]);
        }
		System.out.println();
    }
}
     
