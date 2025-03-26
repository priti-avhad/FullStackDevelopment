/*Q3. Write a java program to display the reverse array.*/

import java.util.*;
public class ReverseArr
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
		
		int left=0;
		int right=a.length-1;
		
		while(left<right)
		{
			int temp=a[left];
			a[left]=a[right];
			a[right]=temp;
			left++;
			right--;
		}
		
		System.out.println("Reverse array is :");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
		
	}
}