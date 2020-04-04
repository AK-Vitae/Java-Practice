package practice.arrays;
//Print out contents of boolean 2d array
//"*" for true and " " for false
public class TrueFalse {
    public static void main(String[] args) {
        boolean[][] test = new boolean[][]{
                {true, false, true},
                {false, true, false},
                {true, false, true}
        };
        for (int row = 0; row < test.length; row++) {
            for (int column = 0; column < test[row].length; column++) {
                if (test[row][column] == true) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
