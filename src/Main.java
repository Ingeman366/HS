public class Main {
    Calender calender = new Calender();
    MenuText menuText = new MenuText();
    void run() {

        MenuText menuText = new MenuText();
        Menu menu = new Menu(menuText.standardHead(), menuText.standardLead(), menuText.standardMenu());
        boolean isRunning = true;
        while(isRunning){
            menu.printMenu();

            mainDecide(menu.readChoice());
        }


    }

    public static void main(String[] args) {
        new Main().run();
    }
    void createAppointmentMenu(){
        boolean isRunning = true;
        Menu menu = new Menu(menuText.createBooking(), menuText.enterDate());

            int day;
            menu.printMenu();
            day = menu.readChoice();
            System.out.println(calender.getDate(day).toString());



    }
    void mainDecide(int menuDecide){
        switch (menuDecide) {
            case 1 -> createAppointmentMenu();
        }
    }
    void createDecide(int createDecide){
        switch (createDecide) {
            case 1 -> createAppointmentMenu();
        }
    }
}