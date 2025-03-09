/0*7. Write a JAVA program to toggle case of each character of a string.
toggle case means lower to upper case and upper to lower in 1 code*/

import java.util.*;
public class ToggleCase
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		//initialize string for store result
		String toggledString=" ";
		
		for(int i=0; i<s.length(); i++)
		{
			char currentchar=s.charAt(i);
			
			if(currentchar>='A' && currentchar<='Z')
			{
				toggledString=toggledString+(char)(currentchar+32);
			}
			else if(currentchar>='a' && currentchar<='z')
			{
				toggledString=toggledString+(char)(currentchar-32);
			}
			else
			{
				toggledString=toggledString+currentchar;
			}
		}
		System.out.println("toggled case string"+toggledString);
	}
}