import java.util.*;
class StringData
{
	private String data;
	StringData(String data)
	{
		this.data=data;
	}
	
	int getLength()
		// without using inbuilt function
	{
		int length=0;
		for(int i=0; i<data.length(); i++)
		{
			length++;
		}
		return length;
	}
	
	StringBuffer getLowerToUpper()
	{
	    StringBuffer result = new StringBuffer();
		for(int i=0; i<data.length(); i++)
		{
			char ch=data.charAt(i);
			if(ch>='a' && ch<='z')
			{
				result.append((char)(ch-32));
			}
			else if(ch>='A' && ch<='Z')
				
			{
				result.append((char)(ch+32));
			}
			else
			{
				result.append(ch);
			}
		}
		return result;
	}
	
	StringBuffer getRev()
	{
		StringBuffer rev=new StringBuffer();
		for(int i=getLength()-1; i>=0; i--)
		{
			rev.append(data.charAt(i));
		}
		return rev;
	}
}
public class leng_uppertolow_rev
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		StringData str=new StringData(s);
		System.out.println("length of string is : " +str.getLength());
		System.out.println("string after conversion is : "+str.getLowerToUpper());
		System.out.println("reversed string is : "+str.getRev());
	}
}