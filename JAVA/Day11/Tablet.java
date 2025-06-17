package Day11.java;

class Device 
{
	void powerOn()
	{
		System.out.println("Device is poering on...");
		}
}

class SmartPhone extends Device
{
	void powerOn()
	{
		System.out.println("SmartPhone is turning On...");
		}
}

class Tablet extends Device
{
	void powerOn()
	{
		System.out.println("Tablet is starting up...");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone s=new SmartPhone();
		Tablet t=new Tablet();
		
		s.powerOn();
		t.powerOn();
	}

}
