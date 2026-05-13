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

                    //CHANGE PRICES
                case 2:
                    changePrices();

                    //CHANGE DISCOUNT
                case 3: //INSERT METHOD

                    //LOG OUT
                case 0:
                    inPricingMenu = false;
            }
        }
    }

    private static void showCurrentPrices() {
        System.out.println("---------DE NUVÆRENDE PRISER---------");
        System.out.println(PricingManager.displayPrices());
        System.out.println("Indtast \"0\" for at vende tilbage til hjem");
    }

    private static void changePrices() {
        System.out.println("Indtast et tal (1:JUNIOR, 2:SENIOR, 3:PASSIVE):");
        int choosenMembership = Application.scanner.nextInt();
        Membership membership = Membership.values()[choosenMembership - 1];

        System.out.println("Indtast ny pris: ");
        int newPrice = Application.scanner.nextInt();

        membership.setPrice(newPrice);

        System.out.println("Prisen er nu ændret");
        System.out.println("Indtast \"0\" for at vende tilbage til hjem");
    }

    public static String pricesMenuString() {
        return String.format("""
                1. Vis nuværende priser
                2. Ændr priser
                3. Ændr discount
                0. Tilbage til menu
                """);
    }
}
