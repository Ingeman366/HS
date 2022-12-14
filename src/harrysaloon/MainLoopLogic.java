package harrysaloon;

import harrysaloon.calender.Calender;

public class MainLoopLogic {
    Calender calender = new Calender();
    MenuText menuText = new MenuText();
    void run() {
        int currentDate = 15;
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
                case 3 -> checkEconomy(currentDate);
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
        String name;
        int timeSlot;
        System.out.println("Enter Customers name: ");
        name = menu.readStringChoice();
        System.out.println("Enter desired bookingslot: ");
        timeSlot = menu.readIntChoice();
        calender.getBookingsOnDate(day).setBooking(timeSlot-1,name);
        System.out.println("Slot booked succesfully!");
    }
    void cancelBookingMenu(){
        boolean isCancelRunning = true;
        Menu menu = new Menu(menuText.cancelBooking(), menuText.enterDate());
        do {int day;
            int choice;
            menu.printMenu();
            day = menu.readIntChoice();
            System.out.println(calender.getBookingsOnDate(day).toString());
            System.out.println("Do you want to delete a booking today? \n 1: Yes ---- 2: No");
            choice = menu.readIntChoice();
            switch (choice) {
                case 1 -> {cancelBooking(day);
                    isCancelRunning = false;}
                case 2 -> isCancelRunning = false;
                default -> System.out.println("Action not possible");
            }
        } while (isCancelRunning);
    }
    void cancelBooking(int day){
        Menu menu = new Menu();
        int timeSlot;
        System.out.println("Which slot do you wish to cancel? ");
        timeSlot = menu.readIntChoice();
        calender.getBookingsOnDate(day).removeBooking(timeSlot-1);
        System.out.println("Booking deleted successfully!");
    }
    void checkEconomy(int currentDate){
        int ecoCheckDate;
        Menu menu = new Menu();
        System.out.println("Which day to you want to check economy from?");
        ecoCheckDate = menu.readIntChoice();
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