package practice.arrays;
// Takes an array of integers as a parameter, and prints the average

public class ArrayAvg{
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum+= Integer.parseInt(args[i]);
        }
        double avg = sum/args.length;
        System.out.println(avg);
    }
}