/*
  file name:Searchword.java
  Created by:Dhiresh Bhoir
  Create Date:-08-10-2016
  Purpose:To search word in list using binary search
*/
package com;
import java.util.Scanner;
import java.util.*;
class Searchword
{
    public static void main(String[] args) 
    {
	Utility utility=new Utility();            
	int number;
        Scanner s = new Scanner(System.in);        
	System.out.print("Enter number of words you want to enter:");
        number = s.nextInt();
        String names[] = new String[number];
        Scanner s1 = new Scanner(System.in);
	//Enter 
        System.out.println("Enter all the words:");
        for(int i = 0; i < number; i++)
        {
            names[i] = s1.nextLine();
        }
		//To sort words call sortword method
		String sortedList[]=utility.sortword(names,number);
		System.out.println("Sorted list :"); //sorted words		
		for(int i = 0; i < number; i++)
        {
            System.out.print(sortedList[i]+"\t"); //sorted words
		}
        System.out.println();
		System.out.println("Enter the word to search:");
		String key=s.next();
		utility.wordBinarySearch(sortedList,key);  
    }
}
