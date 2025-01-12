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

        while (true) {
            int correctNum = (int) ((Math.random() * 100) + 1);
            System.out.println("Input a number between 1-100: ");
            int input = console.nextInt();

            try {
                if (input == correctNum) {
                    System.out.println("Hurray, good guess you win!");
                } else if (input > correctNum) {
                    System.out.println("Too high, guess again.");
                } else {
                    System.out.println("Too low, guess again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input: Please enter a positive integer between 1-100.");
            }

        }
    }
}