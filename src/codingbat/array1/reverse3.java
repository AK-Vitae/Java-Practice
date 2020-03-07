package codingbat.array1;

//Reverse a command line array of 3
public class reverse3{
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int[] reverse = new int[]{c,b,a};
        for (int i = 0; i < reverse.length; i++) {
            System.out.println(reverse[i]);
        }

    }
}