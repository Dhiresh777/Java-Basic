/*
  file name:TwoDarray.java
  Created by:Dhiresh Bhoir
  Create Date:-05-10-2016
  Purpose:To Dispaly the integers in 2d Array
*/
package com;
import java.util.Scanner;
class TwoDarray
{
	public static void main (String args[])
	{
		Utility utility=new Utility();
		int rows,cols,i,j;
		Scanner sc=new Scanner(System.in);      
		System.out.println("Enter the Number of rows:");
		rows=sc.nextInt(); 
		System.out.println("Enter the Number of Columns");
		cols=sc.nextInt();
		//Declare Two Dimensional Array
		int arr[][]=new int[rows][cols];
		//call to put2Ddata to insert data in array
		arr=utility.put2Ddata(rows,cols);
		System.out.println("elements to be displayed");   
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
			{
	           System.out.print(arr[i][j]); 
			   System.out.print("\t");
	        }
       		System.out.println();
		}
	}
}
