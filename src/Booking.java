import java.util.Scanner;

public class Booking {

    private boolean paymentReceived;
    private String name;
    private int totalToPay;
    Scanner sc = new Scanner(System.in);

    //TODO get name from costumer class


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
