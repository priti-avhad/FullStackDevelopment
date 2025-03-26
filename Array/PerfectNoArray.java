/*Q4. Write a java program to find perfect number in array.*/

import java.util.*;
public class PerfectNoArray
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
		
		System.out.println("Perfect numbers in the array");
		for(int i=0; i<a.length; i++)
		{
			int no=a[i];
			int sum=0;
			
			for(int j=1; j<no; j++)
			{
				if(no%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==no)
			{
				System.out.println(no+" ");
			}
		}
	}
}