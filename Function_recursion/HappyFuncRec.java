package demo;
import java.util.*;
public class HappyFuncRec {

	static int sum;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		int result=isHappy(no);
		if(result==1)
		{
			System.out.println("Number is happy");
		}
		else
		{
			System.out.println("not happy no");
		}

	}

	private static int isHappy(int no) {
		int rem;
		
		while(no!=1 && no!=4)
		{
			rem=no%10;
			sum=0;
			
			while(no>0)
			{
				rem=no%10;
				sum=sum+(rem*rem);
				no=no/10;
			}
			no=sum;
		}
		return no;
	}

}
