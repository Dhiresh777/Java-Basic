/*
  file name:MyStack.java
  Created by:Dhiresh Bhoir
  Create Date:-12-10-2016
  Purpose: create stack to check Parentheses  
*/
package com;
import java .util.*;
public class MyStack 
	{
	private char[] data;
	private int index = 0;
	private int size = 0;
	public MyStack(int s) 
	{
		this.size = s; /* default stack size of 20 */
		data = new char[this.size];
	}
	public void push(char a) {
	this.data[index] = a;
	index++;
	}

	public char pop() {
		if (index != 0) {
			char c = data[index - 1];
			//this.data[index - 1] = null; // Deleted
			index--;
			return c;
		} 
		return 0;
	}

	public char peek() throws RuntimeException {
		if (index != 0)
			return data[index - 1];
			return 0;
		}

	public boolean isEmpty() {
		return index == 0 ? true : false;
	}

	public int size() {
		return index;
	}
}
