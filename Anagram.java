/*
  file name:Anagram.java
  Created by:Dhiresh Bhoir
  Create Date:-06-10-2016
  Purpose:To Check Whether Two Strings Are Anagram Or Not
*/
package com;
import java.util.*;
public class Anagram
{
    static void isAnagram(String str1, String str2)
    {		
		Utility utility=new Utility();
        //Removing all white spaces from str1 and str2
        String copyOfstr1 = str1.replaceAll("\\s", "");
        String copyOfstr2 = str2.replaceAll("\\s", "");
 
        //Initially setting status as true
        boolean status = true;
        if(copyOfstr1.length() != copyOfstr2.length())
        {
            //Setting status as false if copyOfstr1 and copyOfstr2 doesn't have same length
            status = false;
        }
        else
        {
            //Changing the case of characters of both copyOfstr1 and copyOfstr2 and converting them to char array
            char[] str1Array = copyOfstr1.toLowerCase().toCharArray();
            char[] str2Array = copyOfstr2.toLowerCase().toCharArray();
 
            //Sorting both str1Array and str2Array by calling sortChar
            String sortstr1=utility.sortChar(str1Array);
            String sortstr2=utility.sortChar(str2Array);
 
            //Checking whether str1Array and str2Array are equal
            status = sortstr1.equals(sortstr2);
        }
        //Output
        if(status)
        {
            System.out.println(str1+" and "+str2+" are anagrams");
        }
        else
        {
            System.out.println(str1+" and "+str2+" are not anagrams");
        }
    }
 
    public static void main(String[] args)
    {
		Utility utility=new Utility();
		Scanner sc = new Scanner(System.in);
		String str1,str2;
	    System.out.println("Enter the 1st string :");
		str1 = sc.next();
		System.out.println("Enter the 1st string :");
		str2 = sc.next();   
		System.out.println();   
        isAnagram(str1,str2);
 
    }
}
