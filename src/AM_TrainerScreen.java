import java.util.Scanner;

public class AM_TrainerScreen {

    public static void trainerScreen(){

        boolean inTrainerScreen = true;

        while(inTrainerScreen) {

            System.out.println(trainerScreenString());

            System.out.print("Vælg her: ");
            int trainerInput = Application.scanner.nextInt();
            System.out.println();

            switch (trainerInput) {

                //ADD TRAINER
                case 1:
                    createTrainer();
                    break;

                //DELETE TRAINER
                case 2:
                    deleteTrainer();
                    break;

                //EDIT TRAINER
                case 3:
                    editTrainer();
                    break;

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

    //METHODS BELOW

    public static void assignTrainerToCompetitor() {

        while (true) {

            if (Register.listOfCompetitors.isEmpty()) {
                System.out.println("Der er ingen Konkurrencesvømmere. \nOpret konkurrencesvømmer først\n");
                return;
            }

            if (Register.listOfTrainers.isEmpty()) {
                System.out.println("Der er ingen Trænere. \nOpret træner først\n");
                return;
            }

            else {
                //LOADBEARING SCANNER
                Application.scanner.nextLine();

                System.out.println("TILDEL TRÆNER TIL SVØMMER:");
                System.out.println("------------------------------");
                System.out.println("Vælg træner (Indtast ID):");
                RegisterSimplePrinter.printSimplifiedTrainerList();

                RegisterSimplePrinter.printSimplifiedTrainerList();
                System.out.print("Vælg her (indtast ID): ");

                String trainerID = Application.scanner.nextLine();

                System.out.println("Tildel " + RegisterManager.trainerWithID(trainerID).getName() + " til svømmer.");
                System.out.println("Vælg svømmer:");
                RegisterSimplePrinter.printSimplifiedCompetitorList();

                System.out.print("Vælg her (indtast ID): ");
                String swimmerID = Application.scanner.nextLine();

                Competitor thisCompetitor = (Competitor) RegisterManager.memberWithID(swimmerID);
                thisCompetitor.addTrainer(RegisterManager.trainerWithID(trainerID));

                // Ved godt det ligner chat. Men det er hjemmelavet spaghetti
                System.out.println(RegisterManager.trainerWithID(trainerID).getName() + " er tildelt som træner på " + RegisterManager.memberWithID(swimmerID).getName());
                System.out.println();
            }
            break;
        }
        return;
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

        System.out.println("Trænerens telefonnummer:");
        String phone = Application.scanner.nextLine();

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

        Trainer trainer = new Trainer(name, age, phone, gender);
        System.out.println("Træneren " + name + " er oprettet i systemet\n");
    }

    public static void deleteTrainer() {
        //LOAD BEARING SCANNER NEXTLINE
        if (Register.listOfTrainers.isEmpty()) {
            System.out.println("Der er ingen trænere at slette lige nu");
            return;
        }

            System.out.println("SLET TRÆNER");
            System.out.println("------------------------------");
            System.out.println("Vælg træner at slette:");

            RegisterSimplePrinter.printSimplifiedTrainerList();

            System.out.println("Vælg her (indtast ID): ");
            String ID = Application.scanner.nextLine();
            String name = String.join(" ", RegisterManager.trainerWithID(ID).getName());

            System.out.println("Er du sikker på at du vil slette " + name + "? \n(ja/nej): ");
            String answer = Application.scanner.nextLine();
            if (answer.equalsIgnoreCase("ja")) {
                RegisterManager.removeTrainer(RegisterManager.trainerWithID(ID));
                System.out.println(name + " er blevet slettet fra systemet\n");

        }
    }

    public static void editTrainer() {

        if (Register.listOfTrainers.isEmpty()) {
            System.out.println("Der er ingen trænere at redigere.");
            return;
        }
        //LOAD BEARING SCANNER NEXTLINE
        Application.scanner.nextLine();

        System.out.println("REDIGER TRÆNER");
        System.out.println("------------------------------");
        System.out.println("Vælg træner at Redigere: ");

        RegisterSimplePrinter.printSimplifiedTrainerList();

        System.out.print("Vælg her (indtast ID): ");
        String ID = Application.scanner.nextLine();
        System.out.println();

        System.out.printf("""
                Ændr:
                1. Navn
                2. Alder
                3. Telefonnummer
                4. Køn
                0. Tilbage til menu
                """);

        System.out.print("Vælg her: ");
        int choice = Application.scanner.nextInt();
        Application.scanner.nextLine();

        switch (choice) {

            //NAME
            case 1:
                System.out.print("Indtast nyt navn: ");
                String name = Application.scanner.nextLine();
                RegisterManager.trainerWithID(ID).setName(name);
                System.out.println("Navn ændret\n");
                break;

            //AGE
            case 2:
                System.out.print("Indtast ny alder: ");
                int age = Application.scanner.nextInt();
                Application.scanner.nextLine();
                RegisterManager.trainerWithID(ID).setAge(age);
                System.out.println("Alder ændret\n");
                break;

            //PHONE
            case 3:
                System.out.print("Indtast nyt telefonnummer: ");
                String phone = Application.scanner.nextLine();
                RegisterManager.trainerWithID(ID).setPhone(phone);
                System.out.println("Telefonnummer ændret\n");

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
                RegisterManager.trainerWithID(ID).setGender(gender);
                System.out.println("Køn ændret\n");
                break;

                //BACK TO MENU
            case 6:
                break;
        }

    }



    public static String trainerScreenString(){
        return String.format("""
                TRÆNERE
                1. Opret træner
                2. Slet træner
                3. Rediger træner
                4. Vis liste af trænere
                5. Tilknyt træner til svømmer
                0. Tilbage til menu
                """);
    }
}
