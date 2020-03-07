package codingbat.array2;

//Return the number of even ints in the given array.
public class countEvens{
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            if (Integer.parseInt(args[i])%2==0) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}