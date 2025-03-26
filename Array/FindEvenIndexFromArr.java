/*Q.3 Write a java program to find even index number from array.*/

import java.util.*;
public class FindEvenIndexFromArr
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements in the array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Elements at the even index");
		for(int i=0; i<a.length; i+=2)
		{
			System.out.println("Index"+i+"--->"+a[i]);
		}
	}
}