class A
{	
	A(int x)
	{
		System.out.println("i am parent constructor");
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
public class SuperCons
{
	public static void main(String x[])
	{
		B b1=new B();
	}
}