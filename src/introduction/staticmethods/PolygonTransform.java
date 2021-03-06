package introduction.staticmethods;

import introduction.standard.StdDraw;
import introduction.standard.StdOut;

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array.
    // The given array is not mutated.
    public static double[] copy(double[] array) {
        double[] copy = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    // Scales the given polygon by the factor alpha.
    public static void scale(double[] x, double[] y, double alpha) {
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] * alpha;
        }

        for (int i = 0; i < y.length; i++) {
            y[i] = y[i] * alpha;
        }
    }

    // Translates the given polygon by (dx, dy).
    public static void translate(double[] x, double[] y, double dx, double dy) {
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] + dx;
        }

        for (int i = 0; i < y.length; i++) {
            y[i] = y[i] + dy;
        }
    }

    // Rotates the given polygon theta degrees counterclockwise, about the origin.
    public static void rotate(double[] x, double[] y, double theta) {
        double inRadians = Math.toRadians(theta);
        double temp;
        for (int i = 0; i < x.length; i++) {
            temp = x[i];
            x[i] = x[i] * Math.cos(inRadians) - y[i] * Math.sin(inRadians);
            y[i] = y[i] * Math.cos(inRadians) + temp * Math.sin(inRadians);
        }
    }

    // Tests each of the API methods by directly calling them.
    public static void main(String[] args) {
        StdDraw.setScale(-5.0, +5.0);
        double[] x = {0, 1, 1, 0};
        double[] y = {0, 0, 2, 1};
        //copy
        double[] b = copy(x);
        for (int i = 0; i < b.length; i++) {
            StdOut.println(b[i]);
        }
        //Scale
        double alpha = 2.0;
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x, y);
        scale(x, y, alpha);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);
        //Translate
        StdDraw.setScale(-5.0, +5.0);
        double[] c = {0, 1, 1, 0};
        double[] d = {0, 0, 2, 1};
        double dx = 2.0, dy = 1.0;
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(c, d);
        translate(c, d, dx, dy);
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.polygon(c, d);
        //Rotate
        StdDraw.setScale(-5.0, +5.0);
        double[] e = {0, 1, 1, 0};
        double[] f = {0, 0, 2, 1};
        double theta = 45.0;
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(e, f);
        rotate(e, f, theta);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.polygon(e, f);
    }
}
