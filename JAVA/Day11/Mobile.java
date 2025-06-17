package Day11.java;
import java.util.*;

class Mobile {
	
		String model;
		int price;
		
		void accept()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Model:");
			model=sc.next();
			
			System.out.println("Enter Price:");
			price=sc.nextInt();
			}
		
		void display()
		{
			System.out.println("Model name : "+model);
			System.out.println("Price : "+price);
			}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Mobile m1=new Mobile();
			Mobile m2=new Mobile();
			m1.accept();
			m2.accept();
			
			m1.display();
			m2.display();
		}

	}
