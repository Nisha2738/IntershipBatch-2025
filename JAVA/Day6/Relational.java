package day6_Operators.java;
import java.util.*;

public class Relational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		
		if(num>0)
		{
			System.out.println("Number is Positive");
			}
		else if(num<0)
		{
			System.out.println("Number is Negative");
			}
		else
		{
			System.out.println("Number is Zero");
			}
		

	}

}
