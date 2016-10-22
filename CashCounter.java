/*
  file name:CashCounter.java
  Created by:Dhiresh Bhoir
  Create Date:-12-10-2016
  Purpose:Create queue for cash counter
*/
package com;
import java.util.Scanner;

class CashCounter
{
	//declare the cash balance 
	private long cashBalance=500000;
	//Calculate the cashBalance after cash deposit in the bank
	public void cashDeposit(long amount)
	{
		cashBalance=cashBalance+amount;
	}
	//Calculate the cashBalance after Cash withdrawal from the bank
	public void cashWithdraw(long amount)
	{
		cashBalance=cashBalance-amount;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//creates a object of Queue class	
		MyQueue q=new MyQueue(20);
		//creates the object of CashCounter	
		CashCounter c=new CashCounter();
		long amt;
		char ch;
		do
		{
			//Number of People in ths queue
			System.out.println("The number of people who are interested to stay in queue :-");
			int count=sc.nextInt();
			for(int i=0;i<count;i++)
			{
				q.enQueue(i);
			}
			while(!q.isEmpty())
			{
				//Enter choice for the operation to be performed	
				System.out.println("Select the list of operations to be performed of Cash Counter");
				System.out.println("Press 1. For Cash Deposit ");
				System.out.println("Press 2. For Cash Withdrawl");
				System.out.println("Enter your option here");
				int op=sc.nextInt();
				switch(op)
				{
					//If the individual want to deposit a cash
					case 1:
							System.out.println("Enter the amount to be Deposited");
							amt=sc.nextInt();
							c.cashDeposit(amt);
							q.deQueue();
							break;
					//If the individual want to withdraw a cash
					case 2:
							System.out.println("Enter the amount to be WithDrawn");
							amt=sc.nextInt();
							c.cashWithdraw(amt);
							q.deQueue();
							break;
					//if individual wants none of the operations
					default:
							System.out.println("Invalid Choice");
							q.deQueue();
							break;
				}
			}
			System.out.println("Is any one else is the in queue");
			ch=sc.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		System.out.println("Cash balance at End Of The Day is :-"+c.cashBalance);
	}
}
