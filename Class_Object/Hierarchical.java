import java.util.*;
class ArrParent
{
	int a[];
	public void setArray(int a[])
	{
		this.a=a;
	}
}
class Sort extends ArrParent
{
	public int[] getSortArray()
	{
		int Arr[]=new int[a.length];
		for(int i=0; i<a.length; i++)
		{
			Arr[i]=a[i];
		}
		for(int i=0; i<Arr.length; i++)
		{
			for(int j=i+1; j<Arr.length; j++)
			{
				if(Arr[i]>Arr[j])
				{
					int temp=Arr[i];
					Arr[i]=Arr[j];
					Arr[j]=temp;
				}
			}
		}
		return Arr;
	}
		
}
class Max extends ArrParent
{
	public int getMax()
	{
		int max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
}
class Min extends ArrParent
{
	public int getMin()
	{
		int min=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		return min;
	}
}

public class Hierarchical
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int no=sc.nextInt();
		int a[]=new int[no];
		System.out.println("Enter array elements");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		Sort s=new Sort();
		Max m=new Max();
		Min m1=new Min();
		
		s.setArray(a);
		m.setArray(a);
		m1.setArray(a);
		
		a=s.getSortArray();
		int max=m.getMax();
		int min=m1.getMin();
		
		System.out.println("Sorted array");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("Maximum no is :"+max);
		System.out.println("Minimum number is :"+min);
	}
}



