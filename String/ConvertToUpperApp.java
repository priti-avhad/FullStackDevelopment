import java.util.*;
public class ConvertToUpperApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string value");
		String s=sc.nextLine();
		System.out.println("Enter existing string value");
		String eString=sc.nextLine();
		System.out.println("Enter string which we want to replace");
		String nString=sc.nextLine();
		int index=s.indexOf(eString);
		
		if(index!=-1)
		{
			String prevPor=s.substring(0,index);
			System.out.println(prevPor);
			String nextString=s.substring((index+eString.length()),s.length());
			System.out.println(nextString);
			s=prevPor+nString+nextString;
			System.out.println(s);
		}
		else
		{
			System.out.println(s);
		}
	}
}