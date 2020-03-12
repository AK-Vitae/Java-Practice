package practice.static_methods;

import practice.standard.StdIn;
import practice.standard.StdOut;

public class BasicMethods {
    //Write a method which takes in 2 doubles and returns their average.
    public static double average(double a, double b) {
        return (a+b)/2;
    }
    //Array form of previous method
    public static double average(double[] a) {
        double sum = 0;
        for (int i = 0; i <a.length ; i++) {
            sum += a[i];
        }
        return sum/a.length;
    }
    //Write a method which takes in the user's name and age and returns true if they are an adult.
    public static boolean areYouAnAdult(String a,int b) {
        if (b>=18) {
            return true;
        } else {
            return false;
        }
    }
    //Write a method which takes in the user's Full name and returns their name as "last, first".
    public static void lastFirst(String a, String b){
        StdOut.println(b+", "+a);
    }

    //Array form of previous method: Input can include middle names
    public static void lastFirst(String[] a) {
        String lastName = a[a.length-1];
        String firstName = a[0];
        for (int i = 1; i < a.length-1; i++) {
            firstName += " " + a[i];
        }
//        StringBuilder firstName = new StringBuilder(a[0]);
////        for (int i = 1; i < a.length-1; i++) {
////            firstName.append(" ").append(a[i]);
////        }
        StdOut.println(lastName+", "+firstName);
    }

    public static void main(String[] args){
        StdOut.println("Please enter 2 double values");
        double a = StdIn.readDouble();
        double b = StdIn.readDouble();
        StdOut.println(average(a,b));
        StdOut.println("Please enter your first name");
        String f = StdIn.readString();
        StdOut.println("Please enter your age");
        int age = StdIn.readInt();
        StdOut.println(areYouAnAdult(f,age));
        StdOut.println("Please enter your last name");
        String l = StdIn.readString();
        lastFirst(f,l);
    }
}
