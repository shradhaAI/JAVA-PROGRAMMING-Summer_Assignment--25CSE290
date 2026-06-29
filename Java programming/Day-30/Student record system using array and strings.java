import java.util.Scanner;

public class StudentRecordSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[100];
        String[] courses = new String[100];
        int[] ids = new int[100];
        int count = 0;
        int choice = 0;

        while (choice != 3) {
            System.out.println("\n1. Add Student\n2. View Records\n3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                ids[count] = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                names[count] = sc.nextLine();
                System.out.print("Enter Course: ");
                courses[count] = sc.nextLine();
                count++;
                System.out.println("Record added successfully!");
            } else if (choice == 2) {
                System.out.println("\n--- Student Records ---");
                for (int i = 0; i < count; i++) {
                    System.out.println("ID: " + ids[i] + " | Name: " + names[i] + " | Course: " + courses[i]);
                }
            }
        }
        sc.close();
    }
}
