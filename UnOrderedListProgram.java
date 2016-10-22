/*
  file name:UnOrderedListProgram.java
  Created by:Dhiresh Bhoir
  Create Date:-10-10-2016
  Purpose:To create unordered list using LinkList  
*/
package com;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;

	class UnOrderedListProgram
		{
			public static void main(String args[])
				{
					//create the object of the UnOrderedLinklist class
					UnOrderedLinklist list=new UnOrderedLinklist();
					//create the object of Scanner class
					Scanner sc=new Scanner(System.in);
					try
					{	
						//Create the object of FileREader Class to read the File
						FileReader fr=new FileReader("/home/bridgeit/Documents/Dhiresh/programs/Unordered.txt");//Path of the file to read					
						//read the data from the file
						BufferedReader br=new BufferedReader(fr);
						System.out.println("The data from the file :- ");
						String CurrentLine;
						CurrentLine=br.readLine(); 
						String[] words=CurrentLine.split("\\s");
						for(String w:words)	        		
						{
							list.add(w);
		    				}
						list.showList();
						System.out.println("Enter word to search");
						String search=sc.next();
						boolean flag=list.search(search);
						if(flag==true)
						{
							System.out.println("Word is founded in list");
							list.remove(search);
						}					
						else
						{ 
							System.out.println("Word is not founded in list");
							list.add(search);						
						}
						fr.close();
						FileWriter fw = new FileWriter("/home/bridgeit/Documents/Dhiresh/programs/Unordered.txt");//Path of the file to write					
						fw.write(list.listtoString());
						fw.close();
						list.showList();							
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
}
}
