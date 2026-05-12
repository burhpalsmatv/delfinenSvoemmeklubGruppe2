public class RegisterSimplePrinter extends Register {

    public static void printSimplifiedMemberList() {
        if (listOfMembers.isEmpty()) {
            System.out.println("Listen er tom");
        } else {
            for (int i = 0; i < listOfMembers.size(); i++) {
                System.out.println(i + " " + listOfMembers.get(i).getName());
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

}
