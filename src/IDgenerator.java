import java.util.ArrayList;
import java.util.Random;

public abstract class IDgenerator {

    public static String generateID(ArrayList<String> listOfUsedIDsForX) {
        String ID = "";

        while (true) {
            ID = String.format("%06d", new Random().nextInt(999999));
            if (!listOfUsedIDsForX.contains(ID)) {
                break;
            }
        }
        listOfUsedIDsForX.add(ID);
        return ID;
    }

    public static String generateMemberID() {
        return generateID(Register.listOfUsedMemberIDs);
    }

    public static String generateTrainerID() {
        return generateID(Register.listOfUsedTrainerIDs);
    }

    public static String generateCompetitionID() {
        return generateID(Register.listOfUsedCompetitionIDs);
    }


}
