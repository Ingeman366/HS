package harrysaloon;
public class Booking {
    private String name;

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
