/*16.Write a JAVA program to search all occurrences of a character in given string
Enter the string
I/P: priti
I/P: Enter character to find
i
O/P: the characteriis not found at following indices
2*/

import java.util.*;

public class OccuranceSearch {
    public static void main(String x[]) {
        Scanner sc=new Scanner(System.in);

        // Input: Read the string from the user
        System.out.println("Enter the string:");
        String s=sc.nextLine();

        // Input: Read the character to find
        System.out.println("Enter character to find:");
        char ch=sc.next().charAt(0);

        // Find the first occurrence of the character
        int index=s.indexOf(ch);

        if (index==-1) 
			{
            System.out.println("The character '" + ch + "' is not found in the string.");
			} 
			else 
			{
            System.out.println("The character '" + ch + "' is found at the following indices:");

            while (index != -1) 
			{
                System.out.print(index + " ");  
                index = s.indexOf(ch, index + 1);
            }
            System.out.println();  // Move to the next line after printing all indices
        }
    }
}
