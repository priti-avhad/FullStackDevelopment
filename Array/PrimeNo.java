/*Q3. Write a java program to find prime number in array.*/

import java.util.*;
public class PrimeNo
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the values in the array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0; i<a.length; i++)
		{
			int no=a[i];
			int count=0;
			
			for(int j=1; j<=no; j++)
			{
				if(no%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(no+" ");
			}
		}
	}
}
