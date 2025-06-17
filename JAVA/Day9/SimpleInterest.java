package Day9.java;
import java.util.*;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle amount:");
		float p=sc.nextFloat();
		
		System.out.println("Enter Rate of Interest:");
		float r=sc.nextFloat();
		
		System.out.println("Enter Time:");
		float t=sc.nextFloat();

		float si=p*r*t;
		System.out.println("Simple Interest:" +si);
	}

}
