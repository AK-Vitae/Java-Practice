package practice.arrays;

//Exchange the row and columns of a 2d array
public class Transposition {
    public static void main(String[] args) {
        int[][] a = {
                {99,85,98},
                {98,57,78},
                {92,77,76},
                {94,32,11}
        };
        System.out.println("Original 2d Array");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transposed 2d Array");
        int[][] b = new int[a[0].length][a.length];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j] = a[j][i];
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
