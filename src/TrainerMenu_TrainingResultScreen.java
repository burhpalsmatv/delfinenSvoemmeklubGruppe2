public class TrainerMenu_TrainingResultScreen {

    public static void trainingResultScreen() {

        boolean inResultScreen = true;
        System.out.println(trainingResultsScreenString());

        while (inResultScreen) {
            int resultInput = Application.scanner.nextInt();

            switch(resultInput) {

                //RESULTS BASED ON CATEGORY
                case 1:
                    // ADD CODE

                    //MEMBER RESULTS (TOP 5?)
                case 2:
                    // ADD CODE

                    //ENTER RESULT FOR MEMBER
                case 3:
                    assignResultToCompetitor();
                    break;

                    //LOGOUT
                case 0:
                    inResultScreen = false;
            }
        }
    }

    public static void assignResultToCompetitor () {
        //LOAD BEARING SCANNER NEXTLINE
        Application.scanner.nextLine();

        System.out.println("TILFØJ NY PERSONLIG REKORD TIL SVØMMER");
        System.out.println("------------------------------");
        System.out.println("Vælg svømmer:");

        RegisterSimplePrinter.printSimplifiedCompetitorList();
        int CompetitorChoice = Application.scanner.nextInt();
        Application.scanner.nextLine();

        System.out.println("Vælg disciplin for resultat: (0 for at gå tilbage til menu)");

        int counter = 1;
        for (SwimmingCategory category : SwimmingCategory.values()) {
            System.out.println(counter + " " + category);
            counter ++;
        }
        int CategoryChoice = Application.scanner.nextInt();
        Application.scanner.nextLine();

        if (CategoryChoice == 1) {
            System.out.println("Indtast svømmerens rekord for BUTTERFLY i formatet: minutter.sekunder (eks. 2.35)");
            String result = Application.scanner.nextLine();
            Register.listOfCompetitors.get(CompetitorChoice).setPR_butterfly(result);
        } else if (CategoryChoice == 2) {
            System.out.println("Indtast svømmerens tid for CRAWL i formatet: minutter.sekunder (eks. 2.35)");
            String result = Application.scanner.nextLine();
            Register.listOfCompetitors.get(CompetitorChoice).setPR_crawl(result);
        } else if (CategoryChoice == 3) {
            System.out.println("Indtast svømmerens tid for BACKCRAWL i formatet: minutter.sekunder (eks. 2.35)");
            String result = Application.scanner.nextLine();
            Register.listOfCompetitors.get(CompetitorChoice).setPR_back_crawl(result);
        } else if (CategoryChoice == 4) {
            System.out.println("Indtast svømmerens tid for BREASTSTROKE i formatet: minutter.sekunder (eks. 2.35)");
            String result = Application.scanner.nextLine();
            Register.listOfCompetitors.get(CompetitorChoice).setPR_breast(result);
        }
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
