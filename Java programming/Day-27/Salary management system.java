import java.util.Scanner;

public class SalaryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        double hra = basic * 0.15;
        double da = basic * 0.10;
        double pf = basic * 0.08;
        double grossSalary = basic + hra + da;
        double netSalary = grossSalary - pf;

        System.out.println("\n--- Salary Slip for " + name + " ---");
        System.out.println("Basic Salary : Rs." + basic);
        System.out.println("HRA (15%)    : Rs." + hra);
        System.out.println("DA (10%)     : Rs." + da);
        System.out.println("PF (8%) Deduct: Rs." + pf);
        System.out.println("Gross Salary : Rs." + grossSalary);
        System.out.println("Net Salary   : Rs." + netSalary);

        sc.close();
    }
}
