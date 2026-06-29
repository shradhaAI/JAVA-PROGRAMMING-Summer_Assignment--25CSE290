import java.util.Scanner;

public class MiniEmployeeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] empNames = new String[100];
        double[] empSalaries = new double[100];
        int count = 0;
        int choice = 0;

        while (choice != 3) {
            System.out.println("\n1. Add Employee\n2. Display All Employees\n3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                sc.nextLine();
                System.out.print("Enter Employee Name: ");
                empNames[count] = sc.nextLine();
                System.out.print("Enter Salary: ");
                empSalaries[count] = sc.nextDouble();
                count++;
                System.out.println("Employee added successfully!");
            } else if (choice == 2) {
                System.out.println("\n--- Employee Directory ---");
                for (int i = 0; i < count; i++) {
                    System.out.println("Name: " + empNames[i] + " | Salary: Rs." + empSalaries[i]);
                }
            }
        }
        sc.close();
    }
}
