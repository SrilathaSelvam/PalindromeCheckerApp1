// Class acts as a container for the Palindrome Checker application logic
public class UseCase4 {

    // Main Method - Entry point of Java application
    // Static keyword allows JVM to invoke this method without creating an object
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     PALINDROME CHECKER APP      ");
        System.out.println("=================================");
        System.out.println("Use Case 4: Using char[] and Two-Pointer Technique");
        System.out.println("---------------------------------");

        // Original String
        String word = "radar";

        // Convert String to Character Array (Data Structure: char[])
        char[] characters = word.toCharArray();

        // Two-Pointer Technique
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            // Array Indexing comparison
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display Result
        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a PALINDROME.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a palindrome.");
        }

        System.out.println("---------------------------------");
        System.out.println("Program Ended.");
    }
}
