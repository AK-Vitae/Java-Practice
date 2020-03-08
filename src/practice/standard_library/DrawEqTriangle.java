package practice.standard_library;
//Write a program that uses StdDraw to draw an equilateral triangle with sides of length 1.
public class DrawEqTriangle {
    public static void main(String[] args) {
        double height = Math.sqrt(3.0)/2.0;
        StdDraw.line(0.0,0.0,1.0,0.0);
        StdDraw.line(1.0,0.0,0.5,height);
        StdDraw.line(0.5,height,0.0,0.0);
    }
}
