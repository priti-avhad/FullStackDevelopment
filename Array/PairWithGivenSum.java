/*Q5.Write java program to find a pair with given sum in the array.*/

import java.util.*;
public class PairWithGivenSum
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter elements in the array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter target sum");
		int targetsum=sc.nextInt();
		boolean flag=false;
		
		
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]+a[j]==targetsum)
				{
					System.out.println("("+a[i]+","+a[j]+")");
					flag=true;
				}
			}
		}
		if(!flag)
		{
			System.out.println("Pair not found");
		}
	}
}