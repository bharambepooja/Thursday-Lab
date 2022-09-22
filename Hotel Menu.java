//Q3: Create a menu for food counter and accept the items from user and display the final Bill amount with the item is ordered

import java.util.*;

public class Hotel_Management {
		public static void main(String args[]) 
		{
			System.out.println("... Welcome ...");
			System.out.println("Place Order....");
			int menu_item,order,item_amt=0,count=0,req=0;
			char ch;
			String item_name = " ";
			Scanner s = new Scanner(System.in);
			
			do
			{
				System.out.println("   \nMenu Card :\n 1 : STARTERS \n 2 : MAIN COURSE \n 3 : DESERTS ");
				menu_item = s.nextInt();
				switch(menu_item)
				{
				case 1:
					System.out.println(".. STARTERS MENU..");
					System.out.println("1: Masala Papad \t 150Rs.");
					System.out.println("2: Cheese Pizza \t 300Rs.");
					System.out.println("3: Chinese \t 250Rs.");
					order = s.nextInt();
					if(order==1) 
					{
						 System.out.println("Enter Quantity : ");
						 req = s.nextInt();
						 if(count<req)
						 {
						item_amt = item_amt + 150;
						 item_amt = item_amt * req;
						 item_name+="\n STARTERS - Masala Papad";
						 }
					}
					else if(order==2)
					{
						System.out.println("Enter Quantity : ");
						 req = s.nextInt();
						 if(count<req)
						 {
						 item_amt = item_amt + 300;
						 item_amt = item_amt * req;
						 item_name+="\n STARTERS - Cheese Pizza";
						 }
					}
					else 
					{
						System.out.println("Enter Quantity : ");
						 req = s.nextInt();
						 if(count<req)
						 {
						 item_amt = item_amt + 250;
						 item_amt = item_amt * req;
						 item_name+="\n STARTERS - Chinese ";
						 }
					}
					break;
				case 2:
					System.out.println(".. MAIN COURSE MENU ..");
					System.out.println("1: Panner Chilly \t 480Rs.");
					System.out.println("2: Mashroom Gravy \t\t 520Rs.");
					System.out.println("3: Veg Special Thali \t 780Rs.");
					order = s.nextInt();
					if(order==1) 
					{
						System.out.println("Enter Quantity : ");
						 req = s.nextInt();
						 if(count<req)
						 {
						 item_amt = item_amt + 480;
						 item_amt = item_amt * req;
						 item_name+="\n MAIN COURSE - Panner Chilly";
						 }
					}
					else if(order==2)
					{
						System.out.println("Enter Quantity : ");
						 req = s.nextInt();
						 if(count<req)
						 {
						 item_amt = item_amt + 520;
						 item_amt = item_amt * req;
						 item_name+="\n MAIN COURSE - Mashroom Gravy";
						 }
					}
					else
					{
						System.out.println("Enter Quantity : ");
						 req = s.nextInt();
						 if(count<req)
						 {
						 item_amt = item_amt + 780;
						 item_amt = item_amt * req;
						 item_name+="\n MAIN COURSE - Veg Special Thali ";
						 }
					}
					break;
				case 3:
					System.out.println(".. DESERTS MENU ..");
					System.out.println("1: Faluda \t160Rs.");
					System.out.println("2: Ice Cream \t 180Rs.");
					System.out.println("3: Rasgulla \t 150Rs.");
					order = s.nextInt();
					if(order==1) 
					{
						System.out.println("Enter Quantity : ");
						 req = s.nextInt();
						 if(count<req)
						 {
						 item_amt = item_amt + 160;
						 item_amt = item_amt * req;
						 item_name+="\n DESERTS - Faluda";
						 }
					}
					else if(order==2)
					{
						System.out.println("Enter Quantity : ");
						 req = s.nextInt();
						 if(count<req)
						 {
						 item_amt = item_amt + 180;
						 item_amt = item_amt * req;
						 item_name+="\n DESERTS - Ice Cream";
						 }
					}
					else 
					{
						System.out.println("Enter Quantity : ");
						 req = s.nextInt();
						 if(count<req)
						 {
						 item_amt = item_amt + 150;
						 item_amt = item_amt * req;
						 item_name+="\n DESERTS - Rasgulla";
						 };
					}
					break;
					default:
						System.out.println("Invalid Choice");
						break;
				}
				System.out.println("Do you want to try any another item y/n");
				ch = s.next().charAt(0);
			}
			while(ch=='Y'||ch=='y');
			
			System.out.println("Thank You and Visit Again...");
			System.out.println("Food Items : \t "+item_name);
			System.out.println("Quantity:"+req);
			System.out.println("Total Bill Amount : \t"+item_amt);
		}
	}
