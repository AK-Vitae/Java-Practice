package introduction.conditionalsloops;

public class FizzBuzz{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i <= n; i++) {
            if (i%5==0 && i%3==0) {
                System.out.println("ak.conditionals.loops.FizzBuzz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}