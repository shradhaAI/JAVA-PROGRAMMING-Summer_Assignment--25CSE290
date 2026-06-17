import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println(0);
        } else if (n == 2) {
            System.out.println(1);
        } else {
            int first = 0;
            int second = 1;
            int current = 0;
            for (int i = 3; i <= n; i++) {
                current = first + second;
                first = second;
                second = current;
            }
            System.out.println(current);
        }
        scanner.close();
    }
}
