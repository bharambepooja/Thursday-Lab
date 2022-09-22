/*
Q2: Write a program to accept choice from user and perform the operation:
1: factorial
2:sum of digit
3:Armstrong number or not
4:fibonacci series
5:Prime no or Not
*/


import java.util.Scanner;

public class Operation {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1: Factorial Number.");
	    System.out.println("2: Sum of Digit.");
	    System.out.println("3: Armstrong Number.");
	    System.out.println("4: Fibonacci Series");
	    System.out.println("5: Prime Number.");
		System.out.println("Enter a Choice:");
	    int ch=sc.nextInt();
	      
		switch(ch)
		{
		
		case 1:
			System.out.println("You Have Choosen Factorial Number!!!!");
			is_factorial();
			break;
		
		case 2:
			System.out.println("You Have Choosen Sum of Digit!!!!");
			sum_digit();
			break;
			
		case 3:  
			System.out.println("You Have Choosen Armstrong Number!!!!");
			is_armstrong();
			break;
			
		case 4:  
			System.out.println("You Have Choosen Fibonacci Series!!!!");
			fibonacci_series();
			break;
			
		case 5:  
			System.out.println("You Have Choosen Prime Number!!!!");
			is_prime();
			break;
			
			default:
				System.out.println("Please Enter Correct Choice.......");
		}
	}
	
	public static void is_factorial() {
		 int i,fact=1;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number :");
		 int number=sc.nextInt();       //It is the number to calculate factorial    
		 
		 for(i=1;i<=number;i++){    // loop for
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);  
	}
	
	public static void sum_digit() {
		int number, digit, sum = 0;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		number = sc.nextInt();  
		while(number > 0)  
		{  
			digit = number % 10;       //finds the last digit of the given number    
			sum = sum + digit;             //adds last digit to the variable sum   
			number = number / 10;      //removes the last digit from the number  
		} 
		System.out.println("Sum of Digits: "+sum);     //print the result
	}
	
	
	public static void is_armstrong() {
		
		int n,r,sum=0,temp;         //assigning n into a temp variable  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");    
		 n=sc.nextInt(); 
		 
		temp=n;    
		while(n>0)            //loop execute until the condition becomes false  
		{    
		r=n%10;    
		sum=sum+(r*r*r);    
		n=n/10;    
		}    
		if(temp==sum)    
		System.out.println("Armstrong number");    
		else    
			System.out.println("Not Armstrong number");    
	}
	
	public static void fibonacci_series(){
		 int n1=0,n2=1,n3,i,count=10; 
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Number :");
		 int number=sc.nextInt();
		 System.out.print(n1+" "+n2);        //printing 0 and 1    
		    
		 for(i=2;i<count;++i)                    //loop starts and printing number   
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
        }
	
	public static void is_prime() {
		
			  int i,m=0,flag=0;     
			  
			  Scanner sc =new Scanner(System.in);
				System.out.println("Enter Number :");
				 int n=sc.nextInt();                               // number to be checked
				 
				 m=n/2;       
				 if(n==0||n==1)
			  {  
				  System.out.println(n+" is not prime number");
				  }
			  else
				  {  
				  for(i=2;i<=m;i++){      
			      if(n%i==0){      
			      System.out.println(n+" is not prime number");      
			       flag=1;      
			     break;      
			     }      
			   }      
			   if(flag==0)  { System.out.println(n+" is prime number"); }  
			  }                                      //end of else
			}
}
