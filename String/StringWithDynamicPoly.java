import java.util.*;
interface StringTemplate
{
	void setString(String str);
	int getResult();
}

class ExtractDigit implements StringTemplate
{
	private String str;
	public void setString(String str)
	{
		this.str=str;
	}
	public int getResult()
	{
		int sum=0;
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if(Character.isDigit(ch))
			{
				sum=sum+Character.getNumericValue(ch);
			}
		}
		return sum;
	}
}

class CountVowel implements StringTemplate
{
	private String str;
	public void setString(String str)
	{
		this.str=str;
	}
	public int getResult()
	{
		int vowels=0;
		str=str.toLowerCase();
		for(int i=0; i<str.length();i++)
		{
			char ch=str.charAt(i);
			if("aeiou".indexOf(ch)!=-1)
			{
				vowels++;
			}
		}
		System.out.println("total vowels : "+vowels);
		return vowels;
	}
}

class StringHelper
{
	void performOperation(StringTemplate template, String s)
	{
		template.setString(s);
		System.out.println("result is : "+template.getResult());
	}
}

public class StringWithDynamicPoly
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		StringHelper help=new StringHelper();
		
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		System.out.println("choose operation: 1.for extract digit, 2 for countvowels");
		int choice=sc.nextInt();
		
		StringTemplate template;
		if(choice==1)
		{
			template=new ExtractDigit();
		}
		else
		{
			template=new CountVowel();
		}
		help.performOperation(template,s);
	}
}