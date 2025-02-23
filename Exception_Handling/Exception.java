import java.util.*;
public class Exception
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		
		do
		{
			System.out.println("\n Exception menu");
			System.out.println("1. ArithmeticException");
			System.out.println("2. NullPointerException");
			System.out.println("3. NumberFormatException");
			System.out.println("4. ArrayIndexOutOfBoundsException");
			System.out.println("5. ClassNotFoundException");
			System.out.println("6. Exit");
			System.out.println("Enter your choice");
			
			choice=sc.nextInt();
	 try
		{
			switch(choice)
			{
				case 1:
				System.out.println("Enter first number");
				int a=sc.nextInt();
				System.out.println("Enter second number");
				int b=sc.nextInt();
				int result=a/b;
				System.out.println("result is"+result);
				break;
				
				
				case 2:
				 String str=null;
				 System.out.println(str.length());
				 break;
				
				
				case 3:
				System.out.println("Enter a string");
				String invalidNumber=sc.next();
				int num=Integer.parseInt(invalidNumber);
				System.out.println("parsed number"+num);
				break;
				
				
				case 4:
				int arr[]={1,2,3};
				System.out.println("Enter array index");
				int index=sc.nextInt();
				System.out.println("Value at index"+index+": "+arr[index]);
				break;
				
				
				case 5:
				System.out.println("Enter class name :");
				String className=sc.next();
				Class.forName(className);				
				break;
				
				case 6:
				System.out.println("Existing program...");
				
				default:
				System.out.println("invalid choice");
			}
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by 0 is not allowed");
		}
		catch(NullPointerException e)
		{
			System.out.println("cannot operate on null object");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("specified class not found");
		}
		catch(Throwable e)
		{
			System.out.println("unexpected exception"+e);
		}
	}
	while(choice!=6);
}
}