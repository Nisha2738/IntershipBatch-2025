package Day18.java;

public class NullPointer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str=null;
		try
		{
			System.out.println("Length: " +str.length());
			}
		catch(NullPointerException e)
		{
			System.out.println("Exception: Access method on null object");
		}
	}

}
