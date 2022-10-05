import java.util.ArrayList;

public class MenuActions {
    public String standardHead(){
        return "Welcome to Hairy's hair saloon";
    }
    public String standardLead(){
        return "Chose action";
    }
    public ArrayList<String> standardMenu() {
        ArrayList<String> menuItems = new ArrayList<>();
        menuItems.add("Create Booking");
        menuItems.add("Cancel Booking");
        menuItems.add("Business Economy");
        return menuItems;
    }
}