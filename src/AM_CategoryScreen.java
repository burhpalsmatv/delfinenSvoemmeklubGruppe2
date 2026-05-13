public class AM_CategoryScreen {

    public static void categoryScreen(){

        boolean inCategoryScreen = true;
        System.out.println(categoryScreenString());

        while (inCategoryScreen) {

            int catInput = Application.scanner.nextInt();
            switch (catInput) {

                //SHOW LIST OF CATEGORIES
                case 1:
                    break;

                //ASSIGN CATEGORY TO TRAINER
                case 2:
                    break;

                //SEE TOP 5 SWIMMERS IN EACH CATEGORY
                case 3:
                    break;

                //LOG OUT
                case 0:
                    inCategoryScreen = false;
            }
        }
    }

    public static String categoryScreenString() {
        return String.format("""
                SVØMMEDISCIPLINER
                1. Opret disciplin
                2. Slet disciplin
                0. Tilbage til menu
                """);
    }
}
