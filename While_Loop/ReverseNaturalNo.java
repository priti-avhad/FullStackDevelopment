import java.util.*;
public class ReverseNaturalNo
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		System.out.println("natural number in reverse order is");
		
		while(no>=1)
		{
			System.out.println(no+" ");
			no--;
		}
	}
}