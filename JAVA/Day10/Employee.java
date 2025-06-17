package Day10.java;
import java.util.*;

class Person {
	String name;
	int age;
	
	public void accept1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		name=sc.next();
		
		System.out.println("Enter Age:");
		age=sc.nextInt();
		}

	public void display1()
	{
		System.out.println("Name: " +name);
		System.out.println("Age: " +age);
		}
}

class Emp extends Person
{
	float salary;
	
	public void accept2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary:");
		salary=sc.nextFloat();
		}
	
	public void display2()
	{
		System.out.println("Salary: "+salary);
		}
	}

public class Employee
{
	public static void main(String args[])
	{
		Emp e=new Emp();
		
		e.accept1();
		e.accept2();
		e.display1();
		e.display2();
		}

	}
