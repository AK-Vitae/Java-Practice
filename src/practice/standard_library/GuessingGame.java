package practice.standard_library;

public class GuessingGame {
    public static void main(String[] args) {
        int num = (int) (Math.random()*1000)+1;
        StdOut.print("Guess a number between 1 and 1,000 ");
        int guess = 0;
        while (guess!=num){
            guess = StdIn.readInt();
            if (guess>num){
                StdOut.println("Too high");
            } else if (guess<num){
                StdOut.println("Too low");
            } else {
                StdOut.println("You win!");
            }
        }

    }
}
