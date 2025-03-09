import java.util.*;
public class VowelsConsonant
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		
		int vowels=0;
		int consonants=0;
		
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
				
			{
				if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'|| ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u')
				{
					vowels++;
				}
				else
				
					consonants++;
				}
			}
			System.out.println("voewls are"+vowels);
		System.out.println("consonants are"+consonants);
		}
	}
