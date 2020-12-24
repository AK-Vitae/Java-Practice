package introduction.staticmethods;

import introduction.standard.StdIn;
import introduction.standard.StdOut;

public class GreatestCommonFactor {
    public static int gcf(int a, int b){
        int factor = 0;
        for (int i = 1; i <=a && i<=b; i++) {
            if (a%i==0 && b%i==0) {
                factor = i;
            }
        }
        return factor;
    }

    public static void main(String[] args) {
        int x = StdIn.readInt();
        int y = StdIn.readInt();
        StdOut.println(gcf(x,y));
    }
}
