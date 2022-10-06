package harrysaloon;

import java.util.ArrayList;

public class MenuText {

    public String standardHead(){
        return "Welcome to Hairy's hair saloon\n Current date is 15th September 2022";
    }
    public String standardLead(){
        return "Chose action: ";
    }
    public ArrayList<String> standardMenu() {
        ArrayList<String> menuItems = new ArrayList<>();
        menuItems.add("Create Booking");
        menuItems.add("Cancel Booking");
        menuItems.add("Business Economy");
        menuItems.add("EXIT PROGRAM");
        return menuItems;
    }

    public String enterDate(){
        return "Enter date: ";
    }
    public String createBooking(){
        return TextColor.WHITE_BACKGROUND + TextColor.BLACK_BOLD + "--Create Booking--" + TextColor.RESET;
    }
    public String cancelBooking(){
        return TextColor.WHITE_BACKGROUND + TextColor.BLACK_BOLD + "--Cancel Booking--" + TextColor.RESET;
    }
}