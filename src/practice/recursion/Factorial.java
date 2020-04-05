package practice.recursion;

public class Factorial {
    public static long factorial(int n) {
        //base case
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        //Test
        int n = 8;
        System.out.println(factorial(n));
    }
}
