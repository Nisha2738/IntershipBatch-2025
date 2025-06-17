package Day11.java;
import java.util.*;

class Pen {
	String brand,color;
	
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter brand:");
		brand=sc.next();
		
		System.out.println("Enter Color:");
		color=sc.next();
		}
	
	void display()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Color : "+color);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pen p=new Pen();
		p.accept();
		p.display();
	}

}
