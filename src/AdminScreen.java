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
                    //ADD CODE HERE

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
                    //ADD CODE HERE

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
                    //ADD CODE HERE

                //EDIT MEMBER INFO
                case 2:
                    //ADD CODE HERE

                //DELETE MEMBER
                case 3:
                    //ADD CODE HERE
                    printSimplifiedMemberList();
                    deleteMember();

                //SHOW MEMBERS
                case 4:
                    //ADD CODE HERE

                //BACK TO MENU
                case 0:
                    inMemberScreen = false;

            }
        }
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

    public static void printSimplifiedMemberList() {
        for (int i = 0; i < Register.listOfMembers.size(); i++) {
            System.out.println(i + " " + Register.listOfMembers.get(i).getName());
        }

    }

    public static void deleteMember() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Delete member at: ");
        int deleteAtIndex = Integer.parseInt(scanner.nextLine());
        Member.removeMemberAt(deleteAtIndex);
    }



}
