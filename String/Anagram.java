import java.util.*;

public class Anagram {
    public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter two strings");
			String str1=sc.nextLine();
			String str2=sc.nextLine();
			
			boolean result=checkAnagramStrings(str1,str2);
			if(result)
			{
				System.out.println("The string is anagram");
			}
			else
			{
				System.out.println("String is not anagram");
			}
		}
		
		public static boolean checkAnagramStrings(String str1,String str2)
	{
		str1=str1.replaceAll("\\s", "").toLowerCase();
		str2=str2.replaceAll("\\s", "").toLowerCase();
		
		if(str1.length()!=str2.length())
		{
			return false;
		}
		
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		
		 for (int i=0; i<ch1.length; i++) 
			 {
            for (int j=i+1; j<ch1.length; j++) 
				{
                 if(ch1[i] > ch1[j]) 
					{
                      char temp=ch1[i];
                      ch1[i]=ch1[j];
                      ch1[j]=temp;
                    }
                  if(ch2[i] > ch2[j]) {
                    char temp=ch2[i];
                    ch2[i]=ch2[j];
                    ch2[j]=temp;
                }
            }
        }
		for(int i=0; i<ch1.length; i++)
		{
			if(ch1[i]!=ch2[i])
			{
				return false;
			}
		}
		return true;
	}
}
