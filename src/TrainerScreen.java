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
                break;


                //LIST OF COMPETITORS
                case 2:
                    //SHOW LIST OF COMPETITORS
                        printSimplifiedCompetitorList();
                    break;


                //ADD CATEGORY TO SWIMMER
                case 3:
                    addCategoryToCompetitor();
                    break;

                //ADD SWIMMER TO COMPETITION
                case 4:
                    addCompetitorToCompetition();
                    break;

                // TRAINING RESULTS
                case 5:
                    trainingResultScreen();
                    break;

                //COMPETITION RESULTS
                case 6:
                    competitionResultScreen();
                    break;

                //LOG OUT
                case 0:
                trainerLoggedIn = false;
            }
        }
    }

    //METHODS BELOW:

    public static void competitionResultScreen() {

        boolean inCompResults = true;
        System.out.println(competitionResultScreenString());

        while (inCompResults) {
            int compInput = Application.scanner.nextInt();

            switch(compInput) {

                //SHOW COMPETITION RESULTS
                case 1:
                    //ADD CODE HERE

                //ENTER COMPETITION RESULT
                case 2:
                    //ADD CODE HERE

                //LOGOUT
                case 0:
                    inCompResults = false;
            }
        }
    }


    public static void trainingResultScreen() {

        boolean inResultScreen = true;
        System.out.println(trainingResultsScreenString());

        while (inResultScreen) {
            int resultInput = Application.scanner.nextInt();

            switch(resultInput) {

                //RESULTS BASED ON CATEGORY
                case 1:
                    // ADD CODE

                //MEMBER RESULTS
                case 2:
                    // ADD CODE

                //ENTER RESULT FOR MEMBER
                case 3:
                    //ADD CODE

                //LOGOUT
                case 0:
                    inResultScreen = false;
            }
        }

    }


    public static void competitionMenu() {

        boolean inCompetitionMenu = true;
        System.out.println(comptetitionMenuString());

        while (inCompetitionMenu) {
            int compInput = Application.scanner.nextInt();

            switch(compInput) {

                //UPCOMING COMPETITIONS
                case 1:
                    //SHOW UPCOMING COMPETITIONS

                //FORMER COMPETITIONS
                case 2:
                    //METHOD SHOWING FORMER COMPETITIONS

                //BACK TO MENU
                case 0:
                    inCompetitionMenu = false;
            }
        }
    }
/*
    public static void showMemberTrainingResults(){
        AdminScreen.printSimplifiedMemberList();
        for (int i = 0; i < Register.listOfMembers.size(); i++) {
            System.out.println(i + " " + Register.listOfMembers.get(i).getName() + " Resultat: "
             + Register.listOfMembers.get(i).get);
        }

    }

 */

    public static void addCategoryToCompetitor() {
        //Loadbearing scanner nextline
        Application.scanner.nextLine();

        System.out.println("Vælg konkurrencesvømmer:");
        printSimplifiedCompetitorList();
        int competitorChoice = Application.scanner.nextInt();

        System.out.println("Vælg svømmedisciplin at tilføje til " +
                Register.listOfCompetitors.get(competitorChoice).getName());

        for (int i = 0; i < Register.listOfCategories.size(); i++) {
            System.out.println(i + " " + Register.listOfCategories.get(i).getTitle());
        }
        int categoryChoice = Application.scanner.nextInt();

        Register.listOfCompetitors.get(competitorChoice).addSwimmingCategory(Register.listOfCategories.get(categoryChoice));
        
        System.out.println(Register.listOfCompetitors.get(competitorChoice).getName() + " har tilføjet " +
                Register.listOfCategories.get(categoryChoice).getTitle() + " til deres profil");

    }

    public static void addCompetitorToCompetition() {

        //Loadbearing scanner nextline
        Application.scanner.nextLine();

        System.out.println("Vælg konkurrencesvømmer:");
        printSimplifiedCompetitorList();
        int CompetitorChoice = Application.scanner.nextInt();

        System.out.println("Tilføj " + Register.listOfCompetitors.get(CompetitorChoice).getName() +
                " til stævne:");

        printSimplifiedCompetitionList();
        int CompetitionChoice = Application.scanner.nextInt();
        Register.listOfCompetitions.get(CompetitionChoice).addCompetitor(Register.listOfCompetitors.get(CompetitorChoice));

        System.out.println(Register.listOfCompetitors.get(CompetitorChoice).getName() + " er tilføjet til "
        + Register.listOfCompetitions.get(CompetitionChoice).getTitle());

    }

    public static void printSimplifiedCompetitorList() {
        for (int i = 0; i < Register.listOfCompetitors.size(); i++) {
            System.out.println(i + " " + Register.listOfCompetitors.get(i).getName());
        }

    }

    public static void printSimplifiedCompetitionList() {
        for (int i = 0; i < Register.listOfCompetitions.size(); i++) {
            System.out.println(i + " " + Register.listOfCompetitions.get(i).getTitle());
        }
    }


//RANDOM ASS STRINGS:

    public static String competitionResultScreenString() {
        return String.format("""
                STÆVNERESULTATER
                1. Vis resultat for stævne
                2. Indtast stævneresultat
                0. Tilbage til menu
                """);
    }

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

    public static String trainingResultsScreenString() {
        return String.format("""
                TRÆNINGSRESULTATER
                1. Vis resultater baseret på disciplin
                2. Vis medlems resultater
                3. Indtast træningsresultat for medlem
                0. Tilbage til menu
                """);
    }
}