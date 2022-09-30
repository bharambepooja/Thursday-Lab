//Write a program to accept a number from user and then prints the sum of the even and odd integers.//

package Thusday_Lab;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) 
	{
		int number,odd=0,even=0;  //we initialize that even and odd
		char ans;
		Scanner sc=new Scanner(System.in); 
	
		do                                        //do while  so this do part will execute at least one 
		{
			System.out.println("Enter number");
			number=sc.nextInt();
			if(number %2==0)                        //check number is even or odd
			{
				even=even+number;                    //if number is even so we can add this 
			}else 
				odd=odd+number;                        ////if number is odd so we can add this 
		
		System.out.println("Do you want to Continue this process y/n");
		ans=sc.next().charAt(0);
	}
	while(ans=='Y'||ans=='y');               //condition for process continue or not 

		
		System.out.println("Sumb off odd number is = "+even);       //display  sum of even number
		System.out.println("sumb of even number is = "+odd);         // display sum of odd number
	}

}
