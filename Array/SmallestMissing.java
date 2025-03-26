/*Q1. Write a program to find the smallest missing element from a sorted array.*/

import java.util.*;
public class SmallestMissing
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter elements in array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("Missing elements is");
		int count=0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=a[i]+1; j<a[i+1]; j++)
			{
				System.out.println(j+" ");
				count++;
				break;
			}
			if(count!=0){
				break;
			}
			
		}
	}
}