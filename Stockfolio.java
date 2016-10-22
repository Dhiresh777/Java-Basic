package com;
import java.util.Scanner; 
public class Stockfolio
   {
       String stockname;
       int numofshares,shareprice,stocktotalvalue;   
       Stockfolio()
       {
       Scanner sc=new Scanner(System.in);
       //Enter the Name of the Stock
       System.out.print("Stock Name :");
       stockname=sc.next();
       //Enter the no of Shares
       System.out.print("No of Shares : ");
       numofshares=sc.nextInt();
       //Enter the Share value of Stock
       System.out.print("value of share :");
       shareprice=sc.nextInt();
       //total value to the stock
       stocktotalvalue=numofshares*shareprice;
	   }
    	//method to display the report of overall stock
    	public void stockReport()
      {
       System.out.println("   "+stockname+"\t\t"+numofshares+"\t"+shareprice+"\t"+stocktotalvalue);
      }

   }

    


