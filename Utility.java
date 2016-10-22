/*
  file name:Utility.java
  Created by:Dhiresh Bhoir
  Create Date:-03-10-2016
  Purpose:Contains the Functions which are to be used in main class.
*/
package com;
import java.util.*;
import java.io.*;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
public class Utility
{
	Scanner sc=new Scanner(System.in);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	//Check the length of the string
	public boolean checklength(String string)
	{ 
		int length=string.length();
		//if length of the String is less than 3
		if(length<3)
		{ 
			return false;
		} 
		//if length of the String is more than 3
		else
		{
			return true;
		}
	}

	//replace username in String
	public String replaceusername(String username)
	{
		String str="Hello username ,How are you?";
		str=str.replaceAll("username",username);
		return str; 
	} 

	//count precentage of heads and tails
	public void countHeadTail(int number)
	{
		int head=0;
		int tail=0;
		//Declare random function 
		Random r=new Random();
		for(int i=0;i<number;i++)
		{
			if((r.nextInt(number)%2)<0.5)//creating random value 
			{
				tail++;
			}
			else
			{
				head++;
			}
		}
		System.out.println("count of head :"+(float)head*(100/number));//Display percentage of head
		System.out.println("count of tail :"+(float)tail*(100/number));//Display percentage of Tail
	}

	//validate number between 0-31  
	public boolean validateNO(int number)
	{
		if(number<31 && number>0)
		{ 
			return true;
		}
		else
		{
			return false;
		}
	} 

	//generate table for power 2^n
	public void powerTable(int number)
	{
		int power=1;
		System.out.println("Table :"); 
		//power of 0 is 1 
		if(number==0)
		{
			System.out.println("2^0=1"); 
		}
		else
		{
			for(int i=1;i<=number;i++)
			{
				power=power*2;
				System.out.println("2^"+i+"="+power); 
			}
		}
	} 

	//calculate Harmonic value of n number
	public float calHarmonic(int number)
	{
		float harmonic=0;
		for(int i=1;i<=number-1;i++)
		{
			System.out.print("(1/"+i+")+");	
			harmonic=harmonic+(1.0f/i);          
		}
		System.out.print("(1/"+number+")");	
		harmonic=harmonic+(1.0f/number);
		return harmonic;
	}

	//to calculate prime factors
	public void calPrimefactor(int number)
	{
		int i;
		System.out.print("Factors of "+number+" : ");
		for(i=2;i*i<=number;i++) 
		{
			//mod of number should be 0
			while(number%i==0)
			{
				System.out.print(i+" ");
				number=number/i;
			}
		}
    		//if number is divisble by itself
		if(number>1)
		{
			System.out.print(number);
		}
	System.out.println();
	}

	//track of number of times gambler wins and loss
	public void gamblegame(int stake,int goal,int no)
	{
		int bets=0,loss=0,wins=0;
		for (int i=0;i<no; i++) 
		{
			int cash = stake;
			while (cash > 0 && cash < goal) //play until cash get zero or cash not reach to goal
			{
				bets++;
				if (Math.random() < 0.5)
				cash++;     
				else
				cash--;     
			}
			if (cash == goal)	//if cash achieve the goal win else loss
				wins++;                
			else
			loss++;
		}
		System.out.println("No of wins :"+wins);
		System.out.println("Percent of win = "+100.0*wins/no);
		System.out.println("Percent of loss = "+100.0*loss/no);

	}

	//2d array record input
	public int[][] put2Ddata(int rows,int cols)
	{
		//creating and initializing array for rows and columns
		int[][] arr=new int[rows][cols];
		int i,j;
		for(i=0;i<rows;i++)
		{ 
			for(j=0;j<cols;j++)
			{
				System.out.println("enter ["+(i)+"]["+j+"] element : ");
				arr[i][j]=sc.nextInt();
			}          
		}   
	return arr;
	}
	  
	// print distinct triples (i, j, k) such that arr[i] + arr[j] + arr[k] = 0
	public static void printAll(int arr[]) 
	{
		int count=0;	
		int n = arr.length;
		System.out.println("Triples :");
		for (int i = 0; i < n; i++) 
			{
			for (int j = i + 1; j < n; j++) 
				{
				for (int k = j + 1; k < n; k++) 
					{
					if (arr[i] + arr[j] + arr[k] == 0) 
					{
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
						count++;					
					}
				}
			}
		}
		System.out.println(" There are "+count+" triples in this array");
	}
	
