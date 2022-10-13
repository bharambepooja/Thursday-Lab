/*
Q4) Write a program to accpet the positive numbers  from user and display the sum of 
that numbers using loop.
*/

import java.util.Scanner;

public class Sum_Positive
{

	//private static final String countinue = null;
	Scanner sc=new Scanner(System.in);
	
	void sumPositive ()
	{
		int size,i,sum=0;
		System.out.println("Enter how many number u want to display");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the  numbers ");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]>0)
			{
				sum = sum + arr[i];
			}
		}
		System.out.println("sum of positive numbers is = "+sum);
	}
	
	public static void main(String[] args)
	{
		Sum_Positive obj =new Sum_Positive();
		obj.sumPositive();

	}

}
