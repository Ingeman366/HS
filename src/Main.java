import java.util.ArrayList;

public class Main {
    void run(){
        standardMenu();
    }
    public static void main(String[] args) {
    new Main().run();}

    void standardMenu(){
        ArrayList<String> menuItems = new ArrayList<>();
        menuItems.add("Create Booking");
        menuItems.add("Cancel Booking");
        menuItems.add("Business Economy");
        Menu menu = new Menu("Welcome to Hairy's hair saloon","Chose action",menuItems);
    }
}
