/*
  file name:Findnumber.java
  Created by:Dhiresh Bhoir
  Create Date:-07-10-2016
  Purpose:Find number in range
*/
package com;
import java.util.Scanner;

class Findnumber
{
	public static void main(String args[])
    { 
	    Utility utility=new Utility();
	    Scanner sc=new Scanner(System.in);
	    int number,search;
		System.out.println("Enter the maximum number of range: ");
		number=sc.nextInt();
		int arr[]=new int[number];		
		for(int i=0;i<number;i++)
		{
			arr[i]=i;
		}
		//Enter number to search in range of 0-number
		System.out.println("Enter the number to search :");
		search=sc.nextInt();	
		int first=0;	
		int last=number-1;
		int power=1;
		String ans;
		int searchvalue,count=0;
		int mid=(first+last)/2;
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.println("Mid is : "+arr[mid]);
			System.out.println("Is this your Number yes/low/high");
			ans=sc.next();
			if(ans.equals("yes"))
			{
				//if search value found at middle position
				System.out.println("Value found "); 
	     			break;
			}
				// search value less the mid of the entered numbers
				else if(ans.equals("low"))
			{
				last=mid-1;
				count++;
			}
			else if(ans.equals("high"))
			{
				//search value more the mid value of entered numbers
				first=mid+1; 
				count++;
			}
			else
			System.out.println("You have entered wrong input");
			mid=(first+last)/2;		
			System.out.println("Mid"+mid);
		}
		if(count>number)
		System.out.println("Match value not found");
		System.out.println("No of attempts "+(count+1));		
	}
}



