import java.time.LocalDate;

public class AM_CompetitionScreen {

    public static void competitionScreen(){

        boolean inCompetitionScreen = true;

        while (inCompetitionScreen) {
            System.out.println(competitionScreenString());

            System.out.print("Vælg her: ");
            int compInput = Application.scanner.nextInt();

            switch(compInput) {

                //ADD COMPETITION
                case 1:
                    createCompetition();
                    break;

                //EDIT COMPETITION
                case 2:
                    editCompetition();
                    break;

                //DELETE COMPETITION
                case 3:
                    deleteCompetition();
                    break;

                //SHOW COMPETITIONS
                case 4:
                    RegisterSimplePrinter.printSimplifiedCompetitionsList();
                    break;
                    //LOGOUT

                case 0:
                    inCompetitionScreen = false;
            }
        }
    }

    //METHODS BELOW

    public static void deleteCompetition() {
        //LOAD BEARING SCANNER NEXTLINE

        while (true) {

            if (Register.listOfCompetitions.isEmpty()) {
                System.out.println("Der er ingen Stævner at slette\n");
                return;

            } else {
                System.out.println("SLET STÆVNE:");
                System.out.println("------------------------------");
                System.out.println("Vælg stævne at slette:");

                for (int i = 0; i < Register.listOfCompetitions.size(); i++) {
                    System.out.println(i + " " + Register.listOfCompetitions.get(i).getTitle());
                }

                int Choice = Application.scanner.nextInt();
                String title = Register.listOfCompetitions.get(Choice).getTitle();
                Register.listOfCompetitions.remove(Choice);

                System.out.println(title + " er hermed slettet\n");
                break;
            }
        }
    }

    public static void editCompetition() {
        //LOADBEARING SCANNER
        while (true) {
            if (Register.listOfCompetitions.isEmpty()) {
                System.out.println("Der er ingen stævner at redigere\n");
                return;
            }

            System.out.println("Vælg stævne at redigere:");
            RegisterSimplePrinter.printSimplifiedCompetitionsList();
            System.out.print("Vælg her (indtast ID): ");
            String competitionID = Application.scanner.nextLine();

            if (!Register.listOfCompetitions.contains(competitionID)) {
                System.out.println("Kan ikke finde stævne med ID: " + competitionID);
                return;
            }

                System.out.println("""
                        Rediger
                        1. Titel
                        2. Dato 
                        0. Tilbage til Menu
                        
                    """);

            System.out.print("Vælg her: ");
            int choice = Application.scanner.nextInt();

            if (choice == 1) {
                System.out.println("Indtast ny titel på Stævne:");
                String newTitle = Application.scanner.nextLine();

                RegisterManager.competitionWithID(competitionID).setTitle(newTitle);
                System.out.println("Titlen på Stævnet er nu ændret\n");
                break;

            }

            else if (choice == 2) {
                System.out.println("Indtast ny dato i dette format: yyyy-mm-dd. eks: 2020-05-05");

                String unformattedDate = Application.scanner.nextLine();
                LocalDate compDate = LocalDate.parse(unformattedDate);

                RegisterManager.competitionWithID(competitionID).setDate(compDate);
                System.out.println("Datoen på Stævnet er nu ændret\n");
                break;
            }

        }

    }

    public static void createCompetition() {

        //LOAD BEARING SCANNER NEXTLINE
        Application.scanner.nextLine();

        System.out.println("OPRET STÆVNE:");
        System.out.println("------------------------------");
        System.out.println("Indtast titel på stævne:");
        String compTitle = Application.scanner.nextLine();

        System.out.println("Indtast dato for stævnet i dette format: yyyy-mm-dd. eks: 2020-05-05");

        String unformattedDate = Application.scanner.nextLine();
        LocalDate compDate = LocalDate.parse(unformattedDate);

        Competition competition = new Competition(compTitle, compDate);

        System.out.println("Stævnet '" + compTitle + "' er oprettet i systemet\n");

    }

    public static String competitionScreenString(){
        return String.format("""
                STÆVNER
                1. Opret stævne
                2. Rediger stævne
                3. Slet stævne
                4. Vis stævner
                0. Tilbage til menu
                """);
    }

}
