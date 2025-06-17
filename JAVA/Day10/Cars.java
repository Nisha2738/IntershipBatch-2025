package Day10.java;

class Vehicle {
	void start()
	{
		System.out.println("Vehicle is Starting...");
		}
}

class Bike extends Vehicle
{
	void ride()
	{
		System.out.println("Riding the Bike...");
		}
}

class Cars extends Vehicle
{
	void drive()
	{
		System.out.println("Driving the Car...");
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike b=new Bike();
		b.start();
		b.ride();
		
		Cars c=new Cars();
		c.start();
		c.drive();
		
	}

}
