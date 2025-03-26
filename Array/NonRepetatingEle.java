import java.util.*;
public class NonRepetatingEle
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter elements in array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0; i<n; i++)
		{
			boolean flag=false;
			for(int j=0; j<n; j++)
			{
				if(1!=j && a[i]==a[j])
				{
					flag=true;
					break;
				}
			}
			if(!flag)
			{
				System.out.println("First non repetating element is :"+a[i]);
				return;
			}
		}
		System.out.println("no no repetating element found");
	}
}