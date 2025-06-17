package Day10.java;
import java.util.*;

public class Book {
	String title,author;
	
		
		public void accept()
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Title:");
				title=sc.next();
				
				System.out.println("Enter Author name:");
				author=sc.next();
				}
		
		public void display()
		{
			System.out.println("Book Title: " +title);
			System.out.println("Author Name: " +author);
			}
		
		public static void main(String args[])
		{
			Book b1=new Book();
			Book b2=new Book();
			b1.accept();
			b2.accept();
			b1.display();
			b2.display();
		}

	}