public class TrainerScreen {
    //FOR METHODS RELATING TO THE TRAINERS SCREEN


    public static void trainerScreen() {

        boolean trainerLoggedIn = true;

        while (trainerLoggedIn) {
            System.out.println(trainerScreenString());

            int input = Application.scanner.nextInt();

            switch(input) {

                //COMPETITIONS:
                case 1: competitionMenu();


                //LIST OF COMPETITORS
                case 2:


                //ADD CATEGORY TO SWIMMER
                case 3:


                //ADD SWIMMER TO COMPETITION
                case 4:


                // TRAINING RESULTS
                case 5:


                //COMPETITION RESULTS
                case 6:


                //LOG OUT
                case 0:
                trainerLoggedIn = false;
            }




        }

    }


    public static void competitionMenu() {
        System.out.println(comptetitionMenuString());

    }


//RANDOM ASS STRINGS:

    public static String trainerScreenString(){
        return String.format("""
                "-----------------------------"
                "Træner menu"
                1. Stævner
                2. Vis liste af konkurrencesvømmere
                3. Tilføj disciplin til svømmer
                4. Tilføj svømmer til stævne
                5. Træningsresultater
                6. Stævneresultater
                0. Log ud
                """);
    }

    public static String comptetitionMenuString(){
        return String.format("""
                STÆVNER
                1. Vis kommende
                2. Vis tidligere
                0. Tilbage til menu
                """);
    }

}