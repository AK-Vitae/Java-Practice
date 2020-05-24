package introduction.static_methods;

import introduction.standard.StdIn;
import introduction.standard.StdOut;

public class MaxOf3 {
    public static int max3(int a, int b, int c){
        int max = a;
        if (b>max){
            max = b;
        }
        if (c>max){
            max = c;
        }
        return max;
    }
    public static double max3(double a, double b, double c){
        double max = a;
        if (b>max){
            max = b;
        }
        if (c>max){
            max = c;
        }
        return max;
    }
    //test
    public static void main(String[] args) {
        int x = StdIn.readInt();
        int y = StdIn.readInt();
        int z = StdIn.readInt();
        StdOut.println(max3(x,y,z));
    }
}
