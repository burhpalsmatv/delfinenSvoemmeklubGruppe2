package menus.treasurerMenu;
import register.*;
import menus.Application;

import static menus.Application.scanner;


public class TreasurerMenu {
    //FOR METHODS RELATING TO THE TREASURER SCREEN

    public static void treasurerScreen() {

        boolean treasurerLoggedIn = true;

        while (treasurerLoggedIn) {

            System.out.println(treasurerScreenString());

            System.out.print("Vælg her: ");

            while (!scanner.hasNextInt()) {
                System.out.println("indtast et tal");
                scanner.next();
            }
            // check om det står det rigtig sted

            int input = Application.scanner.nextInt();
            Application.scanner.nextLine();

            switch(input) {

                //SHOW MEMBERS PAYMENT STATUS
                case 1:
                    System.out.print(PaymentManager.showMembersPaymentStatus(Register.getListOfMembers()));
                    break;

                //MEMBERS IN ARREAR
                case 2:
                    System.out.println(PaymentManager.getMembersInArrear(Register.getListOfMembers()));
                    for (int i = 0; i < PaymentManager.getMembersInArrear(Register.getListOfMembers()).size(); i++) {
                        System.out.println("Navn: " + PaymentManager.getMembersInArrear(Register.getListOfMembers()).get(i).getName());
                        System.out.println("Medlems-ID: " + PaymentManager.getMembersInArrear(Register.getListOfMembers()).get(i).getMemberID());
                        System.out.println("Medlemskab: " + PaymentManager.getMembersInArrear(Register.getListOfMembers()).get(i).getMembership());
                        System.out.println("Medlemstype: " + PaymentManager.getMembersInArrear(Register.getListOfMembers()).get(i).getMemberType());
                        System.out.println("Betalingsstatus: " + PaymentManager.getMembersInArrear(Register.getListOfMembers()).get(i).getPaymentStatusAsText());
                        System.out.println();
                    }

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
