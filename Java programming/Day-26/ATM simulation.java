import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000.0;
        int choice = 0;
        
        while (choice != 4) {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            
            if (choice == 1) {
                System.out.println("Current balance: Rs." + balance);
            } else if (choice == 2) {
                System.out.print("Enter deposit amount: ");
                double deposit = sc.nextDouble();
                balance += deposit;
                System.out.println("Successfully deposited.");
            } else if (choice == 3) {
                System.out.print("Enter withdrawal amount: ");
                double withdrawal = sc.nextDouble();
                if (withdrawal <= balance) {
                    balance -= withdrawal;
                    System.out.println("Please collect your cash.");
                } else {
                    System.out.println("Insufficient balance!");
                }
            } else if (choice == 4) {
                System.out.println("Thank you for using the ATM!");
            } else {
                System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}
