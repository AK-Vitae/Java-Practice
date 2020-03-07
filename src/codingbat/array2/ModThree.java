package codingbat.array2;

//Print true if command line values have either 3 even or 3 odd values all next to each other
public class ModThree {
    public static void main(String[] args) {
        boolean a = false;
        if (args.length<3) {
            System.out.println("Please enter an array that is 3 elements or larger");
        } else {
            for (int i = 0; i < args.length-2; i++) {
                if ((Integer.parseInt(args[i])%2)==(Integer.parseInt(args[i+1])%2)&&(Integer.parseInt(args[i+1])%2)==(Integer.parseInt(args[i+2])%2)) {
                    a = true;
                }
            }
        }
        System.out.println(a);
    }
}