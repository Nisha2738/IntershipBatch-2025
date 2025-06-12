package Day7_Expression.java;

public class SplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String student="101,Ravi,78,85,90";
		String[] details=student.split(",");
		
		System.out.println("Student Details:");
		for(String detail: details)
		{
			System.out.println(detail);
		}
 
	}

}
