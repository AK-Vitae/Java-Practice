package practice.recursion;

public class Factorial {
    public static int factorial(int n)
    {
        if (n == 0)
            return 1;
        else
            return n * factorial(n-1);
    }
    public static void main(String[] args) {
        //Test
        int n = 8;
        System.out.println(factorial(n));
        int x = 1;
        System.out.println(factorial(x));
        int y = 12; //Last possible positive integer before overflow
        System.out.println(factorial(y));
        int z = 32;
        System.out.println(factorial(z));
        //Without generalizing the factorial function to the Gamma function, the values of int n < 0 are undefined.
        //If int n > 12, there will be overflow leading to an incorrect value. This is because the resulting factorial calculation will be greater than the max int data type value of (2^31)-1
        //Also, large values of n will result in a stack overflow error as the call stack pointer will exceed the stack bound due to the excessive recursive calls.
    }
}
