package menus.adminMenu;

import enums.Gender;
import members.*;
import menus.Application;
import Register.*;

public class AM_MemberScreen {

    public static void memberScreen(){

        boolean inMemberScreen = true;

        while(inMemberScreen) {

            System.out.println(memberScreenString());
            System.out.print("Vælg: ");
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

        System.out.println(name + " er oprettet som medlem\n");
    }

    // Dont touch anything in here.
    // It works.
    public static void editMember() {

        boolean editMemberRunning = true;
        while (editMemberRunning) {
            if (Register.getListOfMembers().isEmpty()) {
                System.out.println("Der er ingen medlemmer at redigere lige nu\n");
                return;

            } else {
                if (editMemberRunning == true) {
                    //LOAD BEARING SCANNER NEXTLINE
                    Application.scanner.nextLine();

                    System.out.println("REDIGER MEDLEM");
                    System.out.println("------------------------------");
                    System.out.println("Vælg medlem at Redigere \n");

                    RegisterSimplePrinter.printSimplifiedMemberList();

                    String ID = "";

                    while (true) {
                            System.out.print("Indtast her (memberID): ");
                            ID = Application.scanner.nextLine();
                            if (!Register.getListOfMembers().contains(RegisterManager.memberWithID(ID))) {
                                System.out.println("Kan ikke finde medlem med ID " + ID + " i medlemsliste. \nPrøv igen.\n");
                            } else {
                                break;
                            }

                    }

                    System.out.printf("""
                            
                            Ændr:
                            1. Navn
                            2. Alder
                            3. Telefonnummer
                            4. Køn
                            5. Medlemstype (Passiv, Normalt, Konkurrencesvømmer)
                            0. Tilbage til menu
                            """);

                    System.out.print("\nVælg her: ");
                    int choice = Application.scanner.nextInt();
                    Application.scanner.nextLine();

                    switch (choice) {

                        //NAME
                        case 1:
                            System.out.println("Indtast nyt navn:");
                            String name = Application.scanner.nextLine();
                            RegisterManager.memberWithID(ID).setName(name);
                            System.out.println("Medlem " + RegisterManager.memberWithID(ID).getName() + " er nu ændret.");
                            return;

                        //AGE
                        case 2:
                            System.out.println("Indtast ny alder:");
                            int age = Application.scanner.nextInt();
                            Application.scanner.nextLine();
                            RegisterManager.memberWithID(ID).setAge(age);
                            System.out.println("Alderen på " + RegisterManager.memberWithID(ID).getName() + " er nu ændret.");
                            return;

                        //PHONE
                        case 3:
                            System.out.println("Indtast nyt tlfnummer:");
                            String phone = Application.scanner.nextLine();
                            RegisterManager.memberWithID(ID).setPhone(phone);
                            System.out.println("Telefonnummeret på " + RegisterManager.memberWithID(ID).getName() + " er nu ændret.");
                            return;

                        //GENDER
                        case 4:
                            System.out.println("Nyt Køn - 1: kvinde, 2: mand, 3: ikke binær, 4: akønnet ");
                            Gender gender = null;
                            int genderChoice = Application.scanner.nextInt();
                            Application.scanner.nextLine();

                            if (genderChoice == 1) {
                                gender = Gender.FEMALE;
                            } else if (genderChoice == 2) {
                                gender = Gender.MALE;
                            } else if (genderChoice == 3) {
                                gender = Gender.NONBINARY;
                            } else if (genderChoice == 4) {
                                gender = Gender.AGENDER;
                            }

                            System.out.println("Kønnet på " + RegisterManager.memberWithID(ID).getName() + " er nu ændret.");
                            RegisterManager.memberWithID(ID).setGender(gender);
                            return;

                        //MEMBERSHIP
                        case 5:
                            membershipChanger(ID);
                            return;

                        //BACK TO MENU
                        case 0:
                            editMemberRunning = false;
                    }
                }
            }
        }
    }

    public static void deleteMember() {

    while (true) {
        if (Register.getListOfMembers().isEmpty()) {
            System.out.println("Der er ingen medlemmer at slette\n");
            return;
        }
        else {
            //LOAD BEARING SCANNER NEXTLINE
            Application.scanner.nextLine();

            System.out.println("SLET MEDLEM");
            System.out.println("------------------------------");
            System.out.println("Vælg medlem at slette:");

            RegisterSimplePrinter.printSimplifiedMemberList();

            System.out.print("Vælg her (indtast memberID): ");
            String ID = Application.scanner.nextLine();

            String name = String.join(" ", RegisterManager.memberWithID(ID).getName());


            System.out.print("Er du sikker på at du vil slette " + name + "? \n(ja/nej): ");
            String answer = Application.scanner.nextLine();
            if (answer.equalsIgnoreCase("ja")) {
                RegisterManager.removeMember(RegisterManager.memberWithID(ID));
                System.out.println(name + " er blevet slettet fra systemet\n");
                return;
            }
            else {
                System.out.println("Okay så :(\n");
                return;

            }
        }
    }


    }

    // MEMBERSHIP CHANGER - NEEDS FUNCTIONALITY FROM REGISTER TO WORK

    public static void membershipChanger(String ID) {

        if (Register.getListOfPassiveMembers().contains(RegisterManager.memberWithID(ID))) {

            System.out.printf("""
                    Skift fra Passivt medlem til:
                    1. Standard medlem
                    2. Konkurrencesvømmer
                    0. Afbryd
                    
                    """);

            System.out.print("Vælg her: ");
            int choice = Application.scanner.nextInt();
            Application.scanner.nextLine();

            if (choice == 1) {
                new MemberCasual((MemberPassive) RegisterManager.memberWithID(ID));

            }

            if (choice == 2) {
                new Competitor((MemberPassive) RegisterManager.memberWithID(ID));
            }

        } else if (Register.getListOfCasualMembers().contains(RegisterManager.memberWithID(ID))) {

            System.out.printf("""
                    Skift fra Standard medlem til:
                    1. Passivt medlem
                    2. Konkurrencesvømmer
                    0. Afbryd
                    
                    """);

            System.out.print("Vælg her: ");
            int choice = Application.scanner.nextInt();
            Application.scanner.nextLine();

            if (choice == 1) {
                new MemberPassive((MemberCasual) RegisterManager.memberWithID(ID));
            }

            if (choice == 2) {
                new Competitor((MemberCasual) RegisterManager.memberWithID(ID));
            }

        } else if (Register.getListOfCompetitors().contains(RegisterManager.memberWithID(ID))) {

            System.out.printf("""
                    Skift fra Konkurrencesvømmer til:
                    1. Passivt medlem
                    2. Standard medlem
                    0. Afbryd
                    
                    """);

            System.out.print("Vælg her: ");
            int choice = Application.scanner.nextInt();
            Application.scanner.nextLine();

            if (choice == 1) {
                new MemberPassive((Competitor) RegisterManager.memberWithID(ID));
            }

            if (choice == 2) {
                new MemberCasual((Competitor) RegisterManager.memberWithID(ID));
            }
        }


        System.out.println("Medlemstypen er nu ændret \n");

    }



    public static String memberScreenString(){
        return String.format("""
                MEDLEMMER
                1. Tilføj medlem
                2. Rediger medlem (+ skift medlemstype)
                3. Slet medlem
                4. Vis aktive medlemmer
                0. Tilbage til menu
                """);
    }
}
