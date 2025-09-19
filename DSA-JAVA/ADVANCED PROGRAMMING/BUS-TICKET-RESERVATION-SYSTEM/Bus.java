public class Bus {
    static private int ct = 0;
    private int busNo;
    private int capacity;
    private boolean isAC;

    public Bus(int capacity, boolean isAC) {
        this.busNo = ++ct;
        this.capacity = capacity;
        this.isAC = isAC;
    }

    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean checkIsAC() {
        return isAC;
    }

}
