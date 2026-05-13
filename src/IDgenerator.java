import java.util.ArrayList;
import java.util.Random;

public abstract class IDgenerator {
    static ArrayList<String> listOfUsedMemberIDs = new ArrayList<>();

    public static String generateID() {
        String ID = "";

        while (true) {
            ID = String.format("%06d", new Random().nextInt(999999));

            if (!listOfUsedMemberIDs.contains(ID)) {
                break;
            }
        }

        listOfUsedMemberIDs.add(memberID);

        return memberID;
    }
}
