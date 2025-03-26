import java.util.*;
public class FirstNonRepeatCharFind
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element");
		String str=sc.nextLine(); 
		
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if(str.indexOf(ch)==str.lastIndexOf(ch))
			{
				System.out.println("first non repeted element :"+ch);
				return;
			}
		}
		System.out.println("No element repeat");
	}
}