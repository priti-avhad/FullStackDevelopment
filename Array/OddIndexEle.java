/*Q.4 Write a java program to find odd index number from array.*/

import java.util.*;
public class OddIndexEle
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter elements in the array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=1; i<a.length;i+=2)
		{
			System.out.println("Index"+i+"--->"+a[i]);
		}
	}
}