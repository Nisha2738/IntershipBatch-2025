package Day17.java;

import java.util.Scanner;

public class DivisionFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num 1:");
		int a=sc.nextInt();
		
		System.out.println("Enter num 2:");
		int b=sc.nextInt();
		
		try
		{
			int ans=a/b;
			System.out.println("Division: " +ans);
		
			}
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero");
			}
		
		finally
		{
			System.out.println("I am always executes");
		}

	}

}
