package Day6_operators3.java;
import java.util.*;

public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter num1:");
		int num1=sc.nextInt();
		
		System.out.println("Enter num2:");
		
		int num2=sc.nextInt();
		
		int And_ans=num1 & num2;
		System.out.println("Bitwise AND:" +And_ans);
		
		int Or_ans=num1 | num2;
		System.out.println("Bitwise OR:" +Or_ans);
		
		int Xor_ans=num1 ^ num2;
		System.out.println("Bitwise XOR:" +Xor_ans);
		
		
	
	}

}
