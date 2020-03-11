package practice.standard_library;

import practice.standard.StdIn;
import practice.standard.StdOut;
//Return the number of lines, words, and characters
public class WordCount
{
    public static void main(String [] args){
        int words = 0;
        int lines = 0;
        int characters = 0;
        while (!StdIn.isEmpty()) {
            String line = StdIn.readLine();
            lines++;
            String[] lineWords = line.split("\\s+");
            words += lineWords.length;

            for (int i = 0; i < lineWords.length; i++) {
                String word = lineWords[i];
                characters += word.length();
            }
        }
        StdOut.println("There are " + lines + " lines");
        StdOut.println("There are " + words + " words");
        StdOut.println("There are " + characters + " characters");
    }
}