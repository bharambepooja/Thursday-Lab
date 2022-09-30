//WAP to accept size of array from user accordingly accept numbers from user and number which user wants to remove from array and display the output


import java.util.*;

public class ArrayAddDel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size1,i,j,element;
		System.out.println("Enter size : ");
		size1=sc.nextInt();
		int no[]=new int[size1];
		System.out.println("Enter "+size1+" numbers:");
		//using for loop
		for(i=0;i<size1;i++) {
			no[i]=sc.nextInt();
		}
		//Showing array before deletion
		System.out.println("Array is : ");
		for(i=0;i<no.length;i++) {
			System.out.print(no[i]+ " ");
		}
		//taking element to be deleted
		System.out.println("\nEnter the Element to Remove: ");
	    element = sc.nextInt();
	    //using for loop to remove the given element
	    for(i=0; i<size1; i++)
	      {
	         if(element==no[i])
	         {
	            for(j=i; j<(size1-1); j++)
	            	no[j] = no[j+1];
	            System.out.println("\nRemoved the element successfully!");
	            break;
	         }
	      }
	    //displaying the new array with removed element
	    System.out.println("\nThe new array is: ");
	      for(i=0; i<(size1-1); i++) {
	         System.out.print(no[i]+ " ");
	      }
	}

}
