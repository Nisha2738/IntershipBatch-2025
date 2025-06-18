package Day12.java;

class Animal {
	void makeSound()
	{
		System.out.println("Animal makes Sounds...");
		}
}

class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("Dog barks");
		}
}

class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("Cat meww");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a1=new Dog();
		a1.makeSound();
		
		Animal a2=new Cat();
		a2.makeSound();
	}

}
