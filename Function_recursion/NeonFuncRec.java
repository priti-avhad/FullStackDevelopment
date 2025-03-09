package demo;
import java.util.*;
public class NeonFuncRec {
	static int rem,sum;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		int result=isNeon(no);
		if(result==no)
		{
			System.out.println("no is neon");
		}
		else
		{
			System.out.println("no is not neon");
		}
	}

	private static int isNeon(int no) {
		int sqr=no*no;
		sum=0;
		while(sqr!=0)
		{
			int rem=sqr%10;
			sum=sum+rem;
			sqr=sqr/10;
		}
		return sum;
	}

}
