/*
  file name:Node1.java
  Created by:Dhiresh Bhoir
  Create Date:-12-10-2016
  Purpose:To create Node for ordered LinkList  
*/

package com;
public class Node1
{
	private String value;
	private Node1 next;
	//Function to set the value
	public void setValue(String value)
	{
		this.value=value;
	}
	//Function to get the value
	public String getValue()
	{
		return value;
	}
	//Function to set the Next of the value
	public void setNext(Node1 next)
	{
		this.next=next;
	}
	//Function to get the Next  value
	public Node1 getNext()
	{
		return next;
	}
}
