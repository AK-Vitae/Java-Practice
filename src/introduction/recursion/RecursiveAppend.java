package introduction.recursion;

import introduction.standard.StdOut;

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes(String original, int n) {
        if (n == 0) {
            return original;
        }
        return original + appendNTimes(original, n-1);
    }

    public static void main(String[] args) {
        String test = "cat";
        int n = 2;
        StdOut.println(appendNTimes(test, n));
    }
}
