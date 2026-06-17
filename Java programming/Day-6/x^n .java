import java.util.Scanner;

public class PowerCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();

        double result = 1.0;
        long power = n;

        if (power < 0) {
            power = -power;
        }

        while (power > 0) {
            if (power % 2 == 1) {
                result *= x;
            }
            x *= x;
            power /= 2;
        }

        if (n < 0) {
            result = 1.0 / result;
        }

        System.out.println(result);
        scanner.close();
    }
}
