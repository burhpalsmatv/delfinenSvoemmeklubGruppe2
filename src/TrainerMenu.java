public class TrainerMenu {
    //FOR METHODS RELATING TO THE TRAINERS SCREEN

    public static void trainerScreen() {

        boolean trainerLoggedIn = true;

        while (trainerLoggedIn) {

            System.out.println(trainerScreenString());

            System.out.print("Vælg her: ");
            int input = Application.scanner.nextInt();
            Application.scanner.nextLine();

            switch(input) {

                //LIST OF COMPETITIONS:
                case 1:
                    // Lav bedre printing af Competitors på Competition. Evt Antal af Competitors
                    for (int i = 0; i < Register.listOfCompetitions.size(); i++) {
                        System.out.println(Register.listOfCompetitions.get(i));
                        System.out.println("Deltagere: ");
                        for (Competitor competitor : Register.listOfCompetitions.get(i).competitors) {
                            System.out.println(competitor.getName());
                            System.out.println(competitor.getMemberID());
                            System.out.println();
                        }

                    }
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
                -----------------------------
                Træner menu
                1. Liste af stævner
                2. Vis liste af konkurrencesvømmere
                3. Tilføj svømmer til stævne
                4. Træningsresultater
                0. Log ud
                """);
    }

    public static void addCompetitorToCompetition() {


        if (Register.listOfCompetitors.isEmpty()) {
            System.out.println("Der er ingen konkurrencesvømmere lige nu.");
            return;
        }

            System.out.println("Vælg konkurrencesvømmer:");
            RegisterSimplePrinter.printSimplifiedCompetitorList();
            System.out.println("------------------------");

            System.out.print("Vælg her (indtast ID): ");
            String CompetitorChoice = Application.scanner.nextLine();

            System.out.println("Tilføj " + RegisterManager.memberWithID(CompetitorChoice).getName() +
                    " til stævne:");

            RegisterSimplePrinter.printSimplifiedCompetitionsList();

            System.out.print("Vælg her (indtast ID): ");
            String CompetitionChoice = Application.scanner.nextLine();

            if (RegisterManager.memberWithID(CompetitorChoice) instanceof Competitor) { // se om kan optimeres senere
                    RegisterManager.competitionWithID(CompetitionChoice).addCompetitor((Competitor) RegisterManager.memberWithID(CompetitorChoice));
                }
            else {
                System.out.println("Du skal indtaste en konkurrencesvømmer.");
                return;
            }
            System.out.println(RegisterManager.memberWithID(CompetitorChoice).getName() + " er tilføjet til\nTitel: "
                    + RegisterManager.competitionWithID(CompetitionChoice).getTitle() + "\nDato: " +
                    RegisterManager.competitionWithID(CompetitionChoice).getDate());
            System.out.println();
    }
}