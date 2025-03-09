import java.util.*;
abstract class Animal
{
	abstract void makeSound();
}

class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("Dog say bark");
	}
}
class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("cat say mau");
	}
}
public class AnimalAbstract
{
	public static void main(String x[])
	{
		Dog d=new Dog();
		d.makeSound();
		
		Cat c=new Cat();
		c.makeSound();
	}
}
