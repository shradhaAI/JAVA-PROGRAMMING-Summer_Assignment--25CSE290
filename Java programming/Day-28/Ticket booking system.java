import java.util.Scanner;

public class TicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] seats = new boolean[10];
        int choice = 0;

        while (choice != 3) {
            System.out.println("\n1. View Seats\n2. Book a Seat\n3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("\n--- Seat Layout ---");
                for (int i = 0; i < seats.length; i++) {
                    String status = seats[i] ? "Booked" : "Available";
                    System.out.println("Seat " + (i + 1) + ": " + status);
                }
            } else if (choice == 2) {
                System.out.print("Enter seat number to book (1-10): ");
                int seatNum = sc.nextInt();
                if (seatNum >= 1 && seatNum <= 10) {
                    if (!seats[seatNum - 1]) {
                        seats[seatNum - 1] = true;
                        System.out.println("Seat " + seatNum + " booked successfully!");
                    } else {
                        System.out.println("Seat is already taken!");
                    }
                } else {
                    System.out.println("Invalid seat number!");
                }
            }
        }
        sc.close();
    }
}
