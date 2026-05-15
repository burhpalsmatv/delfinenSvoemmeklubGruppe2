public class TrainerMenu {
    //FOR METHODS RELATING TO THE TRAINERS SCREEN

    public static void trainerScreen() {

        boolean trainerLoggedIn = true;

        while (trainerLoggedIn) {

            System.out.println(trainerScreenString());
            int input = Application.scanner.nextInt();

            switch(input) {

                //LIST OF COMPETITIONS:
                case 1:
                    RegisterSimplePrinter.printSimplifiedCompetitionsList();
                break;

                //LIST OF COMPETITORS
                case 2:
                       RegisterSimplePrinter.printSimplifiedCompetitorList();
                    break;

                //ADD SWIMMER TO COMPETITION
                case 3:
                    addCompetitorToCompetition();
                    break;

                // TRAINING RESULTS
                case 4:
                    TrainerMenu_TrainingResultScreen.trainingResultScreen();
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
                1. Liste af stævner
                2. Vis liste af konkurrencesvømmere
                3. Tilføj svømmer til stævne
                4. Træningsresultater
                0. Log ud
                """);
    }

    public static void addCompetitorToCompetition() {

        //Loadbearing scanner nextline
        Application.scanner.nextLine();

        System.out.println("Vælg konkurrencesvømmer:");
        RegisterSimplePrinter.printSimplifiedCompetitorList();
        int CompetitorChoice = Application.scanner.nextInt();

        System.out.println("Tilføj " + Register.listOfCompetitors.get(CompetitorChoice).getName() +
                " til stævne:");

        RegisterSimplePrinter.printSimplifiedCompetitionsList();
        int CompetitionChoice = Application.scanner.nextInt();
        // Register.listOfCompetitions.get(CompetitionChoice).addCompetitor(Register.listOfCompetitors.get(CompetitorChoice));

        System.out.println(Register.listOfCompetitors.get(CompetitorChoice).getName() + " er tilføjet til "
                + Register.listOfCompetitions.get(CompetitionChoice).getTitle());

    }
}