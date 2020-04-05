package practice.recursion;

//pyramid and upsideDownPyramid, both take one integer as a parameter, and print triangles of the given height.
public class StarPyramid {
    public static void printRow(int nStars){
        if(nStars == 0){
            System.out.println(); // Force a new line
            return; // no more recursion
        }
        System.out.print("*");
        printRow(nStars - 1);
    }

    public static void pyramid(int nStars) {
        if (nStars == 0) return;
        pyramid(nStars-1);
        printRow(nStars);
    }

    public static void upsideDownPyramid(int nStars) {
        if (nStars == 0) return;
        printRow(nStars);
        upsideDownPyramid(nStars - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        pyramid(n);
        System.out.println();
        upsideDownPyramid(n);
    }
}
