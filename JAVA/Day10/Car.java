package Day10.java;

import java.util.*;;

public class Car {
	String model;
	String name;

	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Car Model:");
		model=sc.next();
		
		System.out.println("Enter Car name:");
		name=sc.next();
		}

	public void display()
	{
		System.out.println("Car Model: " +model);
		System.out.println("Car Name: " +name);
		}

	public static void main(String args[])
	{
		Car c=new Car();
		
		c.accept();
		c.display();

	}	

}
