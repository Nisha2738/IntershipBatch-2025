package Day18.java;

public class NullPointer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name=null;
		if(name!=null) {
			System.out.println("Name Length: " +name.length());
			}
		else
		{
			System.out.println("String is Null");
		}

	}

}
