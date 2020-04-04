package practice.standard_library;

import practice.standard.StdIn;

public class FilterConsecDuplicates {
    public static void main(String[] args) {
        int prev = StdIn.readInt();
        while (!StdIn.isEmpty()) {
            int curr = StdIn.readInt();
            if (curr != prev) {
                System.out.print(prev + " ");
                prev = curr;
            }
        }
        System.out.println(prev);
    }
}
