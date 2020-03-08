package practice.standard_library;

import practice.standard.StdIn;
import practice.standard.StdOut;
//Return the number of lines, words, and characters
public class WordCount {
    public static void main(String[] args) {
        int wordCount = 0;
        int charCount = 0;
        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            wordCount++;
            charCount+= word.length();
        }
        StdOut.println("number of words  = " + wordCount);
        StdOut.println("number of characters  = " + charCount);
    }
}
