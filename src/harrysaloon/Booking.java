package harrysaloon;
public class Booking {
    private String name;
    private int price = 150;

    public Booking(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    public int getPrice(){
        return price;
    }
}
