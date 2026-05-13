import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AdminScreen {
    //FOR METHODS RELATING TO THE ADMINISTRATORS SCREEN


    public static void adminScreen() {

        boolean adminLoggedIn = true;

        while(adminLoggedIn) {
            System.out.println(adminScreenString());

            int input = Application.scanner.nextInt();

            switch(input) {

                //MEMBERS
                case 1:
                    memberScreen();
                    break;

                //TRAINERS
                case 2:
                    trainerScreen();
                    break;

                //SWIMMING CATEGORIES
                case 3:
                    categoryScreen();
                    break;

                //COMPETITIONS
                case 4:
                    competitionScreen();
                    break;

                //NEW LOGIN
                case 5:
                    //ADD CODE HERE FOR CREATING NEW LOGIN

                //LOG OUT
                case 0:
                    adminLoggedIn = false;
            }
        }
    }

    //METHODS BELOW:

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

                //LOGOUT
                case 0:
                    inCompetitionScreen = false;
            }
        }
    }

    public static void categoryScreen(){

        boolean inCategoryScreen = true;
        System.out.println(categoryScreenString());

        while (inCategoryScreen) {

            int catInput = Application.scanner.nextInt();
            switch (catInput) {

                //ADD CATEGORY
                case 1:
                    createCategory();
                    break;

                //DELETE CATEGORY
                case 2:
                    deleteCategory();
                    break;

                //LOG OUT
                case 0:
                    inCategoryScreen = false;
            }
        }
    }

    public static void trainerScreen(){

        boolean inTrainerScreen = true;
        System.out.println(trainerScreenString());

        while(inTrainerScreen) {

            int trainerInput = Application.scanner.nextInt();
            switch (trainerInput) {

                //ADD TRAINER
                case 1:
                    createTrainer();
                    break;

                //DELETE TRAINER
                case 2:
                    //ADD CODE HERE
                    RegisterSimplePrinter.printSimplifiedTrainerList();
                    ASdeleteTrainer();
                    break;

                //EDIT TRAINER
                case 3:
                    //ADD CODE HERE

                //SHOW LIST OF TRAINER
                case 4:
                    RegisterSimplePrinter.printSimplifiedTrainerList();
                    break;

                //ASSIGN TRAINER TO SWIMMER
                case 5:
                    assignTrainerToCompetitor();
                    break;

                //LOGOUT
                case 0:
                    inTrainerScreen = false;
            }
        }
    }

    public static void memberScreen(){

        boolean inMemberScreen = true;
        System.out.println(memberScreenString());

        while(inMemberScreen) {

            int memberInput = Application.scanner.nextInt();

            switch (memberInput) {

                //ADD MEMBER
                case 1:
                    createMember();
                    break;

                //EDIT MEMBER INFO
                case 2:
                    //ADD CODE HERE

                //DELETE MEMBER
                case 3:
                    //ADD CODE HERE
                    RegisterSimplePrinter.printSimplifiedMemberList();
                    ASdeleteMember();
                    break;

                //SHOW MEMBERS
                case 4:
                    RegisterSimplePrinter.printSimplifiedMemberList();
                    break;
                //BACK TO MENU
                case 0:
                    inMemberScreen = false;

            }
        }
    }

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

    public static void assignTrainerToCompetitor() {
        //LOADBEARING SCANNER
        Application.scanner.nextLine();

        System.out.println("TILDEL TRÆNER TIL SVØMMER:");
        System.out.println("------------------------------");
        System.out.println("Vælg træner:");

        for (int i = 0; i < Register.listOfTrainers.size(); i++) {
            System.out.println(i + " " + Register.listOfTrainers.get(i).getName());
        }
        int trainerChoice = Application.scanner.nextInt();

        System.out.println("Tildel " + Register.listOfTrainers.get(trainerChoice).getName() + "til svømmer:");

        for (int i = 0; i < Register.listOfCompetitors.size(); i++) {
            System.out.println(i + " " + Register.listOfCompetitors.get(i).getName());
        }
        int swimmerChoice = Application.scanner.nextInt();
        String swimmerName = Register.listOfCompetitors.get(swimmerChoice).getName();

        Register.listOfCompetitors.get(swimmerChoice).setTrainer(Register.listOfTrainers.get(trainerChoice));

        System.out.println(Register.listOfTrainers.get(trainerChoice).getName() + " er tildelt som træner til " +
                swimmerName);

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

    public static void createCategory() {
        //LOAD BEARING SCANNER NEXTLINE
        Application.scanner.nextLine();

        System.out.println("OPRET SVØMMEDISCIPLIN:");
        System.out.println("------------------------------");
        System.out.println("Indtast navn på disciplin:");

        String title = Application.scanner.nextLine();
        SwimmingCategory swimmingCategory = new SwimmingCategory(title);
    }

    public static void deleteCategory() {
        //LOAD BEARING SCANNER NEXTLINE
        Application.scanner.nextLine();

        System.out.println("SLET SVØMMEDISCIPLIN:");
        System.out.println("------------------------------");
        System.out.println("Vælg disciplin at slette:");

        for (int i = 0; i < Register.listOfCategories.size(); i++) {
            System.out.println(i + " " + Register.listOfCategories.get(i).getTitle());
        }

        int Choice = Application.scanner.nextInt();
        String title = Register.listOfCategories.get(Choice).getTitle();
        Register.listOfCategories.remove(Choice);

        System.out.println(title + " er hermed slettet");
    }

    public static void createMember() {

        //LOAD BEARING SCANNER NEXTLINE
        Application.scanner.nextLine();

        System.out.println("OPRET MEDLEM:");
        System.out.println("------------------------------");
        System.out.println("Indtast medlemmets navn (*):");

        String name = Application.scanner.nextLine();

        System.out.println("Medlemmets alder (valgfrit):"); // TO-DO: gør valgfri
        int age = Application.scanner.nextInt();
        Application.scanner.nextLine();

        System.out.println("Medlemmets adresse (valgfrit):");
        String address = Application.scanner.nextLine();

        System.out.println("Medlemmets postnummer (valgfrit):");
        String postalcode = Application.scanner.nextLine();

        System.out.println("Medlemmets telefonnummer (*):");
        String phone = Application.scanner.nextLine();

        System.out.println("Medlemmets email (valgfrit):");
        String email = Application.scanner.nextLine();

        System.out.println("Køn (valgfrit) - 1: kvinde, 2: mand, 3: ikke binær, 4: akønnet ");
        Gender gender = null;
        int genderChoice = Application.scanner.nextInt();
        if (genderChoice == 1) {
            gender = Gender.FEMALE;
        } else if (genderChoice == 2) {
            gender = Gender.MALE;
        } else if (genderChoice == 3) {
            gender = Gender.NONBINARY;
        } else if (genderChoice == 4) {
            gender = Gender.AGENDER;
        }

        System.out.println("Passivt medlemskab? ja/nej");
        Membership membership = null;
        String answer = Application.scanner.next();

        if(answer.equals("ja")) {
            membership = Membership.PASSIVE;
        }
         else if (age > 18) {
            membership = Membership.SENIOR;
        } else membership = Membership.JUNIOR;

         // FIND MÅDE AT LAVE MEMBERS UD FRA KUN NAVN OG TELEFONNUMMER

        Member member = new Member(name, age, address, postalcode, phone, email, gender, membership);
        System.out.println("Medlem " + name + " er oprettet i systemet");
    }

    public static void createTrainer() {

        //LOAD BEARING SCANNER NEXTLINE
        Application.scanner.nextLine();

        System.out.println("OPRET TRÆNER:");
        System.out.println("------------------------------");
        System.out.println("Indtast trænerens navn:");

        String name = Application.scanner.nextLine();

        System.out.println("Trænerens alder:");
        int age = Application.scanner.nextInt();
        Application.scanner.nextLine();

        System.out.println("Trænerens adresse:");
        String address = Application.scanner.nextLine();

        System.out.println("Trænerens postnummer:");
        String postalcode = Application.scanner.nextLine();

        System.out.println("Trænerens telefonnummer:");
        String phone = Application.scanner.nextLine();

        System.out.println("Trænerens email:");
        String email = Application.scanner.nextLine();

        System.out.println("Køn - 1: kvinde, 2: mand, 3: ikke binær, 4: akønnet");
        Gender gender = null;
        int genderChoice = Application.scanner.nextInt();
            if (genderChoice == 1) {
                gender = Gender.FEMALE;
            } else if (genderChoice == 2) {
                gender = Gender.MALE;
            } else if (genderChoice == 3) {
                gender = Gender.NONBINARY;
            } else if (genderChoice == 4) {
                gender = Gender.AGENDER;
            }

        Trainer trainer = new Trainer(name, age, address, postalcode, phone, email, gender);
        System.out.println("Træneren " + name + " er oprettet i systemet");
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

    //STRINGS BELOW:
    public static String adminScreenString(){
        return String.format("""
                -----------------------------
                Administrator menu
                1. Medlemmer
                2. Trænere
                3. Svømmediscipliner
                4. Stævner
                5. Opret nyt login
                0. Log ud
                """);
    }

    public static String memberScreenString(){
        return String.format("""
                MEDLEMMER
                1. Tilføj medlem
                2. Rediger medlemsinformation
                3. Slet medlem
                4. Vis aktive medlemmer
                0. Tilbage til menu
                """);
    }

    public static String trainerScreenString(){
        return String.format("""
                TRÆNERE
                1. Opret træner
                2. Slet træner
                3. Rediger trænerinformation
                4. Vis liste af trænere
                5. Tilknyt træner til svømmer
                0. Tilbage til menu
                """);
    }

    public static String categoryScreenString() {
        return String.format("""
                SVØMMEDISCIPLINER
                1. Opret disciplin
                2. Slet disciplin
                0. Tilbage til menu
                """);
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

    public static void ASdeleteMember() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Delete member at: ");
        int deleteAtIndex = Integer.parseInt(scanner.nextLine());
        RegisterManager.removeMemberAt(deleteAtIndex);
    }

    public static void ASdeleteTrainer() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Delete trainer at: ");
        int deleteAtIndex = Integer.parseInt(scanner.nextLine());
        RegisterManager.deleteTrainer(deleteAtIndex);
    }

}
