import java.util.Scanner;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();

        long maxPrime = -1;

        while (num % 2 == 0) {
            maxPrime = 2;
            num /= 2;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                maxPrime = i;
                num /= i;
            }
        }

        if (num > 2) {
            maxPrime = num;
        }

        System.out.println(maxPrime);
        scanner.close();
    }
}
