/*Q.5 Write a java program to calculate the sum of all elements from a given array.*/

import java.util.*;
public class SumOfEle
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
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of the all number is :"+ sum+" ");
	}
}