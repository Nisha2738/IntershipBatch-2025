package Day8.java;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year:");
		int year=sc.nextInt();
		
		if(year%4==0)
		{
			System.out.println("Lear Year");
			}
		else
		{
			System.out.println("Not a Leap Year");
		}
	}

}
