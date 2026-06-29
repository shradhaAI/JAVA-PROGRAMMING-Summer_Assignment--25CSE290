import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int size = 0;
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n--- Array Operations ---");
            System.out.println("1. Insert Element\n2. Search Element\n3. Display Array\n4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter element to insert: ");
                arr[size++] = sc.nextInt();
                System.out.println("Inserted successfully!");
            } else if (choice == 2) {
                System.out.print("Enter element to search: ");
                int key = sc.nextInt();
                int index = -1;
                for (int i = 0; i < size; i++) {
                    if (arr[i] == key) {
                        index = i;
                        break;
                    }
                }
                if (index != -1) {
                    System.out.println("Found at index: " + index);
                } else {
                    System.out.println("Element not found!");
                }
            } else if (choice == 3) {
                System.out.print("Array elements: ");
                for (int i = 0; i < size; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