	//To Sort the elements of String
	public String sortChar(char[] charArray)
	{
	char temp;
	int i,j;	    
	for(i=0;i<charArray.length;i++)
	    {
	        for(j=i+1;j<charArray.length;j++)
	        {
	            if(charArray[j]<charArray[i])
	            {
	                temp=charArray[j];
	                charArray[j]=charArray[i];
	                charArray[i]=temp;
	            }
	        }
	    }
	    String outstr=new String(charArray);
	    return outstr;
	}
	//Bubble sort for sorting numbers
	public int[] bubbleSort(int arr[])
	{
		for (int i=0;i<arr.length;i++)
		{
	                for (int j=arr.length-1;j>i;j--) 
			{
		                if (arr[j]<arr[j-1]) 
				{	//Swapping elements
			                int temp = arr[j];
					arr[j] = arr[j-1];
        				arr[j-1] = temp;
            			}
            		}
		}
		return arr;
	}
	//Reading file line by line
	public ArrayList getFileText(String fileName)throws IOException
	{	
		FileReader in = new FileReader(fileName);
		BufferedReader br = new BufferedReader(in);
		String CurrentLine;
		ArrayList myList = new ArrayList();
		while ((CurrentLine=br.readLine()) != null) 
		{
		        myList.add(CurrentLine);
		}
		in.close();
		return myList;
	}
	//String Insertion sort for sorting character
	public static String insertionSortChar(String str)
	{
		//Removing all white spaces from String	    
		String copyOfstr = str.replaceAll("\\s", "");
		//Converting String into char array
		char[] strArray = copyOfstr.toCharArray();
		int n=strArray.length;
		for (int j=1;j<n;j++) 
		{
    			char key=strArray[j];
    			int i=j-1;
	    	    	while ((i>-1)&&(strArray[i]>key))
			{
		            strArray[i+1]=strArray[i];
		            i--;
		     	}
		        strArray[i+1] = key;
		}
		String outstr=new String(strArray);//sorted string
	        return outstr;
	}
	//To sort list of words using bubble sort
	public String[] sortword(String str[],int n)
	{
		String temp;
		for (int i = 0; i < n; i++) 
		{
	        	for (int j = i + 1; j < n; j++) 
	        	{
	        		if (str[i].compareTo(str[j])>0) 
	            		{	//Swapping words
	                 		temp = str[i];
	                 		str[i] = str[j];
	                 		str[j] = temp;
	            		}
	        	}
	    	}
	 	return str;
	}
	//Binary search for searching word in list 
	public void wordBinarySearch(String sortedList[],String key)
	{
		int start = 0;
		int mid=0;
        	int end = (sortedList.length)-1;
        	while (start <= end) 
		{	
	            mid = (start + end) / 2;
		    String listString=sortedList[mid];
	            if (listString.compareTo(key)==0) 
			{	//word founded
				System.out.println("Search value founded at "+(mid+1));
				break;
	    	        }
	    	        if (listString.compareTo(key)>0) 
			{
		                end = mid - 1;
		        } 
			else 
			{
	                	start = mid + 1;
	                }
 	       }
		if(start>end)
			System.out.println("Search value not Found");
	}

	//read text from file
	public String readFileText(String file)
	{
		StringBuilder sb=new StringBuilder();
		//line to read the line from the file	
		try
		{
			BufferedReader br=new BufferedReader(new FileReader(file));
			//Creates the of String Builder class to manipulate String
			
			String line=br.readLine();
			while(line!=null)
			{
				//Add a line util it is null using append method
				sb.append(line);
				//add line seperator after each line 
				sb.append(System.lineSeparator());
				//read the line
				line=br.readLine();
			}
			br.close();
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return sb.toString();
	} 
	
	//perform insertion sort on the entered numbers
	public int[] insertionSort(int arr[],int number)
	{
		int i=0,j=1;
		for(i=1;i<number;i++)
		{
			//Declaring and initializing the key value
			int key=arr[i];
			//sorts the array of integers in ascending order
			for(j=i-1;j>=0 && arr[j]>key;j--)//to sort in decsending order list[j]<key
			{
				//Swap the words
				arr[j+1]=arr[j];
				arr[j]=key;
			}

		}
	return arr;
	}
	//Binary search for searching number in list 
	public void binarySearch(int arr[],int size)
	{
		int first=0;
		int last=size-1;
		int mid=(first+last)/2;
		int searchvalue;
		//enter the Search value from user
		System.out.println("Enter the value to search :");
		searchvalue=sc.nextInt();
		while(first<=last)
		{
			if(arr[mid]<searchvalue)
			{
				first=mid+1;
			}
			else if(arr[mid]==searchvalue)
			{
				System.out.println("Search value founded at "+(mid+1));
				break;
			}
			else
				last=mid-1;
	
				mid=(first+last)/2;
		}
		if(first>last)
			System.out.println("Search value not Found");
	}

	//perform insertion sort on the entered String
	public String[] insertSortwords(String list[],int number)
	{
		int i=0,j=1;
		for(i=1;i<number;i++)
		{
	   		//Declaring and initializing the key value
			String key=list[i];
			for(j=i-1;j>=0 && list[j].compareTo(key)>0;j--)
			{
				//Swap the words
				list[j+1]=list[j];
				list[j]=key;
			}
				
		}
		 return list;
	}
	//to check whether number is 10 digit 0 not
	public boolean isTenDigit(String number) {
		if((number.length())==10&&number.contains("[a-zA-Z]+") == false)
			return true;
		else
			return false;
	}
	//return Date in form dd/mm/yyyy format
	public static String getFormattedDate(Date date)
	{
			SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
			return sdf.format(date);
	}
	//Replace the user details with regex
	public String RegexReplace(Userinfo user,String message)
	{
		String firstName="<<Name>>";
		String fullName="<<Full Name>>";
		String mobileno="xxxxxxxxxx" ;
		String Date="01/01/2016";
		
		//Regex to replace first Name 
		Pattern p=Pattern.compile(firstName);
		Matcher m=p.matcher(message);
		message=m.replaceAll(user.getFirstName()); 

		//Regex to replace full Name
		p=Pattern.compile(fullName);
		m=p.matcher(message);
		message=m.replaceAll(user.getFirstName()+" "+user.getLastName());

		//Regex to replace mobile number
		p=Pattern.compile(mobileno);
		m=p.matcher(message);
		message=m.replaceAll(user.getMobileNumber());	


		//Regex to replace Date
		p=Pattern.compile(Date);
		m=p.matcher(message);
		message=m.replaceAll(user.getDate());

		return message;
	}
}




