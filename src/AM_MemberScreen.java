import java.util.ArrayList;
import java.util.Scanner;

public class AM_MemberScreen {


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
                    editMember();
                    break;

                    //DELETE MEMBER
                case 3:
                    deleteMember();
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


    //METHODS BELOW

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

        System.out.println("Medlemmets telefonnummer:");
        String phone = Application.scanner.nextLine();

        System.out.println("Køn - 1: kvinde, 2: mand, 3: ikke binær, 4: akønnet ");
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

        //LOADBEARING SCANNER
        Application.scanner.nextLine();

        System.out.println("Passivt medlemskab? ja/nej");
        Boolean passiveMember = false;
        String passiveChoice = Application.scanner.nextLine();

        if (passiveChoice.equals("ja")) {
            passiveMember = true;
        }

        //Actual constructors:
        if (passiveMember) {
            new MemberPassive(name, age, phone, gender);
        } else {
            new MemberCasual(name, age, phone, gender);
        }

        System.out.println(name + " er oprettet som medlem");
    }

    public static void editMember() {

        //LOAD BEARING SCANNER NEXTLINE
        Application.scanner.nextLine();

        System.out.println("REDIGER MEDLEM");
        System.out.println("------------------------------");
        System.out.println("Vælg medlem at Redigere (indtast memberID)");

        RegisterSimplePrinter.printSimplifiedMemberList();
        String ID = Application.scanner.nextLine();

        System.out.printf("""
                Ændr:
                1. navn
                2. alder
                3. tlf
                4. køn
                5. medlemstype
                0. Tilbage til menu
                """);

        int choice = Application.scanner.nextInt();
        Application.scanner.nextLine();

        switch (choice) {

            //NAME
            case 1:
                System.out.println("Indtast nyt navn:");
                String name = Application.scanner.nextLine();
                RegisterManager.memberWithID(ID).setName(name);
                break;

            //AGE
            case 2:
                System.out.println("Indtast ny alder:");
                int age = Application.scanner.nextInt();
                Application.scanner.nextLine();
                RegisterManager.memberWithID(ID).setAge(age);
                break;

            //PHONE
            case 3:
                System.out.println("Indtast nyt tlfnummer:");
                String phone = Application.scanner.nextLine();
                RegisterManager.memberWithID(ID).setPhone(phone);
                break;

            //GENDER
            case 4:
                System.out.println("Nyt Køn - 1: kvinde, 2: mand, 3: ikke binær, 4: akønnet ");
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
                RegisterManager.memberWithID(ID).setGender(gender);
                break;

            //MEMBERSHIP
            case 5:
                //CODE TBA

            //BACK TO MENU
            case 6:
                break;
        }

    }

    public static void deleteMember() {

        //LOAD BEARING SCANNER NEXTLINE
        Application.scanner.nextLine();

        System.out.println("SLET MEDLEM");
        System.out.println("------------------------------");
        System.out.println("Vælg medlem at slette (indtast memberID)");

        RegisterSimplePrinter.printSimplifiedMemberList();

        String ID = Application.scanner.nextLine();

        String name = String.join(" ", RegisterManager.memberWithID(ID).getName());


        System.out.println("Er du sikker på at du vil slette " + name + "? \n(ja/nej): ");
        String answer = Application.scanner.nextLine();
         if (answer.equalsIgnoreCase("ja")) {
             RegisterManager.removeMember(RegisterManager.memberWithID(ID));
             System.out.println(name + " er blevet slettet fra systemet");
         }


    }

    // MEMBERSHIP CHANGER - NEEDS FUNCTIONALITY FROM REGISTER TO WORK
/*
    public static void membershipChanger(String ID) {

        if (Register.listOfPassiveMembers.contains(RegisterManager.memberWithID(ID))) {

            System.out.printf("""
                    Skift fra Passivt medlem til:
                    1. Standard medlem
                    2. Konkurrencesvømmer
                    0. Afbryd
                    """);
            int choice = Application.scanner.nextInt();
            Application.scanner.nextLine();

            if (choice == 1) {
                new MemberCasual(RegisterManager.memberWithID(ID));
            }

        } else if (Register.listOfCasualMembers.contains(RegisterManager.memberWithID(ID))) {

            System.out.printf("""
                    Skift fra Standard medlem til:
                    1. Passivt medlem
                    2. Konkurrencesvømmer
                    0. Afbryd
                    """);

        } else {

            System.out.printf("""
                    Skift fra Konkurrencesvømmer til:
                    1. Passivt medlem
                    2. Standard medlem
                    0. Afbryd
                    """);
        }


    }
    */


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
}
