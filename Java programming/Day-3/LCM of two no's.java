import java.util.Scanner;

public class FindLCM {
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
        
        int gcd = a;
        int lcm = (n1 * n2) / gcd;
        
        System.out.println("LCM of " + n1 + " and " + n2 + " is: " + lcm);
        scanner.close();
    }
}

