import java.util.*;
public class FindUniqueEle
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements");
		for(int i=0; i<a.length; i++)
		{
			boolean flag=true;
			for(int j=i+1; j<a.length; j++)
			{
				if(i!=j && a[i]==a[j])
				{
					flag=false;
					break;
				}			
			}
			if(flag)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}