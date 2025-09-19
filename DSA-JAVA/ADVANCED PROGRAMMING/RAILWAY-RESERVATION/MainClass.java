import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        boolean process = true;
        Scanner scan = new Scanner(System.in);
        ;
        System.out.println("----------RAILWAY TICKET RESERVATION SYSTEM------------");
        while (process) {
            System.out.println("Choose from the following");
            System.out.println("1. Booking");
            System.out.println("2. Cancelling");
            System.out.println("3. Display Conirmed List");
            System.out.println("4. Display RAC List");
            System.out.println("5. Display Waiting List");
            System.out.println("6. Exit");
            int n = scan.nextInt();
            scan.nextLine();
            switch (n) {

                case 1:
                    System.out.println("Enter your name");
                    String name = scan.nextLine();
                    System.out.println("Enter your age");
                    int age = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter your preference(U/M/L)");
                    char pref = scan.nextLine().charAt(0);
                    if (pref == 'U' || pref == 'M' || pref == 'L')
                        TicketBooking.book(new Passenger(name, age, pref));
                    else
                        System.out.println("Invalid berth");
                    break;
                case 2:
                    System.out.println("Enter you ID");
                    int id = scan.nextInt();
                    System.out.println(TicketCancelling.cancel(id));
                    break;
                case 3:
                    TicketBooking.displayBooked();
                    break;
                case 4:
                    TicketBooking.displayRAC();
                    break;
                case 5:
                    TicketBooking.displayWaiting();
                    break;
                case 6:
                    process = false;
                    break;

            }
        }
        scan.close();
    }
}