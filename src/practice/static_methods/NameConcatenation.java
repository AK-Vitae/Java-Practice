package practice.static_methods;

import practice.standard.StdOut;

//Dependency: StdOut
public class NameConcatenation {
    //Creates a String array containing permutations of strings from two String array parameters.
    public static String[] makeNames(String[] array1, String[] array2) {
        if (array1.length == 0) {
            return array2;
        }
        if (array2.length == 0) {
            return array1;
        }
        String[] firstMiddle = new String[array1.length * array2.length];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                firstMiddle[index] = array1[i] + " " + array2[j];
                index++;
            }
        }
        return firstMiddle;
    }

    //Creates and returns a String array of new names based on the method’s two parameter arrays, array1 and array2
    public static String[] makeNames(String[] array1, String[] array2, String[] array3) {
        String[] firstMiddle = makeNames(array1, array2);
        return makeNames(firstMiddle, array3);
    }

    //Prints out one String per line
    public static void print(String[] array) {
        for (int i = 0; i < array.length; i++) {
            StdOut.println(array[i]);
        }
    }

    public static void main(String[] args) {
        //Test
        String[] first = {"David", "Mike", "Katie", "Lucy"};
        String[] middle = {"A", "B", "C", "D", "E"};
        String[] last = {"Green", "Wong"};
        String[] fEmpty = {};
        String[] mEmpty = {};
        String[] lEmpty = {};
        String[] names = makeNames(first, middle);
        print(names);
        String[] names2 = makeNames(fEmpty, middle);
        print(names2);
        String[] names3 = makeNames(first, mEmpty);
        print(names3);
        String[] names5 = makeNames(first, middle, last);
        print(names5);
        String[] names6 = makeNames(first, mEmpty, last);
        print(names6);
        String[] names7 = makeNames(fEmpty, middle, lEmpty);
        print(names7);

    }
}
