/*
Q2)"Multilevel:
WAP to create a class Reverse No, second class SOD , 
Third class use both the class property and display the output
*/



package Multilevel;
import java.util.Scanner;
public class Sum_of_Digit extends Reverse {

	public static void sums (){
		int number, digit, sum = 0;  
	    Scanner sc = new Scanner(System.in);  
	    System.out.print("Enter the number: ");  
	    number = sc.nextInt();
	    //using while loop to find sum of digits of number
	    while(number > 0)  
	    {  
	    //finds the last digit of the given number    
	    digit = number % 10;  
	    //adds last digit to the variable sum  
	    sum = sum + digit;  
	    //removes the last digit from the number  
	    number = number / 10;  
	    }  
	    //prints the result  
	    System.out.println("Sum of Digits: "+sum);
	}

}



package Multilevel;
import java.util.*; 

public class Reverse {
	public static void rev () {
		int num,revnum=0,rem;    //Getting input from user
	    System.out.println("Enter the Number : ");
	    Scanner sc = new Scanner(System.in);
	    num=sc.nextInt();
	   
	    int orinum=num;  //Initializing Original number
	  
	    while(num != 0)  //Using while loop to reverse the number 
	    {
	      rem=num%10; // dividing the number
	      revnum=revnum*10+rem; // storing the remainder
	      num /= 10;
	    }
	    System.out.println("Reverse of "+orinum+" is "+revnum);
	}

}


package Multilevel;

public class Operation extends Sum_of_Digit { //inheriting the class

	public static void main(String[] args) {
		rev(); //calling a function
		sums(); //calling a function

	}

}
