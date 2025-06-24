package Day17.java;

public class Division1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a=10;
		int b=0;
		try
		{
			int ans=a/b;
			System.out.println("Division: " +ans);
		
			}
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero");
			}
	}

}


	


