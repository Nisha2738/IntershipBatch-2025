package Day11.java;

class Teacher {
	String name,subject;
	
	Teacher(String n, String s)
	{
		name=n;
		subject=s;
		}
}

class MathTeacher extends Teacher
{
	int experienceYear;
	
	MathTeacher(String n, String s, int exp)
	{
		super(n,s);
		experienceYear=exp;
		}
	
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Subject : "+subject);
		System.out.println("Experience " +experienceYear + " years");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathTeacher m=new MathTeacher("Nisha", "Maths" ,1);
		m.display();
	}

}
