/*Q3. Java String Program to Replace a Character at a Specific Index
Input: str ="JAVA IS FOOD Programming " , index = 8 , ch = 'G'
Output: "JAVA IS GOOD Programming"*/


import java.util.*;

class Replace
{
	private String s;
	public void setString(String s)
	{
		this.s=s;
	}
	
	public void insertCharIndex(int index, char ch)
	{
		s=s.substring(0,index)+ch+s.substring(index+1);
	}
	
	public String getString()
	{
		return s;
	}
	
}

public class ReplaceString
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		Replace rep=new Replace();
		
		System.out.println("Enter the string");
		String input=sc.nextLine();
		rep.setString(input);
		
		// Input the index and the character to replace
		System.out.println("Enter index where character need to replace");
		int index=sc.nextInt();
		
		//Enter character to insert
		System.out.println("Enter character to insert");
		char ch=sc.next().charAt(0);
		
		 // Replace the character and display the result
		rep.insertCharIndex(index,ch);
		System.out.println("modified string is : "+rep.getString());
	}
}