
public class UseCase2 {

    // Main Method - Entry point of the Java application
    // Static keyword allows JVM to invoke this method without creating an object
    public static void main(String[] args) {

        // Program Starts
        System.out.println("=================================");
        System.out.println("     PALINDROME CHECKER APP      ");
        System.out.println("=================================");
        System.out.println("Use Case 2: Hardcoded Palindrome Check");
        System.out.println("---------------------------------");

        // Hardcoded String (String Literal stored in String constant pool)
        String word = "madam";

        // Reverse the string manually using String methods
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }

        // Conditional Statement (if-else)
        if (word.equals(reversedWord)) {
            System.out.println("The word \"" + word + "\" is a PALINDROME.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a palindrome.");
        }

        // Program Exits
        System.out.println("---------------------------------");
        System.out.println("Program Ended.");
    }
}
