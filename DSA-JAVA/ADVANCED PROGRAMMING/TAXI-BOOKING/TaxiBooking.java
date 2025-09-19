import java.util.ArrayList;

public class TaxiBooking {
    private static ArrayList<Taxi> taxiList = new ArrayList<>();
    private static ArrayList<Taxi> bookedHistory = new ArrayList<>();
    private static int taxiLimit = 4, idGenerator = 1;

    public static String booking(char pickupLocation, char dropLocation, int pickupTime)
            throws CloneNotSupportedException {
        if (taxiList.size() < taxiLimit) {
            taxiList.add(new Taxi());
        }

        Taxi taxiReady = null;
        int min = Integer.MAX_VALUE;
        for (Taxi t : taxiList) {
            if (t.getDropTime() <= pickupTime && Math.abs(t.getCurrentLocation() - pickupLocation) <= min) {
                if (Math.abs(t.getCurrentLocation() - pickupLocation) == min) {
                    if (taxiReady != null && t.getEarnings() < taxiReady.getEarnings()) {
                        taxiReady = t;
                    }

                } else {
                    taxiReady = t;
                    min = Math.abs(t.getCurrentLocation() - pickupLocation);
                }

            }
        }

        if (taxiReady != null) {
            taxiReady.setCurrentLocation(dropLocation);
            taxiReady.setCustomerId(idGenerator++);
            taxiReady.setDropLocation(dropLocation);
            taxiReady.setPickupLocation(pickupLocation);
            taxiReady.setPickupTime(pickupTime);
            taxiReady.setDropTime(pickupTime + Math.abs(dropLocation - pickupLocation));
            taxiReady.setTaxiId(taxiList.indexOf(taxiReady) + 1);
            taxiReady.setEarnings(
                    taxiReady.getEarnings() + ((Math.abs(dropLocation - pickupLocation) * 15 - 5) * 10 + 100));
            bookedHistory.add((Taxi) taxiReady.clone());
        }

        return taxiReady != null ? "Taxi number - " + taxiReady.getTaxiId() + " is booked!" : "No taxis available";
    }

    public static void display() {

        System.out.println("-----------------");
        for (Taxi t : bookedHistory) {
            System.out.println(t.toString());
            System.out.println("-----------------");
        }
    }
}
