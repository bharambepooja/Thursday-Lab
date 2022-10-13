/*
Q1)Single :
WAP to create a class which contain the method Palindrom .the second class will 
use the proerty of first class and display the output.
*/

package Single;

import java.util.Scanner;

public class Palindrome {
	 

	public static void Palindrome() {

		int num1, rev, sum = 0, temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");
		num1 = sc.nextInt();
		temp = num1;
		while (num1 > 0) // get the reverse of temp store it in variable
		{
			rev = num1 % 10;
			sum = (sum * 10) + rev;
			num1 = num1 / 10;
		}
		if (temp == sum) // check if sum and temp is equal
			System.out.println("It is a Palindrome !!!!!" + temp);
		else
			System.out.println("It is not a Palindrome !!!!!" + temp);
	}

}


package Single;

public class Display_Output  extends Palindrome {
public static void main(String[] args) {
		
	Palindrome(); // calling the palindrome function in this class 
	
}

}
