package practice.recursion;
//Takes an integer, n, as a parameter, and computes the nth term of the sequence
public class RecursiveFibonacci {
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        //Test
        int n = 7;
        System.out.println(fibonacci(n));
    }
}
