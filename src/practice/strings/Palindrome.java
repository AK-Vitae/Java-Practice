package practice.strings;

// A Palindrome is defined as a string that is the same both forwards and backwards.
// For example, "bob" and "otto" are both palindromes, while “hello” is not.
public class Palindrome {
    // Takes in a string and returns true if the string is a palindrome, false otherwise
    public static boolean palindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Same premise as method above, but is not case sensitive
    // For example, "Bob" and "OtTo" should now return true
    public static boolean palindrome2(String s) {
        String s2 = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s2.charAt(i) != s2.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Similar method as the two methods above but ignores spaces.
    // For example "no lemon, no melon" should now return true.
    public static boolean palindrome3(String s) {
        int len = s.length();
        String s2 = s.toLowerCase();
        String s3 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s2.charAt(i) != ' ') {
                s3 += s2.charAt(i);
            }
        }
        int len2 = s3.length();
        for (int i = 0; i < len2 / 2; i++) {
            if (s3.charAt(i) != s3.charAt(len2 - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // A recursive method which takes a String as a parameter, and returns true if the String is a palindrome.
    // For the purposes of this method, you may assume Strings with a length of 0 or 1 are palindromes.
    public static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        if (s.length() == 1) {
            return true;
        }
        char firstLetter = s.charAt(0);
        char lastLetter = s.charAt(s.length()-1);
        if (firstLetter != lastLetter) {
            return false;
        }
        String newString = s.substring(1, s.length()-1);
        return isPalindrome(newString);
    }
}
