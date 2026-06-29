import java.util.Scanner;

class Item {
    int id;
    String name;
    int quantity;

    Item(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
}

public class InventoryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] inventory = new Item[100];
        int count = 0;
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. Add Item\n2. Update Quantity\n3. View Inventory\n4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Item ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Item Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Quantity: ");
                int qty = sc.nextInt();
                inventory[count++] = new Item(id, name, qty);
                System.out.println("Item added successfully!");
            } else if (choice == 2) {
                System.out.print("Enter Item ID to update: ");
                int searchId = sc.nextInt();
                boolean found = false;
                for (int i = 0; i < count; i++) {
                    if (inventory[i].id == searchId) {
                        System.out.print("Enter new quantity: ");
                        inventory[i].quantity = sc.nextInt();
                        System.out.println("Quantity updated!");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Item not found!");
                }
            } else if (choice == 3) {
                System.out.println("\n--- Stock List ---");
                for (int i = 0; i < count; i++) {
                    System.out.println("ID: " + inventory[i].id + " | Name: " + inventory[i].name + " | Qty: " + inventory[i].quantity);
                }
            }
        }
        sc.close();
    }
}
