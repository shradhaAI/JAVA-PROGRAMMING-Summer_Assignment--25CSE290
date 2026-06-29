import java.util.Scanner;

class Student {
    int id;
    String name;
    String course;

    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] records = new Student[100];
        int count = 0;
        int choice = 0;

        while (choice != 3) {
            System.out.println("\n1. Add Student\n2. View Students\n3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Course: ");
                String course = sc.nextLine();

                records[count++] = new Student(id, name, course);
                System.out.println("Student added successfully!");
            } else if (choice == 2) {
                System.out.println("\n--- Student Records ---");
                for (int i = 0; i < count; i++) {
                    System.out.println("ID: " + records[i].id + ", Name: " + records[i].name + ", Course: " + records[i].course);
                }
            }
        }
        sc.close();
    }
}
