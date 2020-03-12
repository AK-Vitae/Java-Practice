package practice.static_methods;

import practice.standard.StdIn;
import practice.standard.StdOut;

public class MultiplicationTable {

    public static void printTable1(int a) {
        if (a<=1) {
            StdOut.println("Please enter an integer larger than 1");
        } else {
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= a; j++) {
                    StdOut.print(i*j + " ");
                }
                StdOut.println();
            }
        }
    }

    public static int[][] printTable2(int a) {
        int[][] table = new int[a][a];
        for (int row = 0; row <table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                table[row][col] = (row+1)*(col+1);
            }

        }
        return table;
    }

    public static void main(String[] args) {
        int x = StdIn.readInt();
        printTable1(x);
        StdOut.println();
        int[][] test = printTable2(x);
        for (int row = 0; row < test.length ; row++)
        {
            for (int column = 0; column < test[row].length; column++)
            {
                StdOut.printf("%2d ",test[row][column]);
            }
            StdOut.println();
        }
    }
}
