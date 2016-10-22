/*
  file name:Stopwatch.java
  Created by:Dhiresh Bhoir
  Create Date:-07-10-2016
  Purpose:To measuring the time that elapses between the start and end clicks
*/
package com;
import java.util.*;
public class Stopwatch 
{ 
	public long startstopwatch=0;
	public long endstopwatch=0;
	public long elapsed;

	//starting timer
	public void start()
	{
		startstopwatch=System.currentTimeMillis();
		System.out.println("Start Time is:"+startstopwatch);		
	}
	//stoping timer
	public void stop()
	{
   	  	endstopwatch=System.currentTimeMillis();
		System.out.println("Stop Time is:"+endstopwatch);
	}
	
  	public long getElapsedtime( )
	{
 		elapsed=endstopwatch-startstopwatch;
		return elapsed;
	}
	public  static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
 		Stopwatch s=new Stopwatch();
		Utility u=new Utility(); 
		System.out.println("Press 1 to start time");
		int a=sc.nextInt();
		s.start();
		System.out.println("Press 2 to stop time");
		int a1=sc.nextInt();
		s.stop();
		long t=s.getElapsedtime();
		System.out.println("The total time elapsed is:  "+t);
	}
}
