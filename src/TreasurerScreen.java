public class TreasurerScreen {
    //FOR METHODS RELATING TO THE TREASURER SCREEN

    public static void treasurerScreen() {

        boolean treasurerLoggedIn = true;

        while (treasurerLoggedIn) {

            System.out.println(treasurerScreenString());
            int input = Application.scanner.nextInt();

            switch(input) {

                //SHOW MEMBERS PAYMENT STATUS
                case 1:
                    //INSERT METHOD HERE
                    System.out.println(PaymentManager.showMembersPaymentStatus(Register.listOfMembers));

                //MEMBERS IN ARREAR
                case 2:
                    System.out.println(PaymentManager.getMembersInArrear(Register.listOfMembers));
                    break;

                //PRICES
                case 3:
                    pricingMenu();
                    break;

                //QUOTA
                case 4:
                    quotaMenu();
                    break;

                //LOGOUT
                case 0:
                    treasurerLoggedIn = false;
            }

        }
    }


//METHODS BELOW:

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

public static void quotaMenu() {
        boolean inQuotaMenu = true;
        System.out.println(quotaMenuString());

        while(inQuotaMenu) {
            int quotaInput = Application.scanner.nextInt();

            switch (quotaInput) {
                //VIS FORVENTEDE ÅRSOPGØRELSE
                case 1:
                    System.out.println("Den forventede årsopgørelse er: " + PaymentManager.getExpectedQuota(Register.listOfMembers) + " kr.");

                //VIS FAKTISKE ÅRSOPGØRELSE
                case 2:
                    System.out.println("Den faktiske årsopgørelse er: " + PaymentManager.getActualQuota(Register.listOfMembers) + " kr.");

                //Tilbage til menu
                case 0:
                    inQuotaMenu = false;
            }
        }
    }

    //STRINGS BELOW:

    public static String treasurerScreenString() {
        return String.format("""
                -----------------------------
                Kassérer menu
                1. Vis medlemmers betalingsstatus
                2. Vis medlemmer i restance
                3. Priser
                4. Årsopgørelse
                0. Log ud
                """);

    }

    public static String pricesMenuString() {
        return String.format("""
                1. Vis nuværende priser
                2. Ændr priser
                3. Ændr discount
                0. Tilbage til menu
                """);
    }

    public static String quotaMenuString() {
        return String.format("""
                1. Vis forventede årsopgørelse
                2. Vis faktiske årsopgørelse
                0. Tilbage til menu
                """);
    }

}