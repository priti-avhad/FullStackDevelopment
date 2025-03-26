import java.util.*;
public class MultiplicationTableNo
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to find table");
		int no=sc.nextInt();
		int i=1;
		
		while(i<=10)
		{
			System.out.println(no*i);
			i++;
		}
	}
}