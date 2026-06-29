import java.util.Scanner;

class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

public class ContactManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contact[] directory = new Contact[100];
        int count = 0;
        int choice = 0;

        while (choice != 3) {
            System.out.println("\n1. Add Contact\n2. View Contacts\n3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Phone Number: ");
                String phone = sc.nextLine();
                directory[count++] = new Contact(name, phone);
                System.out.println("Contact saved successfully!");
            } else if (choice == 2) {
                System.out.println("\n--- Contacts List ---");
                for (int i = 0; i < count; i++) {
                    System.out.println("Name: " + directory[i].name + " | Phone: " + directory[i].phone);
                }
            }
        }
        sc.close();
    }
}
