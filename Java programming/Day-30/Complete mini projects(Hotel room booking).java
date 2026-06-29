import java.util.Scanner;

public class HotelBookingProject {
    static String[] guestNames = new String[10];
    static boolean[] roomStatus = new boolean[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n--- Hotel Room Booking System ---");
            System.out.println("1. View Room Status\n2. Book a Room\n3. Check Out Room\n4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                displayRooms();
            } else if (choice == 2) {
                bookRoom(sc);
            } else if (choice == 3) {
                checkOutRoom(sc);
            }
        }
        sc.close();
    }

    public static void displayRooms() {
        System.out.println("\n--- Room List ---");
        for (int i = 0; i < roomStatus.length; i++) {
            if (roomStatus[i]) {
                System.out.println("Room " + (i + 1) + ": Booked by " + guestNames[i]);
            } else {
                System.out.println("Room " + (i + 1) + ": Available");
            }
        }
    }

    public static void bookRoom(Scanner sc) {
        System.out.print("Enter room number to book (1-10): ");
        int roomNum = sc.nextInt();
        
        if (roomNum < 1 || roomNum > 10) {
            System.out.println("Invalid room number!");
            return;
        }

        if (!roomStatus[roomNum - 1]) {
            sc.nextLine();
            System.out.print("Enter guest name: ");
            guestNames[roomNum - 1] = sc.nextLine();
            roomStatus[roomNum - 1] = true;
            System.out.println("Room " + roomNum + " booked successfully!");
        } else {
            System.out.println("Room " + roomNum + " is already occupied!");
        }
    }

    public static void checkOutRoom(Scanner sc) {
        System.out.print("Enter room number for checkout (1-10): ");
        int roomNum = sc.nextInt();

        if (roomNum < 1 || roomNum > 10) {
            System.out.println("Invalid room number!");
            return;
        }

        if (roomStatus[roomNum - 1]) {
            System.out.println("Thank you, " + guestNames[roomNum - 1] + ". Checked out from Room " + roomNum);
            guestNames[roomNum - 1] = null;
            roomStatus[roomNum - 1] = false;
        } else {
            System.out.println("Room " + roomNum + " is already empty!");
        }
    }
}
