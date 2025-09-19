import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TicketBooking {
    private static int berthLimit = 2;
    private static int racLimit = 1;
    private static int waitLimit = 1;

    private static int upperSeatNumber = 1;
    private static int middleSeatNumber = 2;
    private static int lowerSeatNumber = 3;

    static ArrayList<Passenger> confirmedList = new ArrayList<>();

    static ArrayList<Passenger> upperBerth = new ArrayList<>();
    static ArrayList<Passenger> middleBerth = new ArrayList<>();
    static ArrayList<Passenger> lowerBerth = new ArrayList<>();

    static Queue<Passenger> racList = new LinkedList<>();
    static Queue<Passenger> waitingList = new LinkedList<>();

    public static void book(Passenger p) {
        if (upperBerth.size() == berthLimit && middleBerth.size() == berthLimit && lowerBerth.size() == berthLimit) {
            if (updateRAC(p)) {
                System.out.println("Ticket booked in RAC");
                racList.add(p);
            } else if (updateWaiting(p)) {
                System.out.println("You are in waiting list");
                waitingList.add(p);
            } else {
                System.out.println("NO tickets available");
                p.setId(p.getId() - 1);
                return;
            }

        } else if (checkAvailability(p)) {
            System.out.println("Booking confirmed\n Your booking id is " + p.getId());
            p.setTicketType("Berth");
            confirmedList.add(p);

        } else {
            System.out.println(p.getPreference() + " is not available");
            p.setId(p.getId() - 1);
            availableSeats();
        }
    }

    public static boolean updateRAC(Passenger p) {
        if (racList.size() < racLimit) {
            p.setTicketType("RAC");
            return true;
        }
        return false;
    }

    public static boolean updateWaiting(Passenger p) {
        if (waitingList.size() < waitLimit) {
            p.setTicketType("Waiting");
            return true;
        }
        return false;
    }

    public static boolean checkAvailability(Passenger p) {
        Map<Integer, Character> map = TicketCancelling.getSeatNumberWithBerth();
        int seatNumber = -1;
        if (!map.isEmpty()) {
            seatNumber = checkAvailableSeat(map, p.getPreference());
        }
        if (p.getPreference() == 'U' && upperBerth.size() < berthLimit) {
            if (seatNumber != -1) {
                p.setSeatNumber(seatNumber);
                map.remove(seatNumber);
            } else {
                p.setSeatNumber(upperSeatNumber);
                upperSeatNumber += 3;
            }
            upperBerth.add(p);
            return true;
        } else if (p.getPreference() == 'M' && middleBerth.size() < 0) {
            if (seatNumber != -1) {
                p.setSeatNumber(seatNumber);
                map.remove(seatNumber);
            } else {
                p.setSeatNumber(middleSeatNumber);
                middleSeatNumber += 3;
            }
            middleBerth.add(p);
            return true;
        } else if (p.getPreference() == 'L' && lowerBerth.size() < 0) {
            if (seatNumber != -1) {
                p.setSeatNumber(seatNumber);
                map.remove(seatNumber);
            } else {
                p.setSeatNumber(lowerSeatNumber);
                lowerSeatNumber += 3;
            }
            lowerBerth.add(p);
            return true;
        }
        return false;
    }

    public static int checkAvailableSeat(Map<Integer, Character> map, char pref) {
        for (Entry<Integer, Character> entry : map.entrySet()) {
            if (pref == ((char) entry.getValue())) {
                return (int) entry.getKey();
            }
        }
        return -1;
    }

    public static void availableSeats() {
        System.out.println("Check out the no of seats available");
        System.out.println("Upper Berth " + (berthLimit - upperBerth.size()));
        System.out.println("Middle Berth " + (berthLimit - middleBerth.size()));
        System.out.println("Lower Berth " + (berthLimit - lowerBerth.size()));
    }

    public static void displayBooked() {
        System.out.println("-------------------------");
        for (Passenger p : confirmedList) {
            System.out.println(p.toString());
            System.out.println("-------------------------");
        }
    }

    public static void displayRAC() {
        System.out.println("-------------------------");
        for (Passenger p : racList) {
            System.out.println(p.toString());
            System.out.println("-------------------------");
        }
    }

    public static void displayWaiting() {
        System.out.println("-------------------------");
        for (Passenger p : waitingList) {
            System.out.println(p.toString());
            System.out.println("-------------------------");
        }
    }

}
