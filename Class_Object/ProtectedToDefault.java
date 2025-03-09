class parent
{
	protected void display()
	{
		System.out.println("parent mmethod");
	}
}
class child extends parent
{
	void display()
	{
		System.out.println("child method");
	}
}

public class protectedToDefault
{
	public static void main(String x[])
	{
		child c=new child();
		c.display();
	}
}