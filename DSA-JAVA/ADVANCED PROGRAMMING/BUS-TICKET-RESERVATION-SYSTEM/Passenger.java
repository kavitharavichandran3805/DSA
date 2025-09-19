public class Passenger {
    private String p_name;
    private int p_id;
    private int busNo;
    static private int ct = 0;

    public Passenger(String p_name, int busNo) {
        this.p_id = ++ct;
        this.p_name = p_name;
        this.busNo = busNo;
    }

    public String getPassengerName() {
        return p_name;
    }

    public void setPassengerName(String name) {
        p_name = name;
    }

    public int getPassengerId() {
        return p_id;
    }

    public void setPassengerId(int id) {
        p_id = id;
    }

    public int getPassengerPrefBusNo() {
        return busNo;
    }

    public void setPassengerPrefBusNo(int bNo) {
        busNo = bNo;
    }
}
