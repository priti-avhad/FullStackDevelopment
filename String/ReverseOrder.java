/*13.Write a JAVA program to reverse order of words in a given string.
I/P : priti prariksha
O/P: pratiksha priti*/

import java.util.*;

public class ReverseOrder {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();

        // Split the string into words
        String words[] = s.split(" ");

        // Reverse the order of words
        String reversed = "";
        for (int i=words.length-1; i>= 0; i--) 
		{
            reversed =reversed + words[i]; 
            if (i!=0) 
			{ 
                reversed += " ";
            }
        }

        // Output the reversed string
        System.out.println("Reversed order of words:");
        System.out.println(reversed);

        sc.close();
    }
}
