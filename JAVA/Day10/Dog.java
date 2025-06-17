package Day10.java;

class Animal {
	
	void sound()
	{
		System.out.println("Animal makes Sounds...");
		}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog Barks...");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d=new Dog();
		d.sound();
		d.bark();
	}

}
