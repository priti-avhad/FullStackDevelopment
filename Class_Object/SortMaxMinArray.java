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
		int max=a[0];;
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
public class SortMaxMinArray
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements in the array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		Sort s=new Sort();
		Max m=new Max();
		Min mi=new Min();
		
		s.setArray(a);
		m.setArray(a);
		mi.setArray(a);
		
		
		a=s.getSortArray();
		int max=m.getMax();
		int min=mi.getMin();
		
		
		System.out.println("Sorted array is");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("Maximum number is"+max);
		System.out.println("minimum no is"+min);
	}
}