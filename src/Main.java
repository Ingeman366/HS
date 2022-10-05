import java.util.ArrayList;

public class Main {
    void run() {
        Calender calender = new Calender();
        MenuActions menuActions = new MenuActions();
        Menu menu = new Menu(menuActions.standardHead(), menuActions.standardLead(), menuActions.standardMenu());
        menu.readChoice();

    }

    public static void main(String[] args) {
        new Main().run();
    }


}