import java.util.*;
public class SumOfEvenOdd
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
		int evensum=0;
		int oddsum=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				evensum=evensum+a[i];
			}
			else
			{
				oddsum=oddsum+a[i];
			}
		}
		System.out.println("Even number sum is : "+evensum);
		System.out.println("Odd number sum is :"+oddsum);
	}
}