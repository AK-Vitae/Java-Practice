public class commonEnd{
    public static void main(String[] args, String[] args2) {
        boolean a = false;
        if (Integer.parseInt(args[0])==Integer.parseInt(args2[0])||Integer.parseInt(args[args.length-1])==Integer.parseInt(args2[args2.length-1])){
            a = true;
        }
        System.out.println(a);
    }
}