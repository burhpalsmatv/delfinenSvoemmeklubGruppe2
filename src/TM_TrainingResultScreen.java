public class TM_TrainingResultScreen {

    public static void trainingResultScreen() {

        boolean inResultScreen = true;
        System.out.println(trainingResultsScreenString());

        while (inResultScreen) {
            int resultInput = Application.scanner.nextInt();

            switch(resultInput) {

                //RESULTS BASED ON CATEGORY
                case 1:
                    // ADD CODE

                    //MEMBER RESULTS
                case 2:
                    // ADD CODE

                    //ENTER RESULT FOR MEMBER
                case 3:
                    //ADD CODE

                    //LOGOUT
                case 0:
                    inResultScreen = false;
            }
        }

    }

    public static String trainingResultsScreenString() {
        return String.format("""
                TRÆNINGSRESULTATER
                1. Vis resultater baseret på disciplin
                2. Vis medlems resultater
                3. Indtast træningsresultat for medlem
                0. Tilbage til menu
                """);
    }
}
