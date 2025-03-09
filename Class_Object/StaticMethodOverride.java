class parent
{
	static void display()
	{
		System.out.println("Static method in parent class");
	}
}

class child extends parent
{
	static void display()
	{
		System.out.println("Static method in child class");
	}
}

public class StaticMethodOverride
{
	public static void main(String x[])
	{
		child c=new child();
		c.display();
	}
}