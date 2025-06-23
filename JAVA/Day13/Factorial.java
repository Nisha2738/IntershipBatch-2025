package Factorial.java;
import java.util.*;

public class Factorial {
	    public static void main(String[] args) {

	    	int num;
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter Number:");
	    	num=sc.nextInt();
	    
	        long fact = 1;

	        for (int i = 1; i <= num; i++) {
	            fact *= i;
	        }

	        System.out.println("Factorial of " + num + " is: " + fact);
	    }

}
