import java.util.ArrayList;
import java.util.Random;

public abstract class IDgenerator {
    static ArrayList<String> listOfUsedMemberIDs = new ArrayList<>();
    static ArrayList<String> listOfUsedTrainerIDs = new ArrayList<>();
    static ArrayList<String> listOfUsedCompetitionIDs = new ArrayList<>();

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
        return generateID(listOfUsedMemberIDs);
    }

    public static String generateTrainerID() {
        return generateID(listOfUsedTrainerIDs);
    }

    public static String generateCompetitionID() {
        return generateID(listOfUsedCompetitionIDs);
    }


}
