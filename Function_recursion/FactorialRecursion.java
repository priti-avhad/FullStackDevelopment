package demo;
import java.util.*;
public class FactorialRecursion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int no=sc.nextInt();
		int result=getFactorial(no);
		System.out.println(result+" ");
	}

	private static int getFactorial(int no) {
		int f=1;
		for(int i=1; i<=no; i++)
		{
			f=f*i;
		}
		return f;
	}
}
