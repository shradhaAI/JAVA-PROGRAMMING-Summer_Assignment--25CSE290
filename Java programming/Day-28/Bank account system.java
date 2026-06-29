import java.util.Scanner;

class Account {
    int accNo;
    String name;
    double balance;

    Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account[] accounts = new Account[100];
        int count = 0;
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n1. Create Account\n2. Deposit\n3. Display Accounts\n4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Account Number: ");
                int accNo = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Holder Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Initial Deposit: ");
                double balance = sc.nextDouble();
                accounts[count++] = new Account(accNo, name, balance);
                System.out.println("Account created successfully!");
            } else if (choice == 2) {
                System.out.print("Enter Account Number: ");
                int accNo = sc.nextInt();
                boolean found = false;
                for (int i = 0; i < count; i++) {
                    if (accounts[i].accNo == accNo) {
                        found = true;
                        System.out.print("Enter Amount to Deposit: ");
                        double amt = sc.nextDouble();
                        accounts[i].balance += amt;
                        System.out.println("Updated Balance: Rs." + accounts[i].balance);
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Account not found!");
                }
            } else if (choice == 3) {
                System.out.println("\n--- Bank Accounts ---");
                for (int i = 0; i < count; i++) {
                    System.out.println("Acc No: " + accounts[i].accNo + ", Name: " + accounts[i].name + ", Balance: Rs." + accounts[i].balance);
                }
            }
        }
        sc.close();
    }
}
