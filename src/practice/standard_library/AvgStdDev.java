package practice.standard_library;

import practice.standard.StdIn;

public class AvgStdDev {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        float[] arr = new float[n];
        //mean
        float sum = 0;
        for (int i = 0; i < n; i++) {
            float value = StdIn.readFloat();
            arr[i] = value;
            sum += value;
        }
        double mean = sum/n;
        //standard deviation
        double stdsum = 0.0;
        for (int j = 0; j<n; j++) {
            double diff = Math.pow(arr[j]-mean, 2);
            stdsum += diff;
        }
        double stdev = Math.sqrt((stdsum/(n-1)));
        System.out.println("The mean is: " + mean);
        System.out.println("The standard deviation is: " + stdev);
    }
}
