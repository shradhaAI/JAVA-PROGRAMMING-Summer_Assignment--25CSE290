import java.util.Scanner;

public class MiniLibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] bookTitles = new String[100];
        boolean[] isIssued = new boolean[100];
        int count = 0;
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n1. Add Book\n2. Issue Book\n3. Return Book\n4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Book Title: ");
                bookTitles[count] = sc.nextLine();
                isIssued[count] = false;
                count++;
                System.out.println("Book added successfully!");
            } else if (choice == 2) {
                System.out.print("Enter Book Title to Issue: ");
                String searchTitle = sc.nextLine();
                boolean found = false;
                for (int i = 0; i < count; i++) {
                    if (bookTitles[i].equalsIgnoreCase(searchTitle)) {
                        found = true;
                        if (!isIssued[i]) {
                            isIssued[i] = true;
                            System.out.println("Book issued successfully!");
                        } else {
                            System.out.println("Book is already issued!");
                        }
                        break;
                    }
                }
                if (!found) System.out.println("Book not found!");
            } else if (choice == 3) {
                System.out.print("Enter Book Title to Return: ");
                String searchTitle = sc.nextLine();
                boolean found = false;
                for (int i = 0; i < count; i++) {
                    if (bookTitles[i].equalsIgnoreCase(searchTitle)) {
                        found = true;
                        if (isIssued[i]) {
                            isIssued[i] = false;
                            System.out.println("Book returned successfully!");
                        } else {
                            System.out.println("Book was not issued!");
                        }
                        break;
                    }
                }
                if (!found) System.out.println("Book not found!");
            }
        }
        sc.close();
    }
}
