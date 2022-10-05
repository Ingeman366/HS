public class Main {
    Calender calender = new Calender();
    MenuText menuText = new MenuText();
    void run() {
        MenuText menuText = new MenuText();
        Menu menu = new Menu(menuText.standardHead(), menuText.standardLead(), menuText.standardMenu());
        boolean isRunning = true;
        do { int menuDecide;
            menu.printMenu();
            menuDecide = menu.readChoice();
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
        do {int day;
            int choice;
            menu.printMenu();
            day = menu.readChoice();
            System.out.println(calender.getBookingsOnDate(day).toString());
            System.out.println("Do want to add a booking today? \n 1: Yes ---- 2: No");
            choice = menu.readChoice();
            switch (choice) {
                case 1 -> addBooking(day);
                case 2 -> isBookingRunning = false;
                default -> System.out.println("Action not possible");
            }
        } while (isBookingRunning);



    }
    void addBooking(int day){

    }
    void cancelBookingMenu(){

    }
    void checkEconomy(){

    }

}