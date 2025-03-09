package demo;
import java.util.*;
public class PrimeNoRecursion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		if(prime(no,2))
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("No prime");
		}
	}

	private static boolean prime(int no, int i) {
		if(no<=2)
		{
			return no==2;
		}
		if(no%i==0)
		{
			return false;
		}
		if(i*i>no)
		{
			return true;
		}
		return prime(no,i+1);
	}

}
