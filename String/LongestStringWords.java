import java.util.*;
public class LongestStringWords
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		
		String[] word=str.split(" ");
		String longWord="";
		
		for(int i=0; i<word.length; i++)
		{
			if(word[i].length() > longWord.length())
			{
				longWord=word[i];
			}
		}
		System.out.println("Longest word :"+longWord);
	}
}