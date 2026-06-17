import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num == 0) {
            System.out.println(0);
        } else {
            StringBuilder binary = new StringBuilder();
            int temp = num;
            while (temp > 0) {
                binary.insert(0, temp % 2);
                temp /= 2;
            }
            System.out.println(binary.toString());
        }
        scanner.close();
    }
}

