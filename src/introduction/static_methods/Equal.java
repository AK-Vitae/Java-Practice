package introduction.static_methods;

public class Equal {
    //Takes two int arrays and returns true if the arrays are the same length, and have the same corresponding values
    public static boolean eq(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 4};
        System.out.println(eq(arr1, arr2));
    }
}
