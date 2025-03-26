/*Q4. Write a java program to find missing element in array.*/

import java.util.*;
public class MissingEle
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter element in the arry");
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
		
		System.out.println("Missing elements are as follows");
		for(int i=0;i<a.length-1; i++)
		{
			for(int j=a[i]+1; j<a[i+1]; j++)
			{
				System.out.println(j+" ");
			}
		}
	}
}