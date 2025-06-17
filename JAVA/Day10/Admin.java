package Day10.java;

class User {
	String username;
	String email;
	
	User(String u, String e)
	{
		username=u;
		email=e;
		}
	}

class Admin extends User
{
	int adminLevel;
	
	Admin(String u, String e, int level)
	{
		super(u, e);
		adminLevel=level;
		}
	
	void display()
	{
		System.out.println("Username: "+username);
		System.out.println("Email: "+email);
		System.out.println("Admin Level: "+adminLevel);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Admin a=new Admin("admin_nisha", "nishanikam56@exam.com", 2);
		a.display();
	}

}
