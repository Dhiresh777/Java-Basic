/*
  file name:BalancedParenthisisCheck.java
  Created by:Dhiresh Bhoir
  Create Date:-12-10-2016
  Purpose: To ensure parentheses must appear in a balanced fashion.
*/

package com;
import java.util.Scanner;
public class BalancedParenthisisCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Expression :- ");
		String str=sc.next();
		boolean flag=true;
		if (str.isEmpty()) 
		{
			System.out.println("Empty String");
		}
		else
		{
			MyStack stack = new MyStack(str.length());
			for (int i = 0; i < str.length(); i++) 
			{
				char ch = str.charAt(i);
				if (ch == '[' || ch == '(' || ch == '{') 
				{
					stack.push(ch);
				} 
				else if ((ch == ']' || ch == '}' || ch == ')')
					&& (!stack.isEmpty())) 
				{
					if (((char) stack.peek() == '(' && ch == ')')|| ((char) stack.peek() == '{' && ch == '}')|| ((char) stack.peek() == '[' && ch == ']')) 
					{
						stack.pop();	
					} 
				} 
				else 
				{
					if ((ch == ']' || ch == '}' || ch == ')')) {
					flag=false;
				}
			}
		}
		if (stack.isEmpty()&&flag==true)
		System.out.println("Balanced Parenthisis");
		else
		System.out.println("Not Balanced");
	}
}
	
}
