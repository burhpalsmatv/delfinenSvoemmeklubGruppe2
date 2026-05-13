public abstract class MemberIDGenerator extends IDgenerator {

    public static String generateMemberID() {
        return generateID(listOfUsedMemberIDs);
    }
}
