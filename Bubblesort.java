/*
  file name:Bubblesort.java
  Created by:Dhiresh Bhoir
  Create Date:-07-10-2016
  Purpose:Reads in integers prints them in sorted order using Bubble Sort
*/
package com;
import java.util.Scanner;
import java.util.Arrays;

public class Bubblesort 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements");
		for (int i=0;i<n;i++) 
		{
			arr[i] = s.nextInt();
		}
		System.out.println("Array before sorting : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Array after sorting :");
		System.out.println(Arrays.toString(utility.bubbleSort(arr)));
	}
}
