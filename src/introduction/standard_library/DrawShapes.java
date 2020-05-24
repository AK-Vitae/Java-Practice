package introduction.standard_library;

import introduction.standard.StdDraw;

public class DrawShapes {
    public static void main(String[] args) {
        StdDraw.square(.2,.8,.1);
        StdDraw.filledSquare(.8,.8,.2);
        StdDraw.circle(.8,.2,.2);
        double[] xd = {.1,.2,.3,.2}; //x-coordinates of polygon
        double[] yd = {.2,.3,.2,.1}; //y-coordinates of polygon
        StdDraw.filledPolygon(xd,yd);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(.8,.8,"white text");
    }
}
