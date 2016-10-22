/*
  file name:ThreeSum.java
  Created by:Dhiresh Bhoir
  Create Date:-06-10-2016
  Purpose:Finding all unique triplets that sums to zero
*/
package com;
import java.util.Scanner;

public class ThreeSum 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter array elements");
		for (int i = 0; i < n; i++) 
		{
			a[i] = s.nextInt();
		}
		Utility.printAll(a);
	}
}
