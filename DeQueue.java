/*
  file name:DeQueue.java
  Created by:Dhiresh Bhoir
  Create Date:-12-10-2016
  Purpose:Create deque to check string is palindrome or not
*/

package com;
import java.util.Scanner;
import java.util.*;
class DeQueue
{
	char dqueue[];
	int n;
	int front, rear,len,size;
	//constructor
	public DeQueue(int size) 
    {
        n=size;
        len = 0;
        dqueue = new char[n];
        front = -1;
        rear = -1;
    }    
	//Function to insert an element to rear of the queue
	public void addRear(char value)
	{
		if((rear+1)<n)
		{
			rear++;
			dqueue[rear] = value;
		}
		else
			System.out.println("Overflow from rear !");
	}
	//Function to insert an element to front of the queue
	public void addFront(char value)
	{

		if((front>0)
		{
			dqueue[front] = value;
			front--;
		}
		else
			System.out.println("Overflow from rear !");
			
		
		
			//System.out.println("Overflow from front !");
	}
	//Function to delete an element from front of the queue
	public char removeFront()
	{
		char value;
		if(front!=rear)
		{
			front++;
			value = dqueue[front];
			return value;
		}
		else
			return '9';
	}
	//Function to delete an element from rear of the queue
	public char removeRear()
	{
		char value;
		if(front!=rear)
		{
			value = dqueue[rear];
			rear--;
			return value;
		}
		else
		return '9';
	}
	public void display()
	{
		if(front!=rear)
		{
			for(int i=front+1;i<=rear;i++)
			System.out.print(dqueue[i]);
		}
		else
			System.out.println("No element in queue !");
	}
}
