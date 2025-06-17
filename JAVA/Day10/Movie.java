package Day10.java;
import java.util.*;

public class Movie {
	
	String title,director;
	int year;
	
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Title of the Movie:");
		title=sc.next();
		
		System.out.println("Enter Director's Name:");
		director=sc.next();
		
		System.out.println("Enter Release Year:");
		year=sc.nextInt();
		}
	
	void display()
	{
		System.out.println("Movie Title	:	"+title);
		System.out.println("Director	:	"+director);
		System.out.println("Release Year:	"+year);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movie m1=new Movie();
		Movie m2=new Movie();
		m1.accept();
		m2.accept();
		
		m1.display();
		m2.display();
		
		
	}

}
