/*Q3. Write java program to frequency of each digit in array.*/

import java.util.*;
public class FrequencyOfDigit
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter values in the array");
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
		int count=1;
		for(int i=0; i<a.length; i++)
		{
			if(i<a.length-1 && a[i]==a[i+1])
			{
				count++;
			}
			else
			{
				System.out.println(a[i]+"-----"+count);
				count=1;
			}
		}
	}
}