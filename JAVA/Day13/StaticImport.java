package StaticImport.java;
import static java.lang.Math.*;

public class StaticImport {
	public static void main(String[] args) {
	        double base = 3;
	        double exponent = 2;
	        double result = pow(base, exponent);  // 3^2 = 9
	        double squareRoot = sqrt(16);         // √16 = 4

	        System.out.println("3 raised to power 2 = " + result);
	        System.out.println("Square root of 16 = " + squareRoot);
	    }
	}
