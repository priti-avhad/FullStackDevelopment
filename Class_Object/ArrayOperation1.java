import java.util.*;
class Arrayope
{
	int a[];
	public void setArray(int a[])
	{
		this.a=a;
	}
}

class Unique extends Arrayope
{
	public void FindUnique()
	{
		for(int i=0; i<a.length; i++)
		{
			boolean flag=true;
			for(int j=0; j<a.length; j++)
			{
				if(i!=j && a[i]==a[j])
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.print("unique array is :"+a[i]);
			}
		}
		System.out.println();
	}
}

class MergeArray extends Arrayope
{
	public void FindMergedArray(int[]a, int[]b)
	{
		int c[]=new int[a.length+b.length];
		int j=0;
		System.out.println("After merging arrary");
		for(int i=0; i<a.length; i++)
		{
			c[j]=a[i];
			j++;
		}
		for(int i=0; i<b.length; i++)
		{
			c[j]=b[i];
			j++;
		}
		for(int i=0; i<c.length; i++)
		{
			System.out.println(c[i]);
		}
		System.out.println();
	}
}

public class ArrayOperation1
{
	public static void main(String x[])
	{
		//for unique arrary
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements in the array");
		for(int i=0; i<size; i++)
		{
			a[i]=sc.nextInt();
		}
		
		Unique u=new Unique();
		u.setArray(a);
		u.FindUnique();
		
		//for merge array
		System.out.println("Enter the size of the first array");
		int size1=sc.nextInt();
		int result1[]=new int[size1];
		System.out.println("Enter the elements of the array");
		for(int i=0; i<size1; i++)
		{
			result1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the size of seconf array");
		int size2=sc.nextInt();
		int result2[]=new int[size2];
		System.out.println("Enter the elements in second array");
		for(int i=0; i<size2; i++)
		{
			result2[i]=sc.nextInt();
		}
		
		MergeArray ma=new MergeArray();
		ma.setArray(a);
		ma.FindMergedArray(result1,result2);
	}
}