package harrysaloon;

import harrysaloon.calender.Calender;

public class MainLoopLogic {
    Calender calender = new Calender();
    MenuText menuText = new MenuText();
    void run() {
        MenuText menuText = new MenuText();
        Menu menu = new Menu(menuText.standardHead(), menuText.standardLead(), menuText.standardMenu());
        boolean isRunning = true;
        createEnvironment();
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
        new MainLoopLogic().run();
    }
    void createBookingMenu(){
        boolean isBookingRunning = true;
        Menu menu = new Menu(menuText.createBooking(), menuText.enterDate());
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
        calender.getBookingsOnDate(day).setBooking(timeSlot,name);
    }
    void cancelBookingMenu(){

    }
    void checkEconomy(){

    }

    void createEnvironment(){
        calender.getBookingsOnDate(1).setBooking(0,"Sebastian");
        calender.getBookingsOnDate(1).setBooking(1,"Oliver");
        calender.getBookingsOnDate(1).setBooking(2,"Noah");
        calender.getBookingsOnDate(1).setBooking(3,"Martin");
        calender.getBookingsOnDate(1).setBooking(4,"Philip");
        calender.getBookingsOnDate(1).setBooking(5,"Lene");
        calender.getBookingsOnDate(1).setBooking(6,"Bente");
        calender.getBookingsOnDate(2).setBooking(0,"Glenn");
        calender.getBookingsOnDate(2).setBooking(1,"Baune");
        calender.getBookingsOnDate(2).setBooking(2,"Per");
        calender.getBookingsOnDate(2).setBooking(3,"Mini");
        calender.getBookingsOnDate(2).setBooking(4,"Cliff");
        calender.getBookingsOnDate(2).setBooking(5,"Lone");
        calender.getBookingsOnDate(2).setBooking(6,"Yvonne");
    }
}