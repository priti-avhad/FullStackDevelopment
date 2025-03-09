import java.util.*;
interface ArrayOperation
{  
	void acceptArray(int a[], int b[]);
	int[] getResult();
}

// Implementing class for merging arrays
class MergeArray implements ArrayOperation
{
	private int a[];
	private int b[];
	
	public void acceptArray(int a[], int b[])
	{
		this.a=a;
		this.b=b;
	}
	public int[] getResult()
	{
		int c[]=new int[a.length+b.length];
		for(int i=0; i<a.length; i++)
		{
			c[i]=a[i];
		}
		for(int i=0; i<b.length; i++)
		{
			c[a.length+i]=b[i];
		}
		return c;
	}
}

// Implementing class for finding union of arrays

class UnionOfArray implements ArrayOperation
{
	private int a[];
	private int b[];
	
	public void acceptArray(int a[], int b[])
	{
		this.a=a;
		this.b=b;
	}
	public int[] getResult()
	{
		int temp[]=new int[a.length+b.length];
		int index=0;
		
		for(int i=0; i<a.length; i++)
		{
			if(!ispresent(temp,index,a[i]))
			{
				temp[index++]=a[i];
			}
		}
		for(int i=0; i<b.length; i++)
		{
			if(!ispresent(temp,index,b[i]))
			{
				temp[index++]=b[i];
			}
		}
		
		int c[]=new int[index];
		for(int i=0; i<index; i++)
		{
			c[i]=temp[i];
		}
		return c;
	}
	
	private boolean ispresent(int a[], int length, int value)
	{
		for(int i=0; i<length; i++)
		{
			if(a[i]==value)
			{
				return true;
			}
		}
		return false;
	}
}
public class TestInterface
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of first array");
		int n1=sc.nextInt();
		int a[]=new int[n1];
		System.out.println("Enter elements of first array");
		for(int i=0; i<n1; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter size of second array");
		int n2=sc.nextInt();
		int b[]=new int[n2];
		System.out.println("Enter elements of first array");
		for(int i=0; i<n2; i++)
		{
			b[i]=sc.nextInt();
		}
		
		System.out.println("choose an operation");
		System.out.println("1. merge array");
		System.out.println("2. union of array");
		int choice=sc.nextInt();
		
		ArrayOperation Ao;
		
		switch(choice)
		{
			case 1:
				Ao=new MergeArray();
			    break;
				
			case 2:
				Ao=new UnionOfArray();
			    break;
			default:
				System.out.println("invalid choice");
			    return;
		}
		
		Ao.acceptArray(a,b);
		int result[]=Ao.getResult();
		System.out.print("Resultant array: [");
		for(int i=0; i<result.length; i++)
		{
			System.out.print(result[i]);
			if(i<result.length-1)
			{
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
}