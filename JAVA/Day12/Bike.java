package Day12.java;

abstract class Vehicle {
	abstract void start();
	}

class Car extends Vehicle
{
	void start()
	{
		System.out.println("car Start");
		}
	}

class Bike extends Vehicle
{
	void start()
	{
		System.out.println("Bike Start");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle v1=new Car();
		Vehicle v2=new Bike();
		v1.start();
		v2.start();
	}

}
