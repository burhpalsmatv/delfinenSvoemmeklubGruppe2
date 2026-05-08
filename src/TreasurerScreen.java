import java.util.Scanner;

public class TreasurerScreen {
    //FOR METHODS RELATING TO THE TREASURER SCREEN


    public static void treasurerScreen() {

        boolean treasurerLoggedIn = true;

        while (treasurerLoggedIn) {

            System.out.println("-----------------------------");
            System.out.println("Kassérer menu");
            System.out.println("1. Vis medlemmers betalingsstatus");
            System.out.println("2. Vis medlemmer i restance");
            System.out.println("3. Priser");
            System.out.println("4. Årsopgørelse");
            System.out.println("0. Log ud");

            int input = Application.scanner.nextInt();

            switch(input){

                case 1:
                    //Insert method that returns list of members and their payment status

                case 2:
                    System.out.println(PaymentManager.getMembersInArrear(Register.listOfMembers));


                case 3:
                    System.out.println(PaymentManager.getExpectedQuota(Register.listOfMembers));


                case 4:
                    System.out.println(PaymentManager.getQuota(Register.listOfMembers));

                case 5:
                    treasurerLoggedIn = false;
            }

        }
    }
}
