//Generates 2 random arrays and sees if the first or last indices of both arrays are equal
public class commonEnd{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean a = false;
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 9);
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = (int)(Math.random() * 9);
        }

        if (arr[0]==arr2[0]||arr[n-1]==arr2[n-1]){
            a = true;
        }
        System.out.println(a);
    }
}