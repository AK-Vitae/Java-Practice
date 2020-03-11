package practice.static_methods;

import practice.standard.StdIn;
import practice.standard.StdOut;

public class MultiplicationTable {

    public static void printTable(int a) {
        int count = 0;
        if (a<=1) {
            StdOut.println("Please enter an integer larger than 1");
        } else {
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= a; j++) {
                    System.out.print(i*j + " ");
                }
                StdOut.println();
            }
        }
    }

    public static void main(String[] args) {
        int x = StdIn.readInt();
        printTable(x);
    }
}
