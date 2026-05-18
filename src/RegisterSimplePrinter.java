public class RegisterSimplePrinter extends Register {

    public static void printSimplifiedMemberList() {
        if (Register.listOfMembers.isEmpty()) {
            System.out.println("Der er ingen medlemmer lige nu\n");
        } else {
            for (int i = 0; i < Register.listOfMembers.size(); i++) {
                String text = "";
                text += String.format("""
                        Navn: %s
                        Medlems-ID: %s
                        Medlemskab: %s
                        Medlemstype: %s
                        """,
                        Register.listOfMembers.get(i).getName(),
                        Register.listOfMembers.get(i).getMemberID(),
                        Register.listOfMembers.get(i).getMembership(),
                        Register.listOfMembers.get(i).getMemberType());

                System.out.println(text);

            }
        }
    }

    public static void printSimplifiedPassiveMemberList() {
        if (Register.listOfPassiveMembers.isEmpty()) {
            System.out.println("Der er ingen passive medlemmer lige nu\n");
        } else {
            for (int i = 0; i < Register.listOfPassiveMembers.size(); i++) {
                String text = "";
                text += String.format("""
                        Navn: %s
                        Medlems-ID: %s
                        """,
                        Register.listOfPassiveMembers.get(i).getName(),
                        Register.listOfPassiveMembers.get(i).getMemberID());
                System.out.println(text);
            }
        }
    }

    public static void printSimplifiedCasualMemberList() {
        if (Register.listOfCasualMembers.isEmpty()) {
            System.out.println("Der er ingen medlemmer lige nu\n");
        } else {
            for (int i = 0; i < Register.listOfCasualMembers.size(); i++) {
                String text = "";
                text += String.format("""
                        Navn: %s
                        Medlems-ID: %s
                        Medlemskab: %s
                        """,
                        Register.listOfCasualMembers.get(i).getName(),
                        Register.listOfCasualMembers.get(i).getMemberID(),
                        Register.listOfCasualMembers.get(i).getMembership());

                System.out.println(text);

            }
        }
    }

    public static void printSimplifiedCompetitorList() {
        if (Register.listOfCompetitors.isEmpty()) {
            System.out.println("Der er ingen konkurrenter lige nu\n");
        } else {
            for (int i = 0; i < Register.listOfCompetitors.size(); i++) {
                String text = "";
                text += String.format("""
                        Navn: %s
                        Medlems-ID: %s
                        Medlemskab: %s
                        
                        Rekorder i kategorier:
                        BUTTERFLY: %s
                        CRAWL: %s
                        BACKCRAWL: %s
                        BREASTSTROKE: %s
                        """,
                        Register.listOfCompetitors.get(i).getName(),
                        Register.listOfCompetitors.get(i).getMemberID(),
                        Register.listOfCompetitors.get(i).getMembership());

                        Register.listOfCompetitors.get(i).getPR_butterfly();
                        Register.listOfCompetitors.get(i).getPR_crawl();
                        Register.listOfCompetitors.get(i).getPR_back_crawl();
                        Register.listOfCompetitors.get(i).getPR_breast();


                System.out.println(text);

            }
        }
    }



    public static void printSimplifiedTrainerList() {
        if (Register.listOfTrainers.isEmpty()) {
            System.out.println("Der er ingen trænere lige nu\n");
        } else {
            for (int i = 0; i < Register.listOfTrainers.size(); i++) {
                String text = "";
                text += String.format("""
                        Navn: %s
                        ID: %s
                        Træner i kategorier: %s
                        """,
                        Register.listOfTrainers.get(i).getName(),
                        Register.listOfTrainers.get(i).getTrainerID(),
                        Register.listOfTrainers.get(i).getSwimmingCategory());

                System.out.println(text);
            }
        }
    }

    public static void printSimplifiedCompetitionsList() {
        if (Register.listOfCompetitions.isEmpty()) {
            System.out.println("Der er ingen konkurrencer lige nu\n");
        } else {
            for (int i = 0; i < Register.listOfCompetitions.size(); i++) {
                String text = "";
                text += String.format("""
                        Titel: %s
                        Dato: %s
                        """,
                        Register.listOfCompetitions.get(i).getTitle(),
                        Register.listOfCompetitions.get(i).getDate());

                System.out.println(text);
            }
        }

    }

}
