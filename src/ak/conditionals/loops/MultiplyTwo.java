package ak.conditionals.loops;

public class MultiplyTwo{
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int product = 0;
        for (int i = 0; i < b; i++) {
            product+=a;
        }
        System.out.println(product);
    }
}