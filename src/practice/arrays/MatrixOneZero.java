package practice.arrays;
//takes a 2D array (this 2D array should be randomly filled with 1s and 0s), and prints:
//How many 1's are in the 2D array. 
//How many 0's are in the 2D array.

public class MatrixOneZero{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int[][] arr = new int[n][m];
        int one = 0;
        int zero = 0;
        //Fill array randomly with 1s and 0s
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (int) Math.round(Math.random());
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j]==1) {
                    one++;
                } else {
                    zero++;
                }
            }
        }
        System.out.println("Number of 1s: "+one);
        System.out.println("Number of 0s: "+zero);
    }
}