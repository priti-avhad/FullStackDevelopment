/*Q.4 Write ajava program to take 5 elements and display elements which are multiple of 5.*/

import java.util.*;
public class FindMultipleOfFiveNo
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter elements in the array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("numbers that are multiple of 5: ");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%5==0)
			{
				System.out.println(a[i]+" ");
			}
		}
	}
}