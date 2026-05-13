import java.time.LocalDate;

public class AM_CompetitionScreen {

    public static void competitionScreen(){

        boolean inCompetitionScreen = true;
        System.out.println(competitionScreenString());

        while (inCompetitionScreen) {

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
                    //ADD CODE HERE

                    //LOGOUT
                case 0:
                    inCompetitionScreen = false;
            }
        }
    }


    //METHODS BELOW

    public static void deleteCompetition() {
        //LOAD BEARING SCANNER NEXTLINE
        Application.scanner.nextLine();

        System.out.println("SLET STÆVNE:");
        System.out.println("------------------------------");
        System.out.println("Vælg stævne at slette:");

        for (int i = 0; i < Register.listOfCompetitions.size(); i++) {
            System.out.println(i + " " + Register.listOfCompetitions.get(i).getTitle());
        }

        int Choice = Application.scanner.nextInt();
        String title = Register.listOfCompetitions.get(Choice).getTitle();
        Register.listOfCompetitions.remove(Choice);

        System.out.println(title + " er hermed slettet");
    }

    public static void editCompetition() {
        //LOADBEARING SCANNER
        Application.scanner.nextLine();

        System.out.println("REDIGÉR STÆVNE:");
        System.out.println("------------------------------");
        System.out.println("Vælg stævne at redigere:");

        for (int i = 0; i < Register.listOfCompetitions.size(); i++) {
            System.out.println(i + " " + Register.listOfCompetitions.get(i).getTitle());
        }
        int competitionChoice = Application.scanner.nextInt();

        System.out.println(Register.listOfCompetitions.get(competitionChoice));

        System.out.println("Rediger: 1. Titel, 2. Dato, 0. Tilbage til Menu");
        int choice = Application.scanner.nextInt();
        //LOAD BEARING SCANNERLINE BELOW
        Application.scanner.nextLine();
        if (choice == 1) {
            System.out.println("Indtast ny titel på stævne:");
            String newTitle = Application.scanner.nextLine();

            Register.listOfCompetitions.get(competitionChoice).setTitle(newTitle);
            System.out.println("Titlen på stævnet er ændret");
        } else if (choice == 2) {
            System.out.println("Indtast ny dato i dette format: yyyy-mm-dd. eks: 2020-05-05");

            String unformattedDate = Application.scanner.nextLine();
            LocalDate compDate = LocalDate.parse(unformattedDate);
            Register.listOfCompetitions.get(competitionChoice).setDate(compDate);
            System.out.println("Datoen på stævnet er ændret");
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

        System.out.println("Stævnet " + compTitle + " er oprettet i systemet");

    }

    public static String competitionScreenString(){
        return String.format("""
                STÆVNER
                1. Opret stævne
                2. Rediger stævne
                3. Slet stævne
                0. Tilbage til menu
                """);
    }

}
