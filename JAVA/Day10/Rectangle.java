package Day10.java;
import java.util.*;

class Shape {
	void display()
	{
		System.out.println("This is a Shape Class");
		}
}

class Circle extends Shape
{
	double r;
	void circleArea()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius:");
		r=sc.nextDouble();
		}
	
	void displayCircle()
	{
		double areac=3.14*r*r;
		System.out.println("Area of Circle: "+areac);
		}
}

class Rectangle extends Shape
{
	double height,width;
	void RectArea()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Height:");
		height=sc.nextDouble();
		
		System.out.println("Enter Width:");
		width=sc.nextInt();
		}
	
	void displayRect()
	{
		double arear=height*width;
		System.out.println("Area of Rectangle: "+arear);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c=new Circle();
		c.display();
		c.circleArea();
		c.displayCircle();
		
		Rectangle r=new Rectangle();
		r.display();
		r.RectArea();
		r.displayRect();
	}

}
