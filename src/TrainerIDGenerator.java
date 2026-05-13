public abstract class TrainerIDGenerator extends IDgenerator {

    public static String generateMemberID() {
        return generateID(listOfUsedTrainerIDs);
    }
}
