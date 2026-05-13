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

        System.out.println("Medlemmets alder:"); // TO-DO: gør valgfri
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

        //TILFØJ KODE SOM OPRETTER MEDLEM HER
    }

    public static void deleteMember() {

        //TILFØJ METODE SOM SLETTER MEDLEM

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
