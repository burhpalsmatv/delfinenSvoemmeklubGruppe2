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
                    System.out.println(quotaMenuString());
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
                case 1: //INSERT METHOD

                    //CHANGE PRICES
                case 2: //INSERT METHOD

                    //CHANGE DISCOUNT
                case 3: //INSERT METHOD

                    //LOG OUT
                case 0:
                    inPricingMenu = false;
            }
        }
    }

    public static void quotaMenu() {
        boolean inQuotaMenu = true;
        System.out.println(quotaMenuString());

        while(inQuotaMenu) {
            int quotaInput = Application.scanner.nextInt();

            switch (inQuotaMenu) {
                //VIS FORVENTEDE ÅRSOPGØRELSE
                case 1:
                    //INSERT METHOD

                //VIS FAKTISKE ÅRSOPGØRELSE
                case 2:
                    //INSERT METHOD

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