public class RegisterManager {

    public static void deleteTrainer(int i) {
        Register.listOfTrainers.remove(i);
    }

    public static void removeMemberAt(int i) {
        Register.listOfMembers.remove(i);
    }

}
