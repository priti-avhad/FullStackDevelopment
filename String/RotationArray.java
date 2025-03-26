import java.util.*;
public class RotationArray
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter elements in array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the index");
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
		System.out.println("Array rotate is :");
		for(int i=0; i<size; i++)
		{
			System.out.println(a[i]+"\t");
		}
	}
}