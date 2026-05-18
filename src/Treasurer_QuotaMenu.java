public class Treasurer_QuotaMenu {

    public static void quotaMenu() {
        boolean inQuotaMenu = true;

        while(inQuotaMenu) {

            System.out.println(quotaMenuString());

            System.out.print("Vælg her: ");
            int quotaInput = Application.scanner.nextInt();
            Application.scanner.nextLine();

            switch (quotaInput) {
                //VIS FORVENTEDE ÅRSOPGØRELSE
                case 1:
                    System.out.println("Den forventede årsopgørelse er: " +
                            PaymentManager.getExpectedQuota(Register.listOfMembers) + " kr.");
                    break;

                    //VIS FAKTISKE ÅRSOPGØRELSE
                case 2:
                    System.out.println("Den aktuelle årsopgørelse er: " +
                            PaymentManager.getActualQuota(Register.listOfMembers) + " kr.");
                    break;

                    //Tilbage til menu
                case 0:
                    inQuotaMenu = false;
            }
        }
    }

    public static String quotaMenuString() {
        return String.format("""
                1. Vis forventede årsopgørelse
                2. Vis faktiske årsopgørelse
                0. Tilbage til menu
                """);
    }
}
