
//WAP to accept the number from user and check if it is prime or not, Pass the number in different function
//and check if it is Even or Odd, If Even check if number is divisible by 10 or not, If Odd Check if number
//is divisible by 3 or not.


import java.util.*;

public class FunctionsPrimeEvenOddDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generating object
		functionsPrimeEODiv obj=new functionsPrimeEODiv();
		Scanner sc = new Scanner(System.in);
		int num;
		//taking input from user as number
	    System.out.print("Enter the Number : ");
	    num = sc.nextInt();
	    //calling evenodd() to get if number is even or odd
		char a=obj.evenodd(num);
		obj.prime(num);
		//using if else condition to run even or odd part
		if(a=='e') {
			obj.ifeven(num);
		}
		else {
			obj.ifodd(num);
		}
	}
	public void prime(int p) {
		int i, count=0;
	    //for loop
	    for(i=2; i<p; i++)
	    {
	    //if condition
	       if(p%i == 0)
	       {
	          count++;
	          break;
	       }
	    }
	      //if else to print if prime or not
	      if(count==0) {
	      System.out.println(+p+" is a Prime Number.");
	   }
	      else {
	      System.out.println(+p+" is not a Prime Number.");
	   }
	}
	public char evenodd(int EO) {
		//initializing character to take value if number is even or odd
		char ans;
		if(EO%2==0) {
			System.out.println(+EO+" is Even");
			ans='e';
		}
		else {
			System.out.println(+EO+" is Odd");
			ans='o';
		}
		//returning the ans in function
		return ans;
	}
	public void ifeven(int e) {
		//checking if the number is divisible by 10 or not
		if(e%10==0) {
			System.out.println(+e+" is divisible by 10");
		}
		else {
			System.out.println(+e+" is not divisible by 10");
		}
	}
	public void ifodd(int o) {
		//checking if the number is divisible by 3 or not
		if(o%3==0) {
			System.out.println(+o+" is divisible by 3");
		}
		else {
			System.out.println(+o+" is not divisible by 3");
		}
	}

}
