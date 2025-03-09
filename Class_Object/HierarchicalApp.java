import java.util.*;
class CharArray
{
    char ch[];
	public void setCharArray(char ch[])
	{
		this.ch=ch;
	}	
}
class ConvertToUpper extends CharArray
{
	public void convertToUpper()
	{
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				ch[i]=(char)(ch[i]-32);
			}
		}
		System.out.println("Array in uppercase is :");
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				System.out.println(ch[i]+" ");
			}
		}
		System.out.println();
	}
}
class RevCharArr extends CharArray
{
	public void revCharArr()
	{
		for(int i=0; i<ch.length/2; i++)
		{
			char temp=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=temp;
		}
		System.out.println("Reverse array is :");
		for(int i=0; i<=ch.length; i++)
		{
			System.out.println(ch[i]+" ");
		}
		System.out.println();
	}
	
}
class FindCapitalLetters extends CharArray
{
	public void findUpperCaseLetter()
	{
		int count=0;
		System.out.println("Capital letters");
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				System.out.println(ch[i]+" ");
				count++;
			}
		}
		System.out.println("Number of capital letters"+count);
		
	}
}
public class HierarchicalApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array  ");
		int no=sc.nextInt();
		sc.nextLine();
		
		char ch[]=new char[no];
		System.out.println("Enter the characters");
		for(int i=0; i<no;i++)
		{
			ch[i]=sc.nextLine().charAt(0);
		}
		
		ConvertToUpper conv=new ConvertToUpper();
		RevCharArr rev=new RevCharArr();
		FindCapitalLetters find=new FindCapitalLetters();
		
		conv.setCharArray(ch);
		rev.setCharArray(ch);
		find.setCharArray(ch);
		
		conv.convertToUpper();
		rev.revCharArr();
		find.findUpperCaseLetter();
	}
}
