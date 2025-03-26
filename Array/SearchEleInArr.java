/*Q2. Write a java program to search element in array ,  its element found or not*/

import java.util.*;
public class SearchEleInArr
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements in the array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter no to find ");
		int skey=sc.nextInt();
		boolean flag=false;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==skey)
			{
				flag=true;
				break;
			}
		}
		if(flag)
			{
				System.out.println("Element found");
			}
			else
				{
					System.out.println("Element not found");
				}
	}
}

