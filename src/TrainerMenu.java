public class TrainerMenu {
    //FOR METHODS RELATING TO THE TRAINERS SCREEN

    public static void trainerScreen() {

        boolean trainerLoggedIn = true;

        while (trainerLoggedIn) {

            System.out.println(trainerScreenString());
            int input = Application.scanner.nextInt();

            switch(input) {

                //COMPETITIONS:
                case 1: TM_CompetitionScreen.competitionMenu();
                break;

                //LIST OF COMPETITORS
                case 2:
                    //SHOW LIST OF COMPETITORS
                       RegisterSimplePrinter.printSimplifiedCompetitorList();
                    break;

                //ADD SWIMMER TO COMPETITION
                case 3:
                    TM_CompetitionScreen.addCompetitorToCompetition();
                    break;

                // TRAINING RESULTS
                case 4:
                    TM_TrainingResultScreen.trainingResultScreen();
                    break;

                //LOG OUT
                case 0:
                trainerLoggedIn = false;
            }
        }
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
}