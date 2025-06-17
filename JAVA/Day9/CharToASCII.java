package Day9.java;
import java.util.*;

public class CharToASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character:");
		char ch=sc.next().charAt(0);
		
		int ascii=(int)ch;
		System.out.println("ASCII value of ' " +ch+ " ' is: " +ascii);  
	}

}
