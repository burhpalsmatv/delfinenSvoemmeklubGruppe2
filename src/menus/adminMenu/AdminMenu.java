package menus.adminMenu;

import menus.Application;

import static menus.Application.scanner;

public class AdminMenu {
    //FOR METHODS RELATING TO THE ADMINISTRATORS SCREEN


    public static void AdminMenu() {

        boolean adminLoggedIn = true;

        while(adminLoggedIn) {
            System.out.println(adminScreenString());
            System.out.print("Vælg her: ");

            while (!scanner.hasNextInt()) {
                System.out.println("indtast et tal");
                scanner.next();
            }

            int input = scanner.nextInt();
            System.out.println();


            switch(input) {

                //MEMBERS
                case 1:
                    AM_MemberScreen.memberScreen();
                    break;

                //TRAINERS
                case 2:
                    AM_TrainerScreen.trainerScreen();
                    break;

                //SWIMMING CATEGORIES
                case 3:
                    AM_CategoryScreen.categoryScreen();
                    break;

                //COMPETITIONS
                case 4:
                    AM_CompetitionScreen.competitionScreen();
                    break;

                //LOG OUT
                case 0:
                    adminLoggedIn = false;

            }
        }
    }

    //STRINGS BELOW:
    public static String adminScreenString(){
        return String.format("""
                -----------------------------
                Administrator menu
                1. Medlemmer
                2. Trænere
                3. Svømmediscipliner
                4. Stævner
                0. Log ud
                """);
    }

}
