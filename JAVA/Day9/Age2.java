package Day9.java;
import java.util.*;

public class Age2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		
		if(age>=60 || age<=12)
		{
			System.out.println("The person is senior citizon or child");
			}
		else
		{
			System.out.println("The person is neither senior citizon or child");
		}
	}

}
