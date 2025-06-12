package Day7_Expression.java;
import java.util.*;

public class LogicalExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Value of a:");
		int a=sc.nextInt();
		
		System.out.println("Enter Value of b:");
		int b=sc.nextInt();
		
		System.out.println("Enter Value of c:");
		int c=sc.nextInt();
		
		System.out.println("Enter Value of d:");
		int d=sc.nextInt();
		
		System.out.println("Enter Value of e:");
		int e=sc.nextInt();
	
		if(e!=0)
		{
			int result=(a+b)*(c-d)/e;
			System.out.println("result :" +result);
			}
		else
		{
			System.out.println("Division by Zero is not allowed");
			}
		}
	}
