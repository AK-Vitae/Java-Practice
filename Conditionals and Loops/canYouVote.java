public class canYouVote{
    public static void main(String[] args) {
        double age = Double.parseDouble(args[0]);
        if (age>=18.0) {
            System.out.println("You are allowed to vote");
        } else {
            System.out.println("You are not allowed to vote");
        }

    }
}