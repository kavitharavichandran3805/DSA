import java.util.*;

public class Main {
    public static void main(String[] args) {
        Bus b1 = new Bus(2, true);
        Bus b2 = new Bus(2, false);
        Bus b3 = new Bus(2, true);
        Bus b4 = new Bus(2, false);
        Booking.addBus(b1);
        Booking.addBus(b2);
        Booking.addBus(b3);
        Booking.addBus(b4);
        boolean start = true;
        Scanner scan = new Scanner(System.in);
        String name;
        int busNo;
        int choice;
        while (start) {
            System.out.println("Enter you choice:");
            System.out.println(
                    "1.Booking\n2.Cancelling\n3. Display Available Tikets\n4. Display Booked Tickets\n5. Display Waiting List\n6. Exit");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter your name");
                    name = scan.nextLine();
                    System.out.println("Enter your preferred bus number");
                    busNo = scan.nextInt();
                    Passenger p = new Passenger(name, busNo);
                    if (Booking.bookTicket(p)) {
                        System.out.println("Successfully booked!!");
                        System.out.println("Name : " + p.getPassengerName());
                        System.out.println("Bus number : " + p.getPassengerPrefBusNo());
                    }
                    break;
                case 2:

                case 3:
                    Booking.displayAvailableTickets();
                case 4:
                    Booking.displayBooked();
                case 5:

                case 6:
                    start = false;

            }

        }
        scan.close();

    }
}
