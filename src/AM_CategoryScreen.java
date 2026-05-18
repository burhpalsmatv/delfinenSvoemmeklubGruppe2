import java.util.Locale;

public class AM_CategoryScreen {

    public static void categoryScreen(){

        boolean inCategoryScreen = true;

        while (inCategoryScreen) {

            System.out.println(categoryScreenString());

            System.out.print("Vælg her: ");
            int catInput = Application.scanner.nextInt();

            switch (catInput) {

                //SHOW LIST OF CATEGORIES
                case 1:
                    showCategoryList();
                    break;

                //ASSIGN CATEGORY TO TRAINER
                case 2:
                    assignCategoryToTrainer();
                    break;

                //SEE TOP 5 SWIMMERS IN EACH CATEGORY
                case 3:
                    // ADD CODE HER EMMA !!! 4
                    break;

                //LOG OUT
                case 0:
                    inCategoryScreen = false;
            }
        }
    }

    public static void assignCategoryToTrainer() {

        if (Register.listOfTrainers.isEmpty()) {
            System.out.println("Der er ingen trænere lige nu. Opret træner først");
            return;
        }

        //LOADBEARING SCANNER NEXTLINE
        Application.scanner.nextLine();

        System.out.println("TILDEL DISCIPLIN TIL TRÆNER:");
        System.out.println("------------------------------");
        System.out.println("Vælg træner:");

        RegisterSimplePrinter.printSimplifiedTrainerList();
        System.out.print("Vælg her (Indtast ID): ");
        String trainerID = Application.scanner.nextLine();

        System.out.println("Tildel " + RegisterManager.trainerWithID(trainerID).getName() + " til følgende disciplin:");

        int counter = 1;
        for (SwimmingCategory category : SwimmingCategory.values()) {
            System.out.println(counter + ": " + category);
            counter ++;
        }

        System.out.print("Vælg her: ");
        int CategoryChoice = Application.scanner.nextInt();
        Application.scanner.nextLine();

        if (CategoryChoice == 1) {
            RegisterManager.trainerWithID(trainerID).addSwimmingCategory(SwimmingCategory.BUTTERFLY);
        } else if (CategoryChoice == 2) {
            RegisterManager.trainerWithID(trainerID).addSwimmingCategory(SwimmingCategory.CRAWL);
        } else if (CategoryChoice == 3) {
            RegisterManager.trainerWithID(trainerID).addSwimmingCategory(SwimmingCategory.BACKCRAWL);
        } else if (CategoryChoice == 4) {
            RegisterManager.trainerWithID(trainerID).addSwimmingCategory(SwimmingCategory.BREASTSTROKE);
        }

        System.out.println("Disciplinen er blevet tildelt til " + RegisterManager.trainerWithID(trainerID).getName());
        System.out.println();
    }

    public static void showCategoryList() {

        System.out.println("Svømmediscipliner:");
        for (SwimmingCategory category : SwimmingCategory.values()) {
            System.out.println(category);
        }
        System.out.println();

    }

    public static String categoryScreenString() {
        return String.format("""
                SVØMMEDISCIPLINER
                1. Vis liste af discipliner
                2. Tilføj disciplin til træner
                3. Vis liste af top 5 svømmere indenfor hver disciplin
                0. Tilbage til menu
                """);
    }
}
