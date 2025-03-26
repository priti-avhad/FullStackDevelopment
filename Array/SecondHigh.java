/*Q4.Write java program to find second highest element in array.*/

import java.util.*;
public class SecondHigh
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
		
		int max=0;
		int smax=0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax && a[i]!=max)
			{
				max=a[i];
			}
		}
		System.out.println("second max element is : " + smax);
	}
}