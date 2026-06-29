import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n--- String Operations ---");
            System.out.println("1. Find Length\n2. Reverse String\n3. Check Palindrome\n4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 3) {
                sc.nextLine();
                System.out.print("Enter string: ");
                String str = sc.nextLine();

                if (choice == 1) {
                    System.out.println("Length: " + str.length());
                } else if (choice == 2 || choice == 3) {
                    String rev = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        rev += str.charAt(i);
                    }
                    if (choice == 2) {
                        System.out.println("Reversed: " + rev);
                    } else {
                        if (str.equalsIgnoreCase(rev)) {
                            System.out.println("It is a palindrome");
                        } else {
                            System.out.println("It is not a palindrome");
                        }
                    }
                }
            }
        }
        sc.close();
    }
}
