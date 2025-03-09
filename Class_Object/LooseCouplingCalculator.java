import java.util.*;
abstract class Value
{
	int a,b;
	void setValue(int x, int y)
	{
		a=x;
		b=y;
	}
	
	abstract void performCalculation();
}
class Add extends Value
{
	void performCalculation()
	{
		int Addition=a+b;
		System.out.println("Addition is"+Addition);
	}
}

class Mul extends Value
{
	void performCalculation()
	{
		int Multiplication=a*b;
		System.out.println("multiplication is"+Multiplication);
	}
}

class Div extends Value
{
	void performCalculation()
	{
		if (b!=0) 
		{
			int division = a/b;
			System.out.println("Division is " + division);
		} 
		else 
		{
			System.out.println("Division by zero is not allowed.");
		}
	}
}

class Sub extends Value
{
	void performCalculation()
	{
		int subtraction=a-b;
		System.out.println("Subtraction is"+subtraction);
	}
}

class Calculator
{
	void performOperation(Value v)
	{
		v.performCalculation();
	}
}

public class LooseCouplingCalculator
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=sc.nextInt();
		System.out.println("Enter value of b");
		int b=sc.nextInt();
		
		Calculator c=new Calculator();
		Value v=null;
		
		int choice;
		do
		{
			System.out.println("options in the program");
			System.out.println("1: Addition");
			System.out.println("2: Multiplication");
			System.out.println("3: Division");
			System.out.println("4: Subtraction");
			System.out.println("5: Exit");
		
			
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
				v=new Add();
				break;
				
				case 2:
				v=new Mul();
				break;
				
				case 3:
				v=new Div();
				break;
				
				case 4:
				v=new Sub();
				break;
				
				case 5:
				System.out.println("Existing...thank you!!!");
				break;
				
				default:
				System.out.println("invalid choice...please try again");
			}
			if(v != null)
			{
				v.setValue(a,b);
				c.performOperation(v);
				v=null;
			}
		}while(choice!=5);
	}
}