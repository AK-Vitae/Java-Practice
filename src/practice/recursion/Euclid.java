package practice.recursion;

import practice.standard.StdOut;

//Reads two command-line arguments p and q and computes the greatest common divisor of p and q using Euclid's algorithm.
public class Euclid {
    public static int gcd(int p, int q) {
        if (q==0){
            return p;
        }
        return gcd(q,p%q);
    }

    public static void main(String[] args) {
        //Test
        int p = 102;
        int q = 68;
        int d  = gcd(p, q);
        StdOut.println("gcd(" + p + ", " + q + ") = " + d);
    }
}
