import java.util.Scanner;

public class Rev_word 
	{
    public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a sentence: ");
			String s=sc.nextLine();
        
			String reversed=reverseWords(s);
			System.out.println("Reversed sentence: " + reversed);
		}

    public static String reverseWords(String s) 
		{
			String[] words=s.split(" ");
			StringBuilder reversed=new StringBuilder();
		    for(int i=words.length-1; i>=0; i--) 
			{
				reversed.append(words[i]);
				if(i!=0) 
				{
					reversed.append(" ");
				}
			}
        return reversed.toString();
    }
}
