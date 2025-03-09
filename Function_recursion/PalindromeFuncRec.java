package demo;
import java.util.*;
public class PalindromeFuncRec {

	static int rev=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		int temp=no;
		int result=getPalindrome(no);
		
		if(temp==rev)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("no is not palindrome");
		}
		
	}

	private static int getPalindrome(int no) {
		if(no!=0)
		{
			int rem=no%10;
			no=no/10;
			rev=rev*10+rem;
			return getPalindrome(no);
		}
		else
		{
			return rev;
		}
	}

}
