/*
  file name:Primefactor.java
  Created by:Dhiresh Bhoir
  Create Date:-04-10-2016
  Purpose:To find the prime factors of the number
*/
package com;
import java.util.Scanner;

class Primefactor
{
	public static void main(String args[])
    { 
	     Utility utility=new Utility();
	     Scanner sc=new Scanner(System.in);
	     int number;
		 System.out.println("Enter the number to find prime factor");
         number=sc.nextInt();
         if(number>0)
         //call calPrimefactor as number is greater than 0
         {
             utility.calPrimefactor(number);
         }
         //if number equals 0
         else if(number==0)
         {
             System.out.println("Enter number greater than 0 ");
         }
         //if the number is negative 
         else
         {
             System.out.println("Enter the Positive Number"); 
         }
     }
} 
