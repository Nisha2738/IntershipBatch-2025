package Day8.java;
import java.util.*;

public class TrafficDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter colour:");
		String colour=sc.next();
		
		switch(colour)
		{
			case "Red":
				System.out.println("Stop");
				break;
				
			case "Yellow":
				System.out.println("Wait");
				break;
				
			case "Green":
				System.out.println("Start");
				break;
				
			default:
				System.out.println("Invalid colour");
				
				
		}
	}

}
