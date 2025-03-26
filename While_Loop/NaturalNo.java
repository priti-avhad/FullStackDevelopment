import java.util.*;
public class NaturalNo
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int no,i;
		System.out.println("Enter the number");
		no=sc.nextInt();
		i=1; 
		
		while(i<=no)
		{
			System.out.println(i+" ");
			i++;
		}
	}
}