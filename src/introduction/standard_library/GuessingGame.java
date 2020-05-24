package introduction.standard_library;
import introduction.standard.StdIn;
import introduction.standard.StdOut;
// Write a program which implements a Guessing Game.
// Generate a random int between 1 to 1,000, and prompt the user to try to guess what the number is.
// As the user enters numbers, the program should tell whether the guess is too high or too low.
// Once the user guesses correctly, have the program output "You win!"
// All input and output must be done using StdIn and StdOut libraries.
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
