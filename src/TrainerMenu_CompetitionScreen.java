public class TrainerMenu_CompetitionScreen {

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

    public static String comptetitionMenuString(){
        return String.format("""
                STÆVNER
                1. Vis kommende
                2. Vis tidligere
                0. Tilbage til menu
                """);
    }
}
