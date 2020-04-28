package myproject;


import java.util.Scanner; 

class hotel
{
	String hotel_name;
	String owner_name;
	int hotel_licence_no;
	String customer_name;
	String customer_adhaar_no;
	String customer_mobile_no;
	int tables;
	int rooms;
	double bill_amount;

	
	hotel()
	{
		hotel_name="Shri-Krushana";
		owner_name="prathamesh kavale";
		hotel_licence_no=123456;
		customer_name="xyz";
		customer_adhaar_no="1234_5678_9000";
		customer_mobile_no="9876543210";
		tables=10;
		rooms=10;
		bill_amount=0;
	}
	
	hotel(String hotel_name,String owner_name,int hotel_licence_no,String customer_name,String customer_adhaar_no,String customer_mobile_no)
	{
		this.hotel_name=hotel_name;
		this.owner_name=owner_name;
		this.hotel_licence_no=hotel_licence_no;
		this.customer_name=customer_name;
		this.customer_adhaar_no=customer_adhaar_no;
		this.customer_mobile_no=customer_mobile_no;
		this.tables=tables;
		this.rooms=rooms;
		this.bill_amount=bill_amount;
	}
	void display()
	{
		System.out.println("+---------------------------------------+");
		System.out.println("|the hotel name:"+hotel_name+"           |");
		System.out.println("|Owner name:"+owner_name+"           |");
		System.out.println("+---------------------------------------+");
	}
}

class add_customer extends hotel
{
	void add_customer()
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("enter the customer name:");
		customer_name=s1.nextLine();
		
		System.out.println("enter the adhaar card no:");
		customer_adhaar_no=s1.nextLine();
		
