import java.util.HashMap;
import java.util.Map;

public class TicketCancelling extends TicketBooking {

    private static Map<Integer, Character> map = new HashMap<Integer, Character>();
    private static char preferenceTracker = '\0';
    private static int canceledSeatNumber = 0;

    public static String cancel(int id) {
        for (Passenger p : confirmedList) {
            if (p.getId() == id) {
                cancelBooking(p);
                return "Successfully deleted";
            }
        }

        for (Passenger p : racList) {
            if (p.getId() == id) {
                cancelBooking(p);
                return "Successfully deleted";
            }
        }

        for (Passenger p : waitingList) {
            if (p.getId() == id) {
                cancelBooking(p);
                return "Successfully deleted";
            }
        }
        return "Invalid ID";
    }

    public static void cancelBooking(Passenger p) {
        if (p.getTicketType().equals("Berth")) {
            preferenceTracker = p.getPreference();
            canceledSeatNumber = p.getSeatNumber();
            map.put(canceledSeatNumber, preferenceTracker);
            deleteFromAll(p);
            racToConfirmed(racList.poll());
            waitingToRac(waitingList.poll());

        } else if (p.getTicketType().equals("RAC")) {
            racList.remove(p);
            waitingToRac(waitingList.poll());
        } else {
            waitingList.remove(p);
        }
    }

    public static void racToConfirmed(Passenger p) {
        if (p != null) {
            p.setSeatNumber(canceledSeatNumber);
            p.setTicketType("Berth");
            p.SetPreference(preferenceTracker);
            if (p.getPreference() == 'U') {
                upperBerth.add(p);
            } else if (p.getPreference() == 'M') {
                middleBerth.add(p);
            } else {
                lowerBerth.add(p);
            }
            racList.remove(p);
            confirmedList.add(p);
            map.remove(canceledSeatNumber);
            canceledSeatNumber = 0;
            preferenceTracker = '\0';
        }
    }

    public static void deleteFromAll(Passenger p) {
        confirmedList.remove(p);
        upperBerth.remove(p);
        lowerBerth.remove(p);
        middleBerth.remove(p);
    }

    public static void waitingToRac(Passenger p) {
        if (p != null) {
            p.setTicketType("RAC");
            waitingList.remove(p);
            racList.add(p);
        }
    }

    public static Map<Integer, Character> getSeatNumberWithBerth() {
        return map;
    }
}
