/*Q.1 Write a java program to take 5 elements in a Array and display it.*/


import java.util.*;
public class DisplayArrayEle
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements in the array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Elements in array are");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}