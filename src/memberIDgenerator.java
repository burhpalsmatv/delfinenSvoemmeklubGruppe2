import java.util.ArrayList;
import java.util.Random;

public class memberIDgenerator {
    static ArrayList<String> listOfUsedMemberIDs = new ArrayList<>();

    public static String generateMemberID() {
        String memberID = "";

        while (true) {
            memberID = String.format("%06d", new Random().nextInt(999999));

            if (!listOfUsedMemberIDs.contains(memberID)) {
                break;
            }
        }

        listOfUsedMemberIDs.add(memberID);

        return memberID;
    }
}
