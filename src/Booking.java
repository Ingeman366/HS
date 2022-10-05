import java.util.Scanner;

public class Booking {
    Scanner sc = new Scanner(System.in);


    public Booking(Customer name){


    }

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
