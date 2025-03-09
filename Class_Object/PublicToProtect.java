class parent
{
	public void display()
	{
		System.out.println("I am parent class");
	}
}
class child  extends parent
{
	protected void display()
	{
		System.out.println("I am child class");
	}
}

public class PublicToProtect
{
	public static void main(String x[])
	{
		child c=new child();
		c.display();
	}
}