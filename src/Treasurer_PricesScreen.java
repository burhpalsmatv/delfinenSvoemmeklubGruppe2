public class Treasurer_PricesScreen {

    public static void pricingMenu() {
        boolean inPricingMenu = true;
        System.out.println(pricesMenuString());

        while(inPricingMenu) {
            int priceInput = Application.scanner.nextInt();

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
        System.out.println("Indtast et tal (1:JUNIOR, 2:SENIOR, 3:PASSIVE):");
        int choosenMembership = Application.scanner.nextInt();
        Membership membership = Membership.values()[choosenMembership - 1];

        System.out.println("Indtast ny pris: ");
        int newPrice = Application.scanner.nextInt();

        membership.setPrice(newPrice);

        System.out.println("Prisen for " + choosenMembership + " er nu ændret");
    }

    public static String pricesMenuString() {
        return String.format("""
                1. Vis nuværende priser
                2. Ændr priser
                0. Tilbage til menu
                """);
    }
}
