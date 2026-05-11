import javax.sound.midi.Soundbank;
import java.sql.Date;
import java.sql.SQLOutput;
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

                //EDIT COMPETITION
                case 2:
                    //ADD CODE HERE

                //DELETE COMPETITION
                case 3:
                    //ADD CODE HERE

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
                    //ADD CODE HERE

                //DELETE CATEGORY
                case 2:
                    //ADD CODE HERE

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

                //DELETE TRAINER
                case 2:
                    //ADD CODE HERE

                //EDIT TRAINER
                case 3:
                    //ADD CODE HERE

                //SHOW LIST OF TRAINER
                case 4:
                    //ADD CODE HERE

                //ASSIGN TRAINER TO SWIMMER
                case 5:
                    //ADD CODE HERE

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

                //EDIT MEMBER INFO
                case 2:
                    //ADD CODE HERE

                //DELETE MEMBER
                case 3:
                    //ADD CODE HERE

                //SHOW MEMBERS
                case 4:
                    //ADD CODE HERE

                //BACK TO MENU
                case 0:
                    inMemberScreen = false;

            }
        }
    }

    public static void createMember() {

        //LOAD BEARING SCANNER NEXTLINE
        Application.scanner.nextLine();

        System.out.println("OPRET MEDLEM:");
        System.out.println("------------------------------");
        System.out.println("Indtast medlemmets navn:");

        String name = Application.scanner.nextLine();

        System.out.println("Medlemmets alder:");
        int age = Application.scanner.nextInt();
        Application.scanner.nextLine();

        System.out.println("Medlemmets adresse:");
        String address = Application.scanner.nextLine();

        System.out.println("Medlemmets postnummer:");
        String postalcode = Application.scanner.nextLine();

        System.out.println("Medlemmets telefonnummer:");
        String phone = Application.scanner.nextLine();

        System.out.println("Medlemmets email:");
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

        System.out.println("Passivt medlemskab? ja/nej");
        Membership membership = null;
        String answer = Application.scanner.next();
        if(answer.equals("ja")) {
            membership = Membership.PASSIVE;
        }
         else if (age > 18) {
            membership = Membership.SENIOR;
        } else membership = Membership.JUNIOR;

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
}
