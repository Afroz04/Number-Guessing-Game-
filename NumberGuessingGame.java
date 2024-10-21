import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Create a random number generator
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;  // Generate random number between 1 and 100
        
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 5;  // Number of allowed attempts
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100. You have " + attempts + " attempts.");
        
        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt " + i + ": Enter your guess: ");
            guess = scanner.nextInt();
            
            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number!");
                break;
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Too low! Try again.");
            }
            
            if (i == attempts) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + randomNumber);
            }
        }
        
        scanner.close();
    }
}
