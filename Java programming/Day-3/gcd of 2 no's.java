import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        
        int a = n1;
        int b = n2;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + a);
        scanner.close();
    }
}
