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
                        listOfMembers.get(i).getMemberType());

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
                        listOfCasualMembers.get(i).getMemberType());

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
                        """,
                        listOfCompetitors.get(i).getName(),
                        listOfCompetitors.get(i).getMemberID(),
                        listOfCompetitors.get(i).getMemberType());

                System.out.println(text);

            }
        }
    }



    public static void printSimplifiedTrainerList() {
        if (listOfTrainers.isEmpty()) {
            System.out.println("Listen er tom");
        } else {
            for (int i = 0; i < listOfTrainers.size(); i++) {
                System.out.println(i + " " + listOfTrainers.get(i).getName());
            }
        }
    }

    public static void printSimplifiedCompetitionsList() {

    }

}
