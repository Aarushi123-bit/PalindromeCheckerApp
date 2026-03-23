public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        // Application Title
        System.out.println("==================================");
        System.out.println("    Palindrome Checker App");
        System.out.println("==================================");

        System.out.println("UC3: Palindrome Check Using String Reverse");

        // Input string
        String input = "level";

        // Variable to store reversed string
        String reversed = "";

        // REQUIRED LOOP (as you mentioned)
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare strings
        if (input.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}

