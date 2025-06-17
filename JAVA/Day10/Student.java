package Day10.java;
import java.util.*;

public class Student {
	String name;
	int age;
	
	public void accept()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Student Name:");
			name=sc.next();
			
			System.out.println("Enter Age:");
			age=sc.nextInt();
			}
	
	public void display()
	{
		System.out.println("Name: " +name);
		System.out.println("Age: " +age);
		}
	
	public static void main(String args[])
	{
		Student s=new Student();
		s.accept();
		s.display();
	}

}
