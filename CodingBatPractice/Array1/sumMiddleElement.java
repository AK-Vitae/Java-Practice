//Gets the middle elements of 2 randomly generated(values 1-9) arrays of size n, and prints out their sum
public class sumMiddleElement{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n%2==0) {
            System.out.println("Please enter an odd number");
        } else {
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] =  (int) (Math.random()*9)+1;
            }
            for (int i = 0; i < n; i++) {
                b[i] =  ((int) Math.random()*9)+1;
            }
            System.out.println(a[n/2+1]+b[n/2+1]);   
        }
    }
}