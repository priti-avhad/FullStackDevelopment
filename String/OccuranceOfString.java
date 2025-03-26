import java.util.*;
public class OccuranceOfString
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		int maxCount=0;
		char maxChar=' ';
		char ch[]=str.toCharArray();
		
		for(int i=0; i<ch.length; i++)
		{
			int count=0;
			for(int j=0; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			
			if(str.indexOf(ch[i])==i)
			{
				System.out.println(ch[i]+"==="+count);
				
				if(count > maxCount)
				{
					maxCount=count;
					maxChar=ch[i];
				}
			}
		}
		System.out.println("The max count is :"+maxCount);
		System.out.println("The max char count is :"+maxChar);
	}
}