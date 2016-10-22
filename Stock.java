/*
  file name:Stock.java
  Created by:Dhiresh Bhoir
  Create Date:-07-10-2016
  Purpose:Print the Stock Report
*/
package com;
import java.util.Scanner;
public class Stock
{
    public static void main(String args[])
    {
       int number,i;
       Scanner sc=new Scanner(System.in);
       //Getting no of stocks
       System.out.println("Enter the number of stocks");
       number=sc.nextInt();
       //create an array of Stockfolio class
       Stockfolio sf[]=new Stockfolio[number];
       //getting the Stock details
         for(i=0;i<number;i++)
          {
            System.out.println("enter the "+(i+1)+" Stock Details ");
          	//creating objects for each stock
	  		 sf[i]=new Stockfolio();
	  	  } 
	   //displaying report for all stock
	    System.out.println("Stock Report:");
	    System.out.println("Stockname\tshare\tprice\ttotalValue");
		System.out.println("--------------------------------------");
		for(i=0;i<number;i++)
		{
				sf[i].stockReport();
		}
	}
}
