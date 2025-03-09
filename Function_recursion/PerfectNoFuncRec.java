package demo;
import java.util.*;
public class PerfectNoFuncRec 
{	
	static int sum=0;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int no=sc.nextInt();
		int result=isPerfect(no);
		if(sum==no)
		{
			System.out.println("number is perfect");
		}
		else
		{
			System.out.println("number is not perfect");
		}

	}

	private static int isPerfect(int no) {
		int rem, i=1;
		while(i<=no/2)
		{
			rem=no%i;
			
			if(rem==0)
			{
				sum=sum+i;
			}
			i++;
		}
		return sum;
	}

}
