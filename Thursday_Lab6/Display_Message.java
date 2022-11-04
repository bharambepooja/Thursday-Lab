/*
 Q1. Write a program that creates 2 threads -each displaying a message (Pass the message as 
     a parameter to the constructor).The threads should display the messages continuously till 
     the user presses any key.
*/


package Thursday_Thread;

import java.io.*;

public class Thread_class1 extends Thread
{
	String str; 
	Thread_class1(String s)   // constructor accepting a parameter
	{
		str = s;
	}
	
	public void run()           // run method calling by the another class
	{
		// infinity loop
		for ( ; ; ) 
		{
			    System.out.println((Thread.currentThread()).getName()+" "+"Message: "+str); // printing the message
	            System.out.println((Thread.currentThread()).getName()+" "+"Priority:  "+(Thread.currentThread()).getPriority()); // printing the priority here
	             
	            try
	            {
	                Thread.sleep(2000);   // sleeping the thread for 2 sec
	            }
	            catch(Exception e)
	            { 
	                System.out.println(e);
	            }
	    }
	}
}


package Thread;

public class Thread_Class 
{

	public static void main(String[] args) 
	
		Thread_class1 ob = new Thread_class1("The Thread is Active");     // passing Message to the constructor
		Thread_class1 ob1 = new Thread_class1("The Thread is UNACTIVE");  // passing Message to the constructor
		System.out.println("---Display the running---");
		

            // calling the run method
		ob.start(); 
		ob1.start(); 
	}

}
