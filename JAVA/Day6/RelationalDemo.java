package Day6_Operators1.java;
import java.util.*;

public class RelationalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1:");
		int num1=sc.nextInt();
		System.out.println("Enter num2:");
		int num2=sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println("Greater num is " +num1);
			}
		else if(num2>num1)
		{
			System.out.println("Greater num is " +num2);
			}
		else
		{
			System.out.println("Both numbers are equal");
		}
	}

}
