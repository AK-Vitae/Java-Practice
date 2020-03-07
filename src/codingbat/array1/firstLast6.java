package codingbat.array1;

//Checks array to see if the first or last indices are 6
public class firstLast6{
    public static void main(String[] args) {
        boolean a = false;
        if (Integer.parseInt(args[0])==6||Integer.parseInt(args[args.length-1])==6) {
            a = true;
        }
        System.out.println(a);
    }
}