package demo;
import java.util.*;
public class FibonacciSeriesFuncRec {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		int result=isFibonacci(no);

}

	private static int isFibonacci(int no) {
		int first=0;
		int second=1;
		
		for(int i=0; i<=no; i++)
		{
			System.out.println(first+" ");
			int third=first+second;
			first=second;
			second=third;
		}
		return no;
	}
}