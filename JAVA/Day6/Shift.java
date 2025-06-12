package Day6_Operators4.java;
import java.util.*;

public class Shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		
		int left=num << 2;
		int right=num >> 2;
		int unsignedRight= num >>> 2;
		
		System.out.println("Left Shift:" +left);
		System.out.println("Right Shift:" +right);
		System.out.println("Unsigned Right Shift:" +unsignedRight);
		
		
	}

}
