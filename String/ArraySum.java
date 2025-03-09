/*Q2. Write a program to calculate the sum of elements in an array of integers using the 
	Integer wrapper class.
	Input: {10, 20, 30, 40}
	Output: Sum = 100*/
	

import java.util.*;
public class ArraySum
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		
		Integer a[]=new Integer[size];
		System.out.println("Enter elements in array");
		for(int i=0; i<size; i++)
		{
			a[i]=Integer.valueOf(sc.nextInt());
		}
		
		//using wrapper class
		Integer sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum is="+sum);
	}
}