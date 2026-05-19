package menus.trainerMenu;

import menus.Application;
import register.*;
import members.*;

import static menus.Application.scanner;

public class TrainerMenu {
    //FOR METHODS RELATING TO THE TRAINERS SCREEN

    public static void trainerScreen() {

        boolean trainerLoggedIn = true;

        while (trainerLoggedIn) {

            System.out.println(trainerScreenString());

            System.out.print("Vælg her: ");

            while (!scanner.hasNextInt()) {
                System.out.println("indtast et tal");
                scanner.next();
            }
            // check om det står det rigtig sted

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
        System.out.print("Vælg her: ");
        Application.scanner.nextLine();
        if (Register.getListOfCompetitors().isEmpty()) {
            System.out.println("Der er ingen konkurrencesvømmere lige nu. Opret først.");
            return;
        }
        else {

            System.out.println("Vælg konkurrencesvømmer:");
            RegisterSimplePrinter.printSimplifiedCompetitorList();
            int CompetitorChoice = Application.scanner.nextInt();
            Application.scanner.nextLine();

            System.out.println("Tilføj " + Register.getListOfCompetitors().get(CompetitorChoice).getName() +
                    " til stævne:");

            RegisterSimplePrinter.printSimplifiedCompetitionsList();
            int CompetitionChoice = Application.scanner.nextInt();
            Register.listOfCompetitions.get(CompetitionChoice).addCompetitor(Register.getListOfCompetitors().get(CompetitorChoice));

            System.out.println(Register.getListOfCompetitors().get(CompetitorChoice).getName() + " er tilføjet til "
                    + Register.listOfCompetitions.get(CompetitionChoice).getTitle());

        }
    }
}