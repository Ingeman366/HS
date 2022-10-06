package harrysaloon;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private String menuHeader;
    private String leadText;
    private ArrayList<String> menuItems = new ArrayList();
    private Scanner sc = new Scanner(System.in);

    public Menu(String menuHeader, String leadText, ArrayList<String> menuItems) {
        this.sc = new Scanner(System.in);
        this.menuHeader = menuHeader;
        this.leadText = leadText;
        this.menuItems = menuItems;
    }
    public Menu(String menuHeader,String leadText){
        this.menuHeader = menuHeader;
        this.leadText = leadText;
    }
    public Menu(){

    }


    public void printMenu() {
        int menuSize = menuItems.size();
        System.out.println(menuHeader);

        for(int i = 0; i < menuSize; ++i) {
            System.out.println("  " + (i + 1) + ". " + menuItems.get(i));
        }

        System.out.print(leadText);
    }

    public int readIntChoice() {
        try {
            int choseMenu = sc.nextInt();
            sc.nextLine();
            return choseMenu;
        } catch (Exception var2) {
            System.out.println(leadText);
            sc.nextLine();
            return readIntChoice();
        }
    }
    public String readStringChoice() {
        try {
            String choseMenu = sc.nextLine();
            return choseMenu;
        } catch (Exception var2) {
            System.out.println(leadText);
            sc.nextLine();
            return readStringChoice();
        }
    }
}
