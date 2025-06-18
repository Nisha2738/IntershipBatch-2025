package Day12.java;
import java.util.*;

class Shape {

	void area()
	{
		System.out.println("This is Shape Class");
		}
	}

class Circle extends Shape
{
	double r;
	void area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius:");
		r=sc.nextDouble();
		
		double circleArea=3.14*r*r;
		System.out.println("Circle Area :" +circleArea);
		}
}

class Rectangle extends Shape
{
	double b,h;
	void area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Height:");
		h=sc.nextDouble();
		
		System.out.println("Enter Breadth:");
		b=sc.nextDouble();
		double RectArea=h*b;
		System.out.println("Rectangle Area :" +RectArea);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s1=new Circle();
		s1.area();
		Shape s2=new Rectangle();
		s2.area();
	}

}
