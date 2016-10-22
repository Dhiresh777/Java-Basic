/*
  file name:SortString.java
  Created by:Dhiresh Bhoir
  Create Date:-08-10-2016
  Purpose:Reads in strings from file and prints them in sorted order using insertion sort.
*/
package com;
import java.util.Scanner;
import java.util.*;
import java.io.*;
public class SortString 
{
	public static void main(String[] args)throws IOException
	{
		Utility utility=new Utility();
		Scanner s = new Scanner(System.in);
		//reading file line by line and storing in Arraylist
		Iterator itr=utility.getFileText("/home/bridgeit/Documents/Dhiresh/programs/myfile.txt").iterator();  
  		//traversing elements of ArrayList object  
  		while(itr.hasNext())
		{   
		    String str=(String)itr.next();
		    System.out.print(str+"\t");
		    System.out.println(utility.insertionSortChar(str)); 
		}  
	}
	
}
