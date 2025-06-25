package Day18.java;

public class ArrayIndexed01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {1,2,3,4,5};
		try
		{
			System.out.println("6th element: " +num[5]);		
			}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception: Invalid array index");
		}
	}
}
