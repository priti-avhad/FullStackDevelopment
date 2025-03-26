/*Q5. Write a java program to copy one array to another array.*/

import java.util.*;
public class CopyOneArrToAnother
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
		
		int b[]=new int[size];
		for(int i=0; i<a.length; i++)
		{
			b[i]=a[i];
		}
		
		//display copied array
		System.out.println("Copied array elements");
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]+" ");
		}
	}
}