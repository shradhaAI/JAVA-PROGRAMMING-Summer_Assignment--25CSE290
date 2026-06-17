import java.util.Scanner;

public class CharacterPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            for (int k = 1; k <= i; k++) {
                System.out.print(ch);
                ch++;
            }
            ch -= 2;
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }
        scanner.close();
    }
}