		System.out.println("enter the mobile no:");
		customer_mobile_no=s1.nextLine();
		
		
	}
	void customer_display()
	{
		
		System.out.println("\n");
		System.out.println("*****************************************");
		System.out.println("the customer name:"+customer_name);
		System.out.println("the adhaar card no:"+customer_adhaar_no);
		System.out.println("the mobile no:"+customer_mobile_no);
		System.out.println("*****************************************");
		System.out.println("\n");
		
	}


	void booking()
	{
		int choice=0;
		int key1,key2;
		int table_charge=15;
		int room_bill=5000;
		Scanner s2 = new Scanner(System.in);
		while(choice<=2)
		{
		
			
		
		System.out.println("+---------------------------------------+");
		System.out.println("|        what do you want:              |");
		System.out.println("|              1.book a table           |");
		System.out.println("|              2.book a room            |");
		System.out.println("|              3.exit                   |");
		System.out.println("+---------------------------------------+");
		choice=s2.nextInt();
		
			switch(choice)
			{
				case 1:
				{
					System.out.println("the no of table avalables are:"+tables);
					System.out.println("if you want to book a table press '1' if no press '0' ");
					key1=s2.nextInt();
			
					if(key1==1)
					{
						System.out.println("your table is booked");
						tables--;	
						System.out.println("the no of table avalables are:"+tables);
						bill_amount=bill_amount+table_charge;
					}
					if(key1==0)
					{
						System.out.println("thank you");
					}
					break;
			
				}
				case 2:
				{
					System.out.println("the no of rooms avalables are:"+rooms);
					System.out.println("if you want to book a room press '1' if no press '0' ");
					key2=s2.nextInt();
					
					if(key2==1)
					{
						System.out.println("your room is booked");
						rooms--;	
						System.out.println("the no of rooms avalables are:"+rooms);
						bill_amount=bill_amount+room_bill;
					}
					if(key2==0)
					{
						System.out.println("thank you");
					}
					break;	
				}
				default:
	        	{
	        		System.out.println("invalid choice");
	        	}
			}
		}
	}
	
	void order_food()
	{
		Scanner s3 = new Scanner(System.in);
		
		double veg_thali=200;
		double non_veg_thali=250;
		double chappati=20;
		double roti=15;
		double rice=60;
		int food_choice=0;
		int quantity=0;
		while(food_choice<=5)
		{
		
			
			//System.out.println("\n");
			System.out.println("+---------------------------------------+");
			System.out.println("|        what do you want:              |");
			System.out.println("|              1.veg thali              |");
			System.out.println("|              2.non-veg thali          |");
			System.out.println("|              3.chappati               |");
			System.out.println("|              4.roti                   |");
			System.out.println("|              6.rice                   |");
			System.out.println("|              6.exit                   |");
			System.out.println("+---------------------------------------+");
			food_choice=s3.nextInt();
			
			switch(food_choice)
			{
				case 1:
				{
					System.out.println("how many quantity you want:");
					quantity= s3.nextInt();
					System.out.println("your order has been received");
					bill_amount=bill_amount+(quantity*veg_thali);
					break;
				}
				case 2:
				{
					System.out.println("how many quantity you want:");
					quantity= s3.nextInt();
					System.out.println("your order has been received");
					bill_amount=bill_amount+(quantity*non_veg_thali);
					break;
				}
				case 3:
				{
					System.out.println("how many quantity you want:");
					quantity= s3.nextInt();
					System.out.println("your order has been received");
					bill_amount=bill_amount+(quantity*chappati);
					break;
				}
				case 4:
				{
					System.out.println("how many quantity you want:");
					quantity= s3.nextInt();
					System.out.println("your order has been received");
					bill_amount=bill_amount+(quantity*roti);
					break;
				}
				case 5:
				{
					System.out.println("how many quantity you want:");
					quantity= s3.nextInt();
					System.out.println("your order has been received");
					bill_amount=bill_amount+(quantity*rice);
					break;
				}
				default:
	        	{
	        		System.out.println("invalid choice");
	        	}
			}
		}
	}
	
	void bill()
	{
		System.out.println("\n");
		System.out.println("+---------------------------------------+");
		System.out.println("|the hotel name:"+hotel_name+"           |");
		System.out.println("+---------------------------------------+");
		System.out.println("*****************************************");
		System.out.println("the customer name:"+customer_name);
		System.out.println("the adhaar card no:"+customer_adhaar_no);
		System.out.println("the mobile no:"+customer_mobile_no);
		System.out.println("+---------------------------------------+");
		System.out.println("your total bill is:"+bill_amount);
		System.out.println("+---------------------------------------+");
		System.out.println("******************************************");
		System.out.println("\n");
	}
		
}

public class mycode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hotel h1=new hotel();
		
		add_customer a1=new add_customer();
		Scanner s4 = new Scanner(System.in);
		int main_choice=1;
		
		while(main_choice<=5)
		{
			h1.display();
			System.out.println("+---------------------------------------+");
	        System.out.println("|       HOTEL MANAGEMENT SYSTEM         |");
	        System.out.println("+---------------------------------------+");
	        System.out.println("| Options:                              |");
	        System.out.println("|        1. Add New Customer            |");
	        System.out.println("|        2. View Customer detail        |");
	        System.out.println("|        3. booking                     |");
	        System.out.println("|        4. order                       |");
	        System.out.println("|        5. Check Out(print a bill)     |");
	        System.out.println("|        6. Exit                        |");
	        System.out.println("+---------------------------------------+");
	        
	        main_choice=s4.nextInt();
	        
	        switch(main_choice)
	        {
	        	case 1:
	        	{
	        		
	        		a1.add_customer();
	        		break;
	        	}
	        	case 2:
	        	{
	        		a1.customer_display();
	        		break;
	        	}
	        	case 3:
	        	{
	        		a1.booking();
	        		break;
	        	}
	        	case 4:
	        	{
	        		a1.order_food();
	        		break;
	        	}
	        	case 5:
	        	{
	        		a1.bill();
	        		break;
	        	}
	        	default:
	        	{
	        		System.out.println("invalid choice");
	        	}
	        }
	        
		}
	}

}
