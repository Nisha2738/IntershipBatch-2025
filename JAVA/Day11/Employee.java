package Day11.java;
import java.util.*;

class Employee {
	
		String name;
		int ID;
		
		void accept()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Name:");
			name=sc.next();
			
			System.out.println("Enter ID:");
			ID=sc.nextInt();
			}
		
		void displayInfo()
		{
			System.out.println("Name : "+name);
			System.out.println("ID : "+ID);
			}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Employee e=new Employee();
			e.accept();
			e.displayInfo();
		}

	}
