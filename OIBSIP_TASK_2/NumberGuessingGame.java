import java.util.Objects;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void guessingNumberGame() {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = 1 + (int) (100 * Math.random());
        int maxAttempts = 4;

        System.out.println("I'm thinking of a number between 1 and 100...");
        System.out.println("You have to guess the number within " + maxAttempts + " trials.");

        for (int i = 1; i <= maxAttempts; i++) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Your guess is too low.");
                System.out.println("No. of attempts left = " + (maxAttempts - i));
            } else if (guess > randomNumber) {
                System.out.println("Your guess is too high.");
                System.out.println("No. of attempts left =" + (maxAttempts - i));
            } else {
                System.out.println("Congratulations! You Guessed the Correct Number.");
                return;
            }
        }

        System.out.println("You are out of moves.");
        System.out.println("The number was: " + randomNumber);
    }

    public static void main(String[] args) {
        guessingNumberGame();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to play again? Type 'y' for Yes and 'n' for No");
        String playAgain = scanner.next();

        if (playAgain.equalsIgnoreCase("y")) {
            guessingNumberGame();
        } else {
            System.out.println("Thank you for playing... Have a nice day!");
        }
    }
}
