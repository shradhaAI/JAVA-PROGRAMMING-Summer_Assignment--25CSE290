import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long binary = scanner.nextLong();

        long decimal = 0;
        long base = 1;
        long temp = binary;

        while (temp > 0) {
            long lastDigit = temp % 10;
            temp /= 10;
            decimal += lastDigit * base;
            base *= 2;
        }

        System.out.println(decimal);
        scanner.close();
    }
}

