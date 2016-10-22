/*
  file name:Palindrome.java
  Created by:Dhiresh Bhoir
  Create Date:-12-10-2016
  Purpose:Create deque to check if string is palindrome or not
*/
package com;
import java.util.Scanner;
public class Palindrome11
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//creates a object of Queue class	
		DeQueue q=new DeQueue(20);
		//Enter string to check 
		System.out.println("Enter word to check palindrome");		
		String str=sc.next();
		String revstr="";		
		int i;
		for(i=0;i<str.length();i++)
		{	
			//inserting into deque
			q.addFront(str.charAt(i));
		}
		for(i=str.length()-1;i>=0;--i)
		{	//removing from deque
			revstr +=q.removeRear();
		}
		if(str.equals(revstr))
		{	
			System.out.println("Word is palindrome");
		}
		else
			System.out.println("Word is not palindrome");	
	}	
}
