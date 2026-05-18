package menus.trainerMenu;

import enums.SwimmingCategory;
import menus.Application;
import org.w3c.dom.ls.LSOutput;
import register.Register;
import register.RegisterSimplePrinter;

import static menus.Application.scanner;

public class TrainerMenu_TrainingResultScreen {

    public static void trainingResultScreen() {

        boolean inResultScreen = true;
        System.out.println(trainingResultsScreenString());

        while (inResultScreen) {
            int resultInput = Application.scanner.nextInt();

            while (!scanner.hasNextInt()) {
                System.out.println("indtast et tal");
                scanner.next();
            }
            // check om det står det rigtig sted

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
            System.out.println("Indtast svømmerens rekord for BUTTERFLY i formatet: minutter + sekunder:");
            System.out.println("Minutter:");
            int minutes = Application.scanner.nextInt();
            Application.scanner.nextLine();
            System.out.println("Sekunder:");
            int seconds = Application.scanner.nextInt();

            Register.getListOfCompetitors().get(CompetitorChoice).setPR_butterfly(minutes, seconds);

        } else if (CategoryChoice == 2) {
            System.out.println("Indtast svømmerens tid for CRAWL i formatet: minutter + sekunder:");
            System.out.println("Minutter:");
            int minutes = Application.scanner.nextInt();
            Application.scanner.nextLine();
            System.out.println("Sekunder:");
            int seconds = Application.scanner.nextInt();

            Register.getListOfCompetitors().get(CompetitorChoice).setPR_crawl(minutes, seconds);
        } else if (CategoryChoice == 3) {
            System.out.println("Indtast svømmerens tid for BACKCRAWL i formatet: minutter + sekunder:");
            System.out.println("Minutter:");
            int minutes = Application.scanner.nextInt();
            Application.scanner.nextLine();
            System.out.println("Sekunder:");
            int seconds = Application.scanner.nextInt();

            Register.getListOfCompetitors().get(CompetitorChoice).setPR_back_crawl(minutes, seconds);
        } else if (CategoryChoice == 4) {
            System.out.println("Indtast svømmerens tid for BREASTSTROKE i formatet: minutter + sekunder:");
            System.out.println("Minutter:");
            int minutes = Application.scanner.nextInt();
            Application.scanner.nextLine();
            System.out.println("Sekunder:");
            int seconds = Application.scanner.nextInt();

            Register.getListOfCompetitors().get(CompetitorChoice).setPR_breast(minutes, seconds);
        }
    }

    public static void showResultsBasedOnCategory() {
        //LOADBEARING SCANNER NEXTLINE
        Application.scanner.nextLine();

        System.out.println("RESULTATER BASERET PÅ DISCIPLIN");
        System.out.println("------------------------------");
        System.out.println("Vælg disciplin: 1. Butterfly, 2. Crawl, 3. Backcrawl, 4. Brystsvømning");
        RegisterSimplePrinter.printSimplifiedTrainerList();

        int CategoryChoice = Application.scanner.nextInt();
        Application.scanner.nextLine();

        if (CategoryChoice == 1) {
            //BUTTERFLY);
        } else if (CategoryChoice == 2) {
            //CRAWL);
        } else if (CategoryChoice == 3) {
            //BACKCRAWL);
        } else if (CategoryChoice == 4) {
            //BREASTSTROKE);
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
