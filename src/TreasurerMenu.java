public class TreasurerMenu {
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
                    Treasurer_PricesScreen.pricingMenu();
                    break;

                //QUOTA
                case 4:
                    Treasurer_QuotaMenu.quotaMenu();
                    break;

                //LOGOUT
                case 0:
                    treasurerLoggedIn = false;
            }
        }
    }


//METHODS BELOW:

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

}
