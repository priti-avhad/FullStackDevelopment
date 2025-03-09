/*Q2. WAP to create class name as TestArr with method
void acceptArray(int a[],int b[]) : this method can accept array
as parameter
we have three child classes name as Union with method
void findUnionOfArray():this method can find the union of two
array and display
and we have one more child name as Intersection with method
void findInetersection() this method can find the intersection of
array and display it and we have third MergeArray with method
void mergeArray(): this method 
display it.*/

import java.util.*;
class TestArr
{
	int a[];
	int b[];
	public void acceptArray(int a[],int b[])
	{
		this.a=a;
		this.b=b;
	}
}
class Union extends TestArr
{
	void findUnionOfArray()
	{
		
	}
}

class Intersection extends TestArr
{
	void findInetersection()
	{
		
	}
}
class MergeArray extends TestArr
{
	void mergeArray()
	{
		
	}
}


public class ArrayOperation
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		System.out.println("Enter the elements in array");
		int a[]=new int[size];
		for(int i=0; i<size; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the size of second array");
		int size=sc.nextInt();
		System.out.println("Enter the elements in array");
		int b[]=new int[size];
		for(int i=0; i<size; i++)
		{
			b[i]=sc.nextInt();
		}
		
		Union u=new Union();
		u.acceptArray(a,b);
		u.findUnionOfArray();
		
		Intersection i=new Intersection();
		i.acceptArray(a,b);
		i.findInetersection();
		
		MergeArray m=new MergeArray();
		m.acceptArray(a,b);
		m.mergeArray();
		
	}
}
