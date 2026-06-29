import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        
        System.out.println("Q1. What is the size of an int data type in Java?");
        System.out.println("1. 2 bytes\n2. 4 bytes\n3. 8 bytes");
        System.out.print("Your answer (1-3): ");
        int ans1 = sc.nextInt();
        if (ans1 == 2) {
            score++;
        }
        
        System.out.println("\nQ2. Which keyword is used to inherit a class in Java?");
        System.out.println("1. implements\n2. imports\n3. extends");
        System.out.print("Your answer (1-3): ");
        int ans2 = sc.nextInt();
        if (ans2 == 3) {
            score++;
        }
        
        System.out.println("\nQuiz Over!");
        System.out.println("Your Final Score: " + score + "/2");
        sc.close();
    }
}
