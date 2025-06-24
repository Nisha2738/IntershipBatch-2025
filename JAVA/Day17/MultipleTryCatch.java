package Day17.java;
import java.util.*;

public class MultipleTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1:");
		num1=sc.nextInt();
		
		System.out.println("Enter num2:");
		num2=sc.nextInt();
		
		try
		{
			int add=num1+num2;
			System.out.println("Addition: " +add);
			
			int sub=num1-num2;
			System.out.println("Subtraction: " +sub);
			
			int mul=num1*num2;
			System.out.println("Multiplication: " +mul);
			
			int div=num1/num2;
			System.out.println("Division: " +div);
			}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
			}
		finally
		{
			System.out.println("I am always executes");
		}
		
	}

}
