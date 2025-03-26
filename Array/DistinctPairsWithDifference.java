/*Q3. Write a program to count all distinct pairs for a specific difference.*/

import java.util.*;
public class DistinctPairsWithDifference
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter values in the array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the differnece values");
		int diff=sc.nextInt();
		
		int count=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if((a[i]-a[j]==diff || a[j]-a[i]==diff))
				{
					count++;
				}
			}
		}
		System.out.println("count of distinct pair with difference :"+diff+":"+count);
		
	}
}