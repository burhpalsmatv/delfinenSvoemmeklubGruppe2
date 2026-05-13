public class RegisterSimplePrinter extends Register {

    public static void printSimplifiedMemberList() {
        if (listOfMembers.isEmpty()) {
            System.out.println("Listen er tom");
        } else {
            for (int i = 0; i < listOfMembers.size(); i++) {
                String text = "";
                text += String.format("""
                        Navn: %s
                        Medlems-ID: %s
                        Medlemskab: %s
                        """,
                        listOfMembers.get(i).getName(),
                        listOfMembers.get(i).getMemberID(),
                        listOfMembers.get(i).getMembership());

                System.out.println(text);

            }
        }
    }

    public static void printSimplifiedPassiveMemberList() {
        if (listOfPassiveMembers.isEmpty()) {
            System.out.println("Listen er tom");
        } else {
            for (int i = 0; i < listOfPassiveMembers.size(); i++) {
                String text = "";
                text += String.format("""
                        Navn: %s
                        Medlems-ID: %s
                        """,
                        listOfPassiveMembers.get(i).getName(),
                        listOfPassiveMembers.get(i).getMemberID());
                System.out.println(text);
            }
        }
    }

    public static void printSimplifiedCasualMemberList() {
        if (listOfCasualMembers.isEmpty()) {
            System.out.println("Listen er tom");
        } else {
            for (int i = 0; i < listOfCasualMembers.size(); i++) {
                String text = "";
                text += String.format("""
                        Navn: %s
                        Medlems-ID: %s
                        Medlemskab: %s
                        """,
                        listOfCasualMembers.get(i).getName(),
                        listOfCasualMembers.get(i).getMemberID(),
                        listOfCasualMembers.get(i).getMembership());

                System.out.println(text);

            }
        }
    }

    public static void printSimplifiedCompetitorList() {
        if (listOfCompetitors.isEmpty()) {
            System.out.println("Listen er tom");
        } else {
            for (int i = 0; i < listOfCompetitors.size(); i++) {
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
                        listOfCompetitors.get(i).getName(),
                        listOfCompetitors.get(i).getMemberID(),
                        listOfCompetitors.get(i).getMembership());

                        listOfCompetitors.get(i).getPR_butterfly();
                        listOfCompetitors.get(i).getPR_crawl();
                        listOfCompetitors.get(i).getPR_back_crawl();
                        listOfCompetitors.get(i).getPR_breast();


                System.out.println(text);

            }
        }
    }



    public static void printSimplifiedTrainerList() {
        if (listOfTrainers.isEmpty()) {
            System.out.println("Listen er tom");
        } else {
            for (int i = 0; i < listOfTrainers.size(); i++) {
                String text = "";
                text += String.format("""
                        Navn: %s
                        Træner i kategorier: %s
                        """,
                        listOfTrainers.get(i).getName(),
                        listOfTrainers.get(i).getSwimmingCategory());

                System.out.println(text);
            }
        }
    }

    public static void printSimplifiedCompetitionsList() {

    }

}
