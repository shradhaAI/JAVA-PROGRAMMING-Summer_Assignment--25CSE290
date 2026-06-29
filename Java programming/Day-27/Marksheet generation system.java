import java.util.Scanner;

public class MarksheetGeneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter Marks for Physics: ");
        int p = sc.nextInt();
        System.out.print("Enter Marks for Chemistry: ");
        int c = sc.nextInt();
        System.out.print("Enter Marks for Mathematics: ");
        int m = sc.nextInt();

        int total = p + c + m;
        double percentage = total / 3.0;
        String grade;

        if (percentage >= 85) {
            grade = "A+";
        } else if (percentage >= 70) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 33) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        System.out.println("\n==============================");
        System.out.println("          MARKSHEET           ");
        System.out.println("==============================");
        System.out.println("Name: " + name + " | Roll No: " + roll);
        System.out.println("------------------------------");
        System.out.println("Physics     : " + p);
        System.out.println("Chemistry   : " + c);
        System.out.println("Mathematics : " + m);
        System.out.println("------------------------------");
        System.out.println("Total Marks : " + total + "/300");
        System.out.printf("Percentage  : %.2f%%\n", percentage);
        System.out.println("Grade       : " + grade);
        System.out.println("==============================");

        sc.close();
    }
}
