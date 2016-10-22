/*
  file name:Regexpression.java
  Created by:Dhiresh Bhoir
  Create Date:-14-10-2016
  Purpose:Replacing String in file using regex
*/
package com;
import java.util.Date;
import java.util.Scanner;
public class Regexpression 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Userinfo user = new Userinfo();
		Utility utility=new Utility();
		//Users first name
		System.out.println("Enter first name");
		String firstname = scanner.next();
		user.setFirstName(firstname);
		//Users last name
		System.out.println("Enter last name");
		String lastname = scanner.next();
		user.setLastName(lastname);
		//Users first mobile number
		System.out.println("Enter 10 digit mobile no.");
		String mobileno = scanner.next();
		boolean flag = false;
		while (!flag) 
		{
			if (utility.isTenDigit(mobileno)) 
			{
				user.setMobileNumber(mobileno);
				flag = true;
			} else
				mobileno = scanner.next();
		}
		user.setDate(Utility.getFormattedDate(new Date()));
		System.out.println(utility.RegexReplace(user,utility.readFileText("/home/bridgeit/Documents/Dhiresh/programs/userfile.txt")));
	}
}
