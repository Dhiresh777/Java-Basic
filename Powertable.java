/*
  file name:PowerTable.java
  Created by:Dhiresh bhoir
  Create Date:-04-10-2016
  Purpose:To show the Power Table of 2
*/
package com;
import java.util.Scanner;

 class Powertable
  {
   public static void main(String args[])
    {
     Utility utility=new Utility();
     Scanner sc=new Scanner(System.in);
     int number;
     System.out.println("Enter the no power of 2");
     number=sc.nextInt();
     
     if(utility.validateNO(number))
 
     //if validation return true
     {
      utility.powerTable(number);
     }
     else
      {
        System.out.println("power should be between 1-31");
      }
    }
}
