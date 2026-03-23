public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        // Application Title
        System.out.println("==================================");
        System.out.println("    Palindrome Checker App");
        System.out.println("==================================");

        System.out.println("UC2: Print a Hardcoded Palindrome Result");

        // Hardcoded string
        String str = "madam";

        // Reverse string
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Check palindrome
        if (str.equals(rev)) {
            System.out.println("The string \"" + str + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + str + "\" is NOT a Palindrome.");
        }
    }
}

