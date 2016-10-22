/*
  file name:Binarysearch.java
  Created by:Dhiresh Bhoir
  Create Date:-10-10-2016
  Purpose:Sort the Integers and Strings in Ascending Order 
*/
package com;
import java.util.Scanner;
import java.util.Arrays;

class BinarySearch
{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			Utility utility=new Utility();
			System.out.println("Enter the Choice of your ");
			System.out.println("1.BinarySearch method for integer");
			System.out.println("2.BinarySearch method for String");
			System.out.println("3.InsertionSort method for integer");
			System.out.println("4.InsertionSort method for String");
			System.out.println("5.BubbleSort method for integer");
			System.out.println("6.BubbleSort method for String");
			System.out.print("The choice is :- ");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				{
						//Stop Watch Starts here 
						long starttime=System.currentTimeMillis();
						int number;
						//Enter the count of integers 
						System.out.println("Enter the Number of integers to be search");
						number=sc.nextInt();
						//Declare and initialize the array of numbers to search
						int list[]=new int[number];
						System.out.println("Enter the list of numbers :");
						for(int i=0;i<number;i++)
						{
							list[i]=sc.nextInt();
						}
						int sortedlist[]=utility.bubbleSort(list);//To sort array of number
						System.out.println("Sorted list :");			
						for(int s:sortedlist)
						{
							System.out.println(s);
						}
						//call binary search function from Utility class 	
						utility.binarySearch(sortedlist,number);
						//Stop watch ends here
						long endtime=System.currentTimeMillis();
						//Ellapsed time is calculated here
						long timeEllapsed=endtime-starttime;
						//Displays the ellapsed time
						System.out.println("Time ellapsed for binary search :- "+timeEllapsed);
						break;
				}
				case 2:
				{			
						//Stop Watch Starts here 
						long starttime=System.currentTimeMillis();
						int number;
						System.out.println("Enter the Number of words to be search");
						number=sc.nextInt();	
						System.out.println("Enter the list of words :");			
						String list[]=new String[number];
						for(int i=0;i<number;i++)
						{
							list[i]=sc.next();
						}
						//Sort array of the String
						Arrays.sort(list);
						System.out.println("Sorted list of words:");
						//display list of strings or words
						for(String s:list)
						{
							System.out.println(s);
						}
						//enter word which is to be searched in list
						System.out.println("Enter word to search:");
						String word=sc.next();					
						//passing to binary search to find a word
						utility.wordBinarySearch(list,word);
						long endtime=System.currentTimeMillis();
						long timeEllapsed=endtime-starttime;
						System.out.println("Time ellapsed for binary search :- "+timeEllapsed);	
						break;
    			}   
	
				case 3:
				{		
						//Stop Watch Starts here 
						long starttime=System.currentTimeMillis();			
						//Enter the total number of String to be Entered
						System.out.println("Enter the no of Integers in a Array");
						int	number=sc.nextInt();
						//declaration and initialisation of the string
						int list[]=new int[number];
						System.out.println("Enter the list of numbers :");
						for(int i=0;i<number;i++)
						{
							list[i]=sc.nextInt();
						}
						//call insert Sort to show the sorted elements
						System.out.println("The Sorted Elements Are");
						utility.insertionSort(list,number);
						//display the sorted elements
						for(int i=0;i<number;i++)
						{
							System.out.println(list[i]);	
						}							
						long endtime=System.currentTimeMillis();
						long timeEllapsed=endtime-starttime;
						System.out.println("Time ellapsed for binary search :- "+timeEllapsed);
						break;
				}
				case 4:
				{			
						//Stop Watch Starts here 
						long starttime=System.currentTimeMillis();
						//Enter the total number of String to be Entered
						System.out.println("Enter the no of words in a String");
						int	number=sc.nextInt();
						//declaration and initialisation of the string
						String list[]=new String[number];
						System.out.println("Enter the list of words");
						for(int i=0;i<number;i++)
						{
							list[i]=sc.next();
						}
						System.out.println("The Sorted Elements Are");
						String sortedlist[]=utility.insertSortwords(list,number);//call insertSortString to show the sorted elements
						//display the sorted elements
						for(int i=0;i<number;i++)
						{
							System.out.println(sortedlist[i]);	
						}
						long endtime=System.currentTimeMillis();
						long timeEllapsed=endtime-starttime;
						System.out.println("Time ellapsed for binary search :- "+timeEllapsed);
						break;
				}
		
				case 5:
				{
						//Stop Watch Starts here 
						long starttime=System.currentTimeMillis();						
						//Total number of numbers to be entered
						System.out.println("Enter the number of elements to be entered :-");
						int number=sc.nextInt();
	
						//Declaration and initialization of Array of integers
						int list[]=new int[number];
						System.out.println("Enter the list of numbers :");
						for(int i=0;i<number;i++)
						{
							list[i]=sc.nextInt();
						}
						int sortedlist[]=utility.bubbleSort(list);
						System.out.println("The Sorted Elements Are");
						//Display the list of sorted elements
						for(int i=0;i<number;i++)
						{
							System.out.println(sortedlist[i]);	
						}	
						long endtime=System.currentTimeMillis();
						long timeEllapsed=endtime-starttime;
						System.out.println("Time ellapsed for binary search :- "+timeEllapsed);
						break;		
				}
				case 6:
				{
						//Stop Watch Starts here 
						long starttime=System.currentTimeMillis();						
						//Total number of numbers to be entered
						System.out.println("Enter the Number of elements to be entered :-");
						int number=sc.nextInt();
						//Declaration and initialization of Array of integers
						String list[]=new String[number];
						System.out.println("Enter the list of words:");
						for(int i=0;i<number;i++)
						{
							list[i]=sc.next();
						}
						String sortedlist[]=utility.sortword(list,number);
						System.out.println("The Sorted Elements Are");
						//Display the list of sorted elements
						for(int i=0;i<number;i++)
						{
							System.out.println(sortedlist[i]);	
						}	
						long endtime=System.currentTimeMillis();
						long timeEllapsed=endtime-starttime;
						System.out.println("Time ellapsed for binary search :- "+timeEllapsed);
						break;		
				}
				default:
				{
					System.out.println("Enter the Correct Choice ");	
					break;
				}
			}  //end switch  
				
		}
}
