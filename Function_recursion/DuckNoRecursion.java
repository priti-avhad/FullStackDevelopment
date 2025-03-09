package demo;
import java.util.*;
public class DuckNoRecursion {

	static boolean flag=false;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		boolean result=FindDuck(no);
		if(flag)
		{
			System.out.println("number is duck");
		}
		else
		{
			System.out.println("number is not duck");
		}
	}

	private static boolean FindDuck(int no) 
	{
		int rem;
		
		while(no!=0)
		{
			rem=no%10;
			no=no/10;
			
			if(rem==0)
			{
				flag=true;
				break;
			}
		}
		
		return flag;
	}
	
	

}
