import java.util.*;

public class Booking {
    private static ArrayList<Bus> buses = new ArrayList<>();
    private static Queue<Passenger> waitingList = new LinkedList<>();
    private static ArrayList<Passenger> confirmedList = new ArrayList<>();
    static private int totalCapacity = 8;

    public static boolean bookTicket(Passenger p) {
        boolean booked = false;
        if (totalCapacity > 0) {
            for (Bus b : buses) {
                if (b.getCapacity() > 0 && b.getBusNo() == p.getPassengerPrefBusNo()) {
                    b.setCapacity(b.getCapacity() - 1);
                    --totalCapacity;
                    p.setPassengerPrefBusNo(p.getPassengerPrefBusNo());
                    confirmedList.add(p);
                    booked = true;
                    break;
                }
            }
            if (booked) {
                return true;
            } else {
                System.out.println(
                        "Unfortunately your preferred bus is not availabe, Choose another bus from the below details");
                displayAvailableTickets();
                System.out.println("Enter you bus number");
                int busNo = new Scanner(System.in).nextInt();
                p.setPassengerPrefBusNo(busNo);
                return bookTicket(p);
            }
        } else {
            System.out.println("Sorry! All the buses are filled, you are added to the waiting list");
            waitingList.add(p);
        }
        return false;
    }

    public static void displayAvailableTickets() {
        System.out.println("Available Tickets");
        System.out.println("BUS NO\tAVAILABLE CAPACITY\tAC COACH");
        for (Bus b : buses) {
            System.out.println(b.getBusNo() + "\t\t" + b.getCapacity() + "\t\t" + (b.checkIsAC() ? "Yes" : "No"));
        }
    }

    public static void addBus(Bus b) {
        buses.add(b);
    }

    public static void displayBooked() {
        System.out.println("ID\tNAME\t BUS NO\t");
        for (Passenger p : confirmedList) {
            System.out.println(p.getPassengerId() + "\t\t" + p.getPassengerName() + "\t\t" + p.getPassengerPrefBusNo());
        }
    }

}