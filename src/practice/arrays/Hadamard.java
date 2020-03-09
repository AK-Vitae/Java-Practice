package practice.arrays;

import practice.standard.StdIn;
import practice.standard.StdOut;

// Prints the Hadamard matrix of order n. Assumes n is a power of 2.
public class Hadamard {
    public static void main(String[] args) {
        int n = StdIn.readInt();
        boolean[][] hadamard = new boolean[n][n];
        hadamard[0][0] = true;
        for (int k = 1; k < n; k += k) {
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    hadamard[i+k][j]   =  hadamard[i][j];
                    hadamard[i][j+k]   =  hadamard[i][j];
                    hadamard[i+k][j+k] = !hadamard[i][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (hadamard[i][j]) {
                    StdOut.print("T ");
                } else {
                    StdOut.print("F ");
                }
            }
            StdOut.println();
        }
    }
}
