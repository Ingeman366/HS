package harrysaloon;

import harrysaloon.calender.Calender;

public class Main {
    Calender calender = new Calender();
    MenuText menuText = new MenuText();
    void run() {
        MenuText menuText = new MenuText();
        Menu menu = new Menu(menuText.standardHead(), menuText.standardLead(), menuText.standardMenu());
        boolean isRunning = true;
        do { int menuDecide;
            menu.printMenu();
            menuDecide = menu.readIntChoice();
            switch (menuDecide) {
                case 1 -> createBookingMenu();
                case 2 -> cancelBookingMenu();
                case 3 -> checkEconomy();
                case 4 -> isRunning = false;
                default -> System.out.println("Action not possible");
            }
        } while(isRunning);
    }

    public static void main(String[] args) {
        new Main().run();
    }
    void createBookingMenu(){
        boolean isBookingRunning = true;
        Menu menu = new Menu(menuText.createBooking(), menuText.enterDate());
        createEnvironment();
        do {int day;
            int choice;
            menu.printMenu();
            day = menu.readIntChoice();
            System.out.println(calender.getBookingsOnDate(day).toString());
            System.out.println("Do want to add a booking today? \n 1: Yes ---- 2: No");
            choice = menu.readIntChoice();
            switch (choice) {
                case 1 -> {addBooking(day);
                    isBookingRunning = false;}
                case 2 -> isBookingRunning = false;
                default -> System.out.println("Action not possible");
            }
        } while (isBookingRunning);



    }
    void addBooking(int day){
        Menu menu = new Menu();
        boolean isAddBookingRunning = true;
        String name;
        int timeSlot;
        System.out.println("Enter Customers name: ");
        name = menu.readStringChoice();
        System.out.println("Enter desired bookingslot: ");
        timeSlot = menu.readIntChoice();
        calender.getBookingsOnDate(day-1).setBooking(timeSlot,name);
    }
    void cancelBookingMenu(){

    }
    void checkEconomy(){

    }

    void createEnvironment(){
        calender.getBookingsOnDate(0).setBooking(0,"Sebastian");
    }
}