package practice.static_methods;

import practice.standard.StdIn;
import practice.standard.StdOut;

//Dependencies: StdIn and StdOut
//Assumptions: ALL seats in the classroom will be filled. The file students.txt has enough names in it to fill the classroom.
public class Classroom {
    //Fills the parameter array a with Strings read from the file students.txt.
    public static void fillLine(String[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = StdIn.readString();
        }
    }

    //Prints the student names
    public static void printLine(String[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    //Fills the 2-D array, room in row-major order, with the student names in studentLine from the front of the line to the back of the line.
    public static void fillRoom(String[] a, String[][] rm) {
        int index = 0;
        for (int i = 0; i < rm.length; i++) {
            for (int j = 0; j < rm[0].length; j++) {
                rm[i][j] = a[index];
                index++;
            }
        }
    }

    //Prints the seating assignments in the classroom (print the contents of the 2-D array from the font of the room to the back of the room
    public static void printRoom(String[][] rm) {
        for (int i = 0; i < rm.length; i++) {
            for (int j = 0; j < rm[0].length; j++) {
                StdOut.print(rm[i][j] + " ");
            }
            StdOut.println();
        }
    }

    //Fills studentLine with student names from the 2-D array room.
    //The students are put into studentLine by traversing the 2-D array in column major order.
    public static void fillLineByCol(String[][] rm, String[] a) {
        int index = 0;
        for (int i = 0; i < rm[0].length; i++) {
            for (int j = 0; j < rm.length; j++) {
                a[index] = rm[j][i];
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int rows = Integer.parseInt(args[0]);
        int cols = Integer.parseInt(args[1]);
        int classSize = rows * cols;
        String[] studentLine = new String[classSize];
        String[][] room = new String[rows][cols];
        //Test
        fillLine(studentLine);
        printLine(studentLine);
        fillRoom(studentLine, room);
        printRoom(room);
        fillLineByCol(room, studentLine);
        printLine(studentLine);
    }
}

