/*
  file name:MyQueue.java
  Created by:Dhiresh Bhoir
  Create Date:-12-10-2016
  Purpose:Create queue for cash counter
*/

package com;
import java.util.Scanner;
import java.util.*;

class MyQueue
{
    protected int Queue[] ;
    protected int front, rear, size, len;
 
    //Constructor
    public MyQueue(int n) 
    {
        size = n;
        len = 0;
        Queue = new int[size];
        front = -1;
        rear = -1;
    }    
    //Function to check if queue is empty 
    public boolean isEmpty() 
    {
        return front == -1;
    }    
    //Function to check if queue is full 
    public boolean isFull() 
    {
        return front==0 && rear == size -1 ;
    }    
    //Function to get the size of the queue
    public int getSize()
    {
        return len ;
    }    
    //Function to check the front element of the queue 
    public int peek() 
    {
        if (isEmpty())
           throw new NoSuchElementException("Queue is empty");
        return Queue[front];
    }    
    //Function to insert an element to the queue 
    public void enQueue(int i) 
    {
        if (rear == -1) 
        {
            front = 0;
            rear = 0;
            Queue[rear] = i;
        }
        else if (rear + 1 >= size)
            throw new IndexOutOfBoundsException("Queue is full");
        else if ( rear + 1 < size)
            Queue[++rear] = i;    
        len++ ;    
    }    
    //Function to remove front element from the queue 
    public int deQueue() 
    {
        if (isEmpty())
           throw new NoSuchElementException("Queue is empty");
        else 
        {
            len-- ;
            int ele = Queue[front];
            if ( front == rear) 
            {
                front = -1;
                rear = -1;
            }
            else
                front++;                
            return ele;
        }        
    }
    //Function to display the status of the queue
    public void display()
    {
        System.out.print("\nQueue = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = front; i <= rear; i++)
            System.out.print(Queue[i]+" ");
        System.out.println();        
    }
}
 
