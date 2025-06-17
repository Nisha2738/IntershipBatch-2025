package Day11.java;
import java.util.*;

public class Laptop {
	
	String brand;
	int price;
	
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Brand:");
		brand=sc.next();
		
		System.out.println("Enter Price:");
		price=sc.nextInt();
		}
	
	void displayInfo()
	{
		System.out.println("Brand : "+brand);
		System.out.println("price : "+price);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laptop l=new Laptop();
		l.accept();
		l.displayInfo();
	}

}
