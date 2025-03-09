/*Convert a Sentence to Title Case ?
Input: "java is fun"
Output: "Java Is Fun"*/

import java.util.*;
public class ConvertToTitleCase
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String input=sc.nextLine();
		String result=" ";
		
		boolean flag=true;
		for(int i=0; i<input.length(); i++)
		{
			char ch=input.charAt(i);
			
			if(ch==' ')
			{
				result=result+ch;
				flag=true;
			}
			else
			{
				if(flag&& ch>='a' && ch<'z')
				{
					result=result+(char)(ch - 32);
					flag=false;
				}
				else if(!flag && ch>='A' && ch<='Z')
				{
					result=result+(char)(ch+32);
				}
				else
				{
					result=result+ch;
					flag=false;
				}
			}
		}
		System.out.println("output is : "+result);
	}
}