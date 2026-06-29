import java.util.Scanner;

class Employee {
    int id;
    String name;
    String department;

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[100];
        int count = 0;
        int choice = 0;

        while (choice != 3) {
            System.out.println("\n1. Add Employee\n2. Search Employee by ID\n3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Department: ");
                String dept = sc.nextLine();

                employees[count++] = new Employee(id, name, dept);
                System.out.println("Employee added successfully!");
            } else if (choice == 2) {
                System.out.print("Enter ID to search: ");
                int searchId = sc.nextInt();
                boolean found = false;

                for (int i = 0; i < count; i++) {
                    if (employees[i].id == searchId) {
                        System.out.println("Found -> Name: " + employees[i].name + ", Dept: " + employees[i].department);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Employee not found!");
                }
            }
        }
        sc.close();
    }
}
