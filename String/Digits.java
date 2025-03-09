/*Check if a String Contains Only Digits ?
Input: "12345"
Output: true*/

import java.util.*;
public class Digits
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=sc.nextLine();
		
		 // Check if the string contains only digits
		 boolean flag=true;
		 for(int i=0; i<input.length(); i++)
		 {
			 char ch=input.charAt(i);
			 if(ch<'0' || ch>'9')
			 {
				 flag=false;
				 break;
			 }
		 }
		   System.out.println("output is:"+flag);
	}
}



