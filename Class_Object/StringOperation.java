import java.util.*;

// Abstract class
abstract class StringOperation {
    abstract void performOperation(String input);
}

// Convert string to uppercase manually using only String
class ConvertToUpper extends StringOperation {
    @Override
    public void performOperation(String input) {
        String upper = ""; // Initialize an empty string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                upper += (char) (c - 32); // Convert lowercase to uppercase
            } else {
                upper += c; // Keep non-lowercase characters as is
            }
        }
        System.out.println("Uppercase String: " + upper);
    }
}

// Find the most repetitive character manually using only String
class MaxRepetativeChar extends StringOperation {
    @Override
    public void performOperation(String input) {
        int maxCount = 0;
        char maxChar = '\0';

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int count = 0;

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == currentChar) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = currentChar;
            }
        }

        System.out.println("Most Repetitive Character: " + maxChar + " (repeated " + maxCount + " times)");
    }
}

// Reverse the characters in each word manually using only String
class WordReverse extends StringOperation {
    @Override
    public void performOperation(String input) {
        String[] words = input.split(" ");
        String reversed = ""; // Initialize an empty string

        for (String word : words) {
            String reversedWord = ""; // Initialize an empty string for each word
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            reversed += reversedWord + " "; // Add the reversed word to the final result
        }

        System.out.println("Reversed Words: " + reversed.trim());
    }
}

public class StringOperation1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Instantiate each class and perform its specific operation
        StringOperation upperCaseConverter = new ConvertToUpper();
        StringOperation maxRepetitiveCharFinder = new MaxRepetativeChar();
        StringOperation wordReverser = new WordReverse();

        System.out.println("\nPerforming Operations:");
        upperCaseConverter.performOperation(input);
        maxRepetitiveCharFinder.performOperation(input);
        wordReverser.performOperation(input);

        sc.close();
    }
}
