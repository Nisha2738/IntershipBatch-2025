package Day7_Expression.java;

public class SplitDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="Hello? How are you? Good!";
		String[] parts=input.split("\\?||s*");
		
		for(String part: parts)
		{
			System.out.println(part);
		}
	}

}
