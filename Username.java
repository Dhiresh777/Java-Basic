/*
  file name:Username.java
  Created by:Dhiresh Bhoir
  Create Date:-03-10-2016
  Purpose:To take user input and replace user name
*/
package com;
import java.util.Scanner;
public class Username
	{
		public static void main(String args[])
			{
				String string="",username;
				Scanner sc=new Scanner(System.in);
  
				Utility u=new Utility();

				System.out.println("Enter the UserName More than 3 Character:");
				string=sc.next();
				//Checks the length of the String
				if(u.checklength(string))
					{
					//if check length returns true than Call replaceusername
					username=u.replaceusername(string); 
					System.out.println(username);   
					}
				else
					{
						System.out.println("Enter the username more than 3 characters");
					}
			}
}
