package practice.arrays;

//Compute the Euclidean Distance using two vectors of same length
public class EuclideanDistance {
    public static void main(String[] args) {
        double[] arr1 = {3.0, 5.0, 7.8, 2.3};
        double[] arr2 = {1.2, 9.3, 3.2, 4.6};
        double sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += Math.pow(arr1[i] - arr2[i], 2);
        }
        System.out.println(Math.sqrt(sum));
    }
}
