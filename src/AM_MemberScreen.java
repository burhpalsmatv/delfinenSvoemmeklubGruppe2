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
                    //ADD CODE HERE

                    //DELETE MEMBER
                case 3:
                    //ADD CODE HERE
                    RegisterSimplePrinter.printSimplifiedMemberList();
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

        //System.out.println("Passivt medlemskab? ja/nej");
        Boolean passiveMember = false;
        //String passiveChoice = Application.scanner.nextLine();

        //if (passiveChoice.equals("ja")) {
         //   passiveMember = true;
        //}

        //Actual constructors:
        if (passiveMember) {
            new MemberPassive(name, age, phone, gender);
        } else {
            new MemberCasual(name, age, phone, gender);
        }

        System.out.println(name + " er oprettet som medlem");
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
