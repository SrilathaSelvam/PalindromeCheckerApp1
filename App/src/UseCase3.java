// Class acts as a container for the Palindrome Checker application logic
public class UseCase3 {

    // Main Method - Entry point of the Java application
    // Static keyword allows JVM to invoke this method without creating an object
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     PALINDROME CHECKER APP      ");
        System.out.println("=================================");
        System.out.println("Use Case 3: Reverse String Using Loop");
        System.out.println("---------------------------------");

        // Original String (Data Structure: String)
        String original = "level";

        // String is immutable in Java, so we create a new String
        String reversed = "";

        // Loop (for loop) – iterate in reverse order
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);  // String Concatenation
        }

        // Compare original and reversed using equals()
        if (original.equals(reversed)) {
            System.out.println("The word \"" + original + "\" is a PALINDROME.");
        } else {
            System.out.println("The word \"" + original + "\" is NOT a palindrome.");
        }

        System.out.println("---------------------------------");
        System.out.println("Program Ended.");
    }
}
