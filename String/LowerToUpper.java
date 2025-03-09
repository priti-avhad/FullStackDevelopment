import java.util.*;
public class LowerToUpper
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string from keyboard");
		String s=sc.nextLine();
		String newString="";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				char upper=(char)((int)s.charAt(i)-32);
				newString+=upper;
			}
			if(s.charAt(i)==' ')
			{
				newString+=' ';
			}
		}
		System.out.println(newString);
	}
}