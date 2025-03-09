/*2. Write a JAVA program to copy one string to another string.
I/P: priti
O/P priti*/

import java.util.*;
public class CopyOneToAnother
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String origionalstring=sc.nextLine();
		String copy=origionalstring;
		System.out.println("copy of the string is: " +copy);
	}
}