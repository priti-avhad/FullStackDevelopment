import java.util.*;
public class RemoveDuplicateArray
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter elements in the array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Remove duplicate elements in the array");
		for(int i=0; i<a.length; i++)
		{
			boolean flag=true;
			for(int j=0; j<a.length; j++)
			{
				if(i!=j && a[i]==a[j])
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(a[i]+" ");
			}
		}
	}
}