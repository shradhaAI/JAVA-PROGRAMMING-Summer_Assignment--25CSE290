import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        int guess = 0;
        
        System.out.println("Guess a number between 1 and 100:");
        
        while (guess != targetNumber) {
            guess = sc.nextInt();
            
            if (guess > targetNumber) {
                System.out.println("Too high! Try again:");
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try again:");
            } else {
                System.out.println("Correct! You win!");
            }
        }
        sc.close();
    }
}
