package menus.treasurerMenu;

import enums.Membership;
import menus.Application;

import static menus.Application.scanner;

public class Treasurer_PricesScreen {

    public static void pricingMenu() {
        boolean inPricingMenu = true;

        while(inPricingMenu) {
            System.out.println(pricesMenuString());

            System.out.print("Vælg her: ");

            while (!scanner.hasNextInt()) {
                System.out.println("indtast et tal");
                scanner.next();
            }
            // check om det står det rigtig sted

            int priceInput = Application.scanner.nextInt();
            Application.scanner.nextLine();

            switch (priceInput) {

                //CURRENT PRICES
                case 1:
                    showCurrentPrices();
                    break;

                    //CHANGE PRICES
                case 2:
                    changePrices();
                    break;

                    //LOG OUT
                case 0:
                    inPricingMenu = false;
            }
        }
    }

    private static void showCurrentPrices() {
        System.out.println("---------DE NUVÆRENDE PRISER---------");
        System.out.println(PricingManager.displayPrices());
    }

    private static void changePrices() {
        System.out.println("Indtast et tal (1: JUNIOR, 2: SENIOR, 3: PASSIVE):");

        System.out.print("Vælg her: ");
        int choosenMembership = Application.scanner.nextInt();
        Application.scanner.nextLine();

        Membership membership = Membership.values()[choosenMembership - 1];

        System.out.print("Indtast ny pris: ");
        int newPrice = Application.scanner.nextInt();
        Application.scanner.nextLine();

        membership.setPrice(newPrice);

        System.out.println("Prisen er nu ændret til " + newPrice + " kr.");
    }

    public static String pricesMenuString() {
        return String.format("""
                1. Vis nuværende priser
                2. Ændr priser
                0. Tilbage til menu
                """);
    }
}
