package Day6_Operators.java;
import java.util.*;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Temperature:");
		float tmp=sc.nextFloat();
		
		if(tmp>30)
		{
			System.out.println("Hot Day");
			}
		else
		{
			System.out.println("Normal Day");
		}
		
	}

}
