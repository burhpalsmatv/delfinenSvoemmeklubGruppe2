package menus;

import comparator.*;
import menus.adminMenu.AdminMenu;
import menus.trainerMenu.TrainerMenu;
import menus.treasurerMenu.TreasurerMenu;

import java.util.Comparator;
import java.util.Scanner;

public class Application {
    // My best friend the scanner
    public static final Scanner scanner = new Scanner(System.in);

    //Comparator(s)
    public static final Comparator comparatorButterfly = new SortByButterflyResult();
    public static final Comparator comparatorCrawl = new SortByCrawlResult();
    public static final Comparator comparatorBackCrawl = new SortByBackCrawlResult();
    public static final Comparator comparatorBreast = new SortByBreastResult();


    public static void mainApp() {

    Boolean applicationRunning = true;

    while (applicationRunning) {

        System.out.println("""
                1: Admin login
                2: Træner
                3: Kassér
                0: Log ud - sluk system
                """);
        System.out.print("Vælg menu: ");

        while (!scanner.hasNextInt()) {
            System.out.println("indtast et tal");
            scanner.next();
        }
        int input = scanner.nextInt();

        switch (input) {

            case 1:
                AdminMenu.AdminMenu();
                break;

            case 2:
                TrainerMenu.trainerScreen();
                break;

            case 3:
                TreasurerMenu.treasurerScreen();
                break;

            case 0:
                applicationRunning = false;
            }

        }
    }

}
