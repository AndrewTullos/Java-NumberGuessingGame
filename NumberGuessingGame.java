import java.util.InputMismatchException;
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
            int correctNum = random.nextInt(100) + 1;
            System.out.println("Input a number between 1-100: ");

            while (true) {
                String input = console.nextLine();

               if

            }

        }
    }
}
