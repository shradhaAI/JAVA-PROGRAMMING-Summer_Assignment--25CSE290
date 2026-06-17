import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        int product = 1;
        int temp = Math.abs(num);
        
        if (temp == 0) {
            product = 0;
        } else {
            while (temp > 0) {
                product *= (temp % 10);
                temp /= 10;
            }
        }
        
        System.out.println("The product of digits in " + num + " is: " + product);
        scanner.close();
    }
}
