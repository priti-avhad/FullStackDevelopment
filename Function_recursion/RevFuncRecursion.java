package demo;
import java.util.*;
public class RevFuncRecursion 
{
	static int rev;
	public static void main(String[] args) 
	{
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		no=sc.nextInt();
		int result=getRev(no);
		System.out.println(result+" ");
	}

	private static int getRev(int no) 
	{
		if(no!=0)
		{
			int rem=no%10;
			no=no/10;
		     rev=rev*10+rem;
			return getRev(no);
		}
		else
		{
			return rev;
		}
	}

}
