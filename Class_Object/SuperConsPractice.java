class A
{
	A(int x)
	{
		System.out.println("I am parent constructor"+x);
	}
}

class B extends A
{
	B()
	{
		super(100);
		System.out.println("i am child constructor");
	}
}

public class SuperConsPractice
{
	public static void main(String x[])
	{
		B b1=new B();
	}
}