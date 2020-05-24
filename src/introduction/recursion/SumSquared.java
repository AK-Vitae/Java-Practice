package introduction.recursion;

import introduction.standard.StdOut;

//Dependencies: StdOut
public class SumSquared {
    //Takes an int array and returns a new int array containing everything except the original array’s first element
    public static int[] rest(int[] arr) {
        int[] b = new int[arr.length - 1];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            b[index] = arr[i];
            index++;
        }
        return b;
    }

    //Calculates the sum of the squares of elements in an array
    public static int sumSquared(int[] arr) {
        if (arr.length <= 0) {
            return 0;
        } else {
            return (int) Math.pow(arr[0], 2) + sumSquared(rest(arr));
        }
    }

    public static void main(String[] args) {
        //Test
        int[] a = {2, 4, 6};
        int[] b = {2, 4};
        int[] c = {2};
        int[] d = {};
        StdOut.println(sumSquared(a));
        StdOut.println(sumSquared(b));
        StdOut.println(sumSquared(c));
        StdOut.println(sumSquared(d));
    }
}
