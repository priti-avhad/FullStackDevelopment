import java.util.*;
public class RotateArr
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
		
		System.out.println("Enter the indesx from we have to rotate array");
		int index=sc.nextInt();
		
		for(int i=0; i<index; i++)
		{
			int first=a[0];
			for(int j=0; j<size-1; j++)
			{
				a[j]=a[j+1];
			}
			a[size-1]=first;
		}
		System.out.println("Array after rotating");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}