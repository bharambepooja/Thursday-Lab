//WAP to create a deposit machine with features withdraw,deposit view balance.


import java.util.Scanner;

public class UserProcess {

	public static void main(String[] args) {
		userprocess obj = new userprocess();
		obj.process();
	}
	public void process() {
		Scanner sc = new Scanner(System.in);     //taking user input
		String u_id;                             //initializing variables
		char ans;
		int u_pass,u_bal,ch,balance = 0;

		bankprocess obj = new bankprocess();

		System.out.println("Enter User name ");
		u_id=sc.next();

		System.out.println("Enter Account Pass");
		u_pass=sc.nextInt();
		obj.getPass();

	   if(obj.getPass()==u_pass)               //if block to check password
      {
		do{
		System.out.println("Do you want to\n1. Deposit\n2. Withdraw\n3. Account Balance");
		ch=sc.nextInt();


		//switch case to initialize Deposit or Withdraw method
		switch (ch) {

		case 1:
			System.out.println("Enter Amount you want to Deposit");
			balance=sc.nextInt();
			obj.setAc_balcr(balance);
			System.out.println("The Username is "+u_id);
			System.out.println("The Account balance is Rs."+obj.getAc_balcr());
			break;

		case 2:
			System.out.println("Enter Amount you want to Withdraw");
			balance=sc.nextInt();
			obj.setAc_baldb(balance);
			if (obj.getAc_baldb()>=0) {
				System.out.println("The Username is "+u_id);
				System.out.println("The Account balance is Rs."+obj.getAc_baldb());
			} else {
				System.out.println("The Bank Account does not have Sufficient Funds to Withdraw");
			}
			
			break;

		case 3:
			System.out.println("The Account balance is Rs."+obj.getAc_baldb());
			break;

		default:
			System.out.println("Enter Valid Input");
			break;
		}

		System.out.println("Do you want to continue transaction? y/n");
		ans=sc.next().charAt(0);
	}

	while(ans=='Y'||ans=='y');
	}
		else {
		System.out.println("You've Entered wrong Password try again");
	}
}
		
	}
