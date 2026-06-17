import java.util.Scanner;

public class ArmstrongInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            int temp = i;
            int digits = 0;
            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            temp = i;
            int sum = 0;
            while (temp > 0) {
                int remainder = temp % 10;
                sum += Math.pow(remainder, digits);
                temp /= 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        scanner.close();
    }
}
