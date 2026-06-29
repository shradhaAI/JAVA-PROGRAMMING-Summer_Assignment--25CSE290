import java.util.Scanner;

class Book {
    int id;
    String title;
    boolean isIssued;

    Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.isIssued = false;
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[100];
        int count = 0;
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n1. Add Book\n2. Issue Book\n3. View Books\n4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Book Title: ");
                String title = sc.nextLine();
                books[count++] = new Book(id, title);
                System.out.println("Book added successfully!");
            } else if (choice == 2) {
                System.out.print("Enter Book ID to issue: ");
                int issueId = sc.nextInt();
                boolean found = false;
                for (int i = 0; i < count; i++) {
                    if (books[i].id == issueId) {
                        found = true;
                        if (!books[i].isIssued) {
                            books[i].isIssued = true;
                            System.out.println("Book issued successfully!");
                        } else {
                            System.out.println("Book is already issued!");
                        }
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Book not found!");
                }
            } else if (choice == 3) {
                System.out.println("\n--- Library Books ---");
                for (int i = 0; i < count; i++) {
                    String status = books[i].isIssued ? "Issued" : "Available";
                    System.out.println("ID: " + books[i].id + ", Title: " + books[i].title + " [" + status + "]");
                }
            }
        }
        sc.close();
    }
}
