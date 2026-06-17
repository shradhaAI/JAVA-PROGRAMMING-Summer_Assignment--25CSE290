import java.util.Scanner;

public class RecursiveReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        int absNum = Math.abs(num);
        int reversed = reverse(absNum, 0);
        
        if (num < 0) {
            reversed = -reversed;
        }
        
        System.out.println(reversed);
        scanner.close();
    }

    public static int reverse(int n, int temp) {
        if (n == 0) {
            return temp;
        }
        return reverse(n / 10, temp * 10 + (n % 10));
    }
}
