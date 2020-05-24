package introduction.arrays;
//Takes two randomly filled integer arrays, a and b, and creates an array which is a concatenated with b.
//Read two arguments from the command line to specify the size of array a and b respectively

public class ArrayConcatenation{
    public static void main(String[] args) {
        int[] a = new int[Integer.parseInt(args[0])];
        int[] b = new int[Integer.parseInt(args[1])];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * 9 + 0);
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = (int)(Math.random() * 9 + 0);
        }
        int[] arr = new int[a.length+b.length];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];
            index++;
        }
        for (int i = 0; i < b.length; i++) {
            arr[index] = b[i];
            index++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}