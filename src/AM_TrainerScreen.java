import java.util.Scanner;

public class AM_TrainerScreen {

    public static void trainerScreen(){

        boolean inTrainerScreen = true;

        while(inTrainerScreen) {

            System.out.println(trainerScreenString());

            int trainerInput = Application.scanner.nextInt();
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

            } else {
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

                Register.listOfCompetitors.get(swimmerChoice).addTrainer(Register.listOfTrainers.get(trainerChoice));

                System.out.println(Register.listOfTrainers.get(trainerChoice).getName() + " er tildelt som træner til " +
                        swimmerName);
            }
        }

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
        System.out.println("Træneren " + name + " er oprettet i systemet");
    }

    public static void deleteTrainer() {
        //LOAD BEARING SCANNER NEXTLINE
        Application.scanner.nextLine();

        System.out.println("SLET TRÆNER");
        System.out.println("------------------------------");
        System.out.println("Vælg træner at slette (indtast ID)");

        RegisterSimplePrinter.printSimplifiedTrainerList();

        String ID = Application.scanner.nextLine();
        String name = String.join(" ", RegisterManager.trainerWithID(ID).getName());

        System.out.println("Er du sikker på at du vil slette " + name + "? \n(ja/nej): ");
        String answer = Application.scanner.nextLine();
        if (answer.equalsIgnoreCase("ja")) {
            RegisterManager.removeTrainer(RegisterManager.trainerWithID(ID));
            System.out.println(name + " er blevet slettet fra systemet");
        }
    }

    public static void editTrainer() {

        //LOAD BEARING SCANNER NEXTLINE
        Application.scanner.nextLine();

        System.out.println("REDIGER TRÆNER");
        System.out.println("------------------------------");
        System.out.println("Vælg træner at Redigere (indtast ID)");

        RegisterSimplePrinter.printSimplifiedTrainerList();
        String ID = Application.scanner.nextLine();

        System.out.printf("""
                Ændr:
                1. navn
                2. alder
                3. tlf
                4. køn
                0. Tilbage til menu
                """);

        int choice = Application.scanner.nextInt();
        Application.scanner.nextLine();

        switch (choice) {

            //NAME
            case 1:
                System.out.println("Indtast nyt navn:");
                String name = Application.scanner.nextLine();
                RegisterManager.trainerWithID(ID).setName(name);
                break;

            //AGE
            case 2:
                System.out.println("Indtast ny alder:");
                int age = Application.scanner.nextInt();
                Application.scanner.nextLine();
                RegisterManager.trainerWithID(ID).setAge(age);
                break;

            //PHONE
            case 3:
                System.out.println("Indtast nyt tlfnummer:");
                String phone = Application.scanner.nextLine();
                RegisterManager.trainerWithID(ID).setPhone(phone);
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
                3. Rediger trænerinformation
                4. Vis liste af trænere
                5. Tilknyt træner til svømmer
                0. Tilbage til menu
                """);
    }
}
