import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        NumberGuessingGame game = new NumberGuessingGame();
        game.start();
    }

    private void start() {
        Scanner console = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have picked a number between 1 and 100. Can you guess what it is?");

        boolean gameOver = false;
        int correctNum = random.nextInt(100) + 1; // Random number between 1 and 100
        int attempts = 0;

        while (!gameOver) {
            System.out.print("Enter your guess: ");

            try {
                int input = console.nextInt();
                attempts++;

                if (input < 1 || input > 100) {
                    System.out.println("Please guess a number between 1 and 100.");
                } else if (input == correctNum) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    gameOver = true;
                } else if (input > correctNum) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input: Please enter a valid integer.");
                console.nextLine(); // Clear the invalid input
            }
        }

        System.out.println("Thanks for playing!");
        console.close();
    }
}
