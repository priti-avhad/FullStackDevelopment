import java.util.*;

public class ReverseWordWithoutSplit 
{
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String str=sc.nextLine();
        
        String result="";
        int end=str.length();

        for (int i=str.length()-1; i>=0; i--) 
		{
            if (str.charAt(i) == ' ') 
			{
                result+=str.substring(i+1, end) + " ";
                end = i; 
            }
        }
        result += str.substring(0, end); 
        
        System.out.println("Reversed sentence: " + result);
    }
}
