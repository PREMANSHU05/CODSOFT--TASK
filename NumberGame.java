import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int totalScore = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        while (playAgain) {
            int targetNumber = random.nextInt(100) + 1; 
            int attemptsLeft = 7; 
            boolean wonRound = false;
            System.out.println("\nI've picked a number between 1 and 100.");
            System.out.println("You have " + attemptsLeft + " attempts to guess it!");
            while (attemptsLeft > 0) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attemptsLeft--;
                if (userGuess == targetNumber) {
                    System.out.println("Correct! You guessed the number.");
                    wonRound = true;
                    totalScore++;
                    break;
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high! Attempts remaining: " + attemptsLeft);
                } else {
                    System.out.println("Too low! Attempts remaining: " + attemptsLeft);
                }
            }
            if (!wonRound) {
                System.out.println("Out of attempts! The number was: " + targetNumber);
            }
            System.out.print("\nDo you want to play another round? (yes/no): ");
            String response = scanner.next().toLowerCase();
            playAgain = response.equals("yes");
        }
        System.out.println("\nGame Over! Rounds won: " + totalScore);
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}