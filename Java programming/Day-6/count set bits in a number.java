import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int count = 0;
        int temp = num;

        while (temp > 0) {
            count += (temp & 1);
            temp >>= 1;
        }

        System.out.println(count);
        scanner.close();
    }
}
