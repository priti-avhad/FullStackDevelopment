/*2) Find Majority Element in an Array*/

import java.util.*;
public class Majority_array
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter values in the array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		int mcount=0;
		int element=0;
		
		for(int i=0; i<a.length; i++)
		{
			int count=0;
			for(int j=0; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			
			if(count>mcount)
			{
				mcount=count;
				element=i;
			}
		}
		if(mcount>(size/2))
		{
			System.out.println("majority element is"+a[element]);
		}
		else
		{
			System.out.println("no majority element");
		}
	}
}