import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private String menuHeader;
    private String leadText;
    private ArrayList<String> menuItems = new ArrayList();
    private Scanner sc;

    public Menu(String menuHeader, String leadText, ArrayList<String> menuItems) {
        this.sc = new Scanner(System.in);
        this.menuHeader = menuHeader;
        this.leadText = leadText;
        this.menuItems = menuItems;
    }

    public void printMenu() {
        int menuSize = menuItems.size();
        System.out.println(menuHeader);

        for(int i = 0; i < menuSize; ++i) {
            System.out.println("  " + (i + 1) + ". " + menuItems.get(i));
        }

        System.out.print(leadText);
    }

    public int readChoice() {
        try {
            int choseMenu = sc.nextInt();
            sc.nextLine();
            return choseMenu;
        } catch (Exception var2) {
            System.out.println(leadText);
            sc.next();
            return readChoice();
        }
    }
}
