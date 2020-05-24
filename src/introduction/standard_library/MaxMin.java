package introduction.standard_library;

import introduction.standard.StdIn;
import introduction.standard.StdOut;

//Read in integers from standard input and print out the maximum and minimum values.
public class MaxMin {
    public static void main(String[] args) {
        int max = StdIn.readInt();
        int min = max;
        while (!StdIn.isEmpty()) {
            int value = StdIn.readInt();
            if (value>max) {
                max = value;
            }
            if (value<min) {
                min = value;
            }
        }
        StdOut.println("max  = " + max + ", min = " + min);
    }
}
