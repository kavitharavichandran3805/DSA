public class Passenger {

    private static int idProvider = 0;
    private int id;
    private String name;
    private int age;
    private char preference;
    private String ticketType;
    private int seatNumber;

    public Passenger(String name, int age, char preference) {
        this.id = ++idProvider;
        this.name = name;
        this.age = age;
        this.preference = preference;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        Passenger.idProvider = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getPreference() {
        return this.preference;
    }

    public void SetPreference(char pref) {
        this.preference = pref;
    }

    public String getTicketType() {
        return this.ticketType;
    }

    public void setTicketType(String type) {
        this.ticketType = type;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public void setSeatNumber(int num) {
        this.seatNumber = num;
    }

    public String toString() {
        return "Passenger Ticket id : " + id + "\nPassenger name : " + name
                + "\nPassenger age : " + age + "\nPassenger Seat no : " + seatNumber +
                "\nPassenger preference : " + preference;
    }

}