public class Booking {

    private boolean paymentReceived;
    private String name;
    private int totalToPay;


    public Booking(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "name='" + name + '\'' +
                '}';
    }
}
