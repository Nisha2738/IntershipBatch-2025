package Day12.java;

public class Student {
	private String name;
	private int age;
	
	public void setName(String n)
	{
		name=n;
	}

	public String getName()
	{
		return name;
	}
	
	public void setAge(int a)
	{
		age=a;
	}
	
	public int getAge()
	{
		return age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student();
		s.setName("Nisha");
		s.setAge(18);
		
		System.out.println("Student Name: "+s.getName());
		System.out.println("Student Age: " +s.getAge());
		
	}

}
