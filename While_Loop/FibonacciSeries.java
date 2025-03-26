import java.util.*;
public class FibonacciSeries
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		
		int first=0;
		int second=1;
		
		for(int i=0; i<=no; i++)
		{
			System.out.println(first+"");
			int next=first+second;
			first=second;
			second=next;
		}
	}
}