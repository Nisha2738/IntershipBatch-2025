package Day8.java;
import java.util.*;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Alphabet:");
		char ch=sc.next().toLowerCase().charAt(0);
		
		switch(ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
		
				System.out.println("Vowels");
				break;
				
			default:
				if(ch >= 'a' && ch <= 'z')
				{
					System.out.println("Constant");
					}
				else
				{
					System.out.println("Invalid Alphabet");
				}
			}
			
		}
	}
