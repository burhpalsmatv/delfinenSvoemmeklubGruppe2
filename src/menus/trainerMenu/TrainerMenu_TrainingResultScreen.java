package menus.trainerMenu;
import members.Competitor;
import menus.*;
import register.*;
import enums.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

import static register.RegisterSimplePrinter.printPR;

public class TrainerMenu_TrainingResultScreen {

    public static void trainingResultScreen() {

        boolean inResultScreen = true;

        while (inResultScreen) {
            System.out.println(trainingResultsScreenString());

            System.out.print("Vælg her: ");
            int resultInput = Application.scanner.nextInt();

            switch(resultInput) {

                //RESULTS BASED ON CATEGORY
                case 1:
                    showResultsBasedOnCategory();
                    break;

                case 2:
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

        System.out.print("Vælg her (indtast ID): ");
        String CompetitorChoice = Application.scanner.nextLine();

        System.out.println("Vælg disciplin for resultat: ");
        int counter = 1;
        for (SwimmingCategory category : SwimmingCategory.values()) {
            System.out.println(counter + " " + category);
            counter ++;
        }

        System.out.print("Vælg her: ");
        int CategoryChoice = Application.scanner.nextInt();
        Application.scanner.nextLine();

        Competitor chosen = RegisterManager.competitorWithID(CompetitorChoice);

        if (CategoryChoice == 1) {
            System.out.println("Indtast svømmerens rekord for BUTTERFLY i formatet: minutter + sekunder:");

            System.out.print("Minutter: ");
            int minutes = Application.scanner.nextInt();
            Application.scanner.nextLine();

            System.out.print("Sekunder: ");
            int seconds = Application.scanner.nextInt();
            Application.scanner.nextLine();

            chosen.setPR_butterfly(minutes, seconds);

        } else if (CategoryChoice == 2) {
            System.out.println("Indtast svømmerens tid for CRAWL i formatet: minutter + sekunder:");
            System.out.println("Minutter:");
            int minutes = Application.scanner.nextInt();
            Application.scanner.nextLine();
            System.out.println("Sekunder:");
            int seconds = Application.scanner.nextInt();

            chosen.setPR_crawl(minutes, seconds);

        } else if (CategoryChoice == 3) {
            System.out.println("Indtast svømmerens tid for BACKCRAWL i formatet: minutter + sekunder:");
            System.out.println("Minutter:");
            int minutes = Application.scanner.nextInt();
            Application.scanner.nextLine();
            System.out.println("Sekunder:");
            int seconds = Application.scanner.nextInt();

            chosen.setPR_back_crawl(minutes, seconds);

        } else if (CategoryChoice == 4) {
            System.out.println("Indtast svømmerens tid for BREASTSTROKE i formatet: minutter + sekunder:");
            System.out.println("Minutter:");
            int minutes = Application.scanner.nextInt();
            Application.scanner.nextLine();
            System.out.println("Sekunder:");
            int seconds = Application.scanner.nextInt();

            chosen.setPR_breast(minutes, seconds);
        }
    }

    public static void showResultsBasedOnCategory() {
        //LOADBEARING SCANNER NEXTLINE
        Application.scanner.nextLine();

        System.out.println("RESULTATER BASERET PÅ DISCIPLIN");
        System.out.println("------------------------------");
        System.out.println("Vælg disciplin: 1. Butterfly, 2. Crawl, 3. Backcrawl, 4. Brystsvømning");

        int CategoryChoice = Application.scanner.nextInt();
        Application.scanner.nextLine();

        if (CategoryChoice == 1) {
            //BUTTERFLY);
            Collections.sort(Register.getListOfCompetitors(), Application.comparatorButterfly);

            for (int i = 0; i < Register.getListOfCompetitors().size(); i++) {
                String text = "";
                text += String.format("""
                        Navn: %s
                        Medlems-ID: %s
                        Medlemskab: %s
                        Butterfly rekord: %s
                        """,
                        Register.getListOfCompetitors().get(i).getName(),
                        Register.getListOfCompetitors().get(i).getMemberID(),
                        Register.getListOfCompetitors().get(i).getMembership(),
                        printPR(Register.getListOfCompetitors().get(i).getPR_butterfly()));

                System.out.println(text);
            }
        } else if (CategoryChoice == 2) {
            //CRAWL);
            Collections.sort(Register.getListOfCompetitors(), Application.comparatorCrawl);

            for (int i = 0; i < Register.getListOfCompetitors().size(); i++) {
                String text = "";
                text += String.format("""
                        Navn: %s
                        Medlems-ID: %s
                        Medlemskab: %s
                        Crawl rekord: %s
                        """,
                        Register.getListOfCompetitors().get(i).getName(),
                        Register.getListOfCompetitors().get(i).getMemberID(),
                        Register.getListOfCompetitors().get(i).getMembership(),
                        printPR(Register.getListOfCompetitors().get(i).getPR_crawl()));

                System.out.println(text);
            }
        } else if (CategoryChoice == 3) {
            //BACKCRAWL);
            Collections.sort(Register.getListOfCompetitors(), Application.comparatorBackCrawl);

            for (int i = 0; i < Register.getListOfCompetitors().size(); i++) {
                String text = "";
                text += String.format("""
                        Navn: %s
                        Medlems-ID: %s
                        Medlemskab: %s
                        Backcrawl rekord: %s
                        """,
                        Register.getListOfCompetitors().get(i).getName(),
                        Register.getListOfCompetitors().get(i).getMemberID(),
                        Register.getListOfCompetitors().get(i).getMembership(),
                        printPR(Register.getListOfCompetitors().get(i).getPR_back_crawl()));

                System.out.println(text);
            }
        } else if (CategoryChoice == 4) {
            //BREASTSTROKE);
            Collections.sort(Register.getListOfCompetitors(), Application.comparatorBreast);

            for (int i = 0; i < Register.getListOfCompetitors().size(); i++) {
                String text = "";
                text += String.format("""
                        Navn: %s
                        Medlems-ID: %s
                        Medlemskab: %s
                        Brystsvømning rekord: %s
                        """,
                        Register.getListOfCompetitors().get(i).getName(),
                        Register.getListOfCompetitors().get(i).getMemberID(),
                        Register.getListOfCompetitors().get(i).getMembership(),
                        printPR(Register.getListOfCompetitors().get(i).getPR_breast()));

                System.out.println(text);
            }
        }
    }

    public static String trainingResultsScreenString() {
        return String.format("""
                TRÆNINGSRESULTATER
                1. Vis top 5 resultater baseret på disciplin
                2. Indtast træningsresultat for medlem
                0. Tilbage til menu
                """);
    }
}