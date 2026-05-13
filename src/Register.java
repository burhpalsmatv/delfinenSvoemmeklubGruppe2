import java.lang.reflect.Array;
import java.util.ArrayList;

    // This is our database

    // Main files
public abstract class Register {
    static ArrayList<Member> listOfMembers = new ArrayList<>();
    static ArrayList<Trainer> listOfTrainers = new ArrayList<>();
    static ArrayList<Competitor> listOfCompetitors = new ArrayList<>();
    static ArrayList<Competition> listOfCompetitions = new ArrayList<>();

    // Other files
    static ArrayList<SwimmingCategory> listOfCategories = new ArrayList<>();
    static ArrayList<Receipt> listOfReceipts = new ArrayList<>();


    // 'Return Member'-methods
        // With memberID
    public static Member memberWithID(String memberID) {
        for (Member member : listOfMembers) {
            if (member.memberID == memberID) {
                return member;
            }
        }
        return null;
    }

        // With Name AND Phone together
        public static Member memberWithNamePhone(String name, String phone) {
            for (Member member : listOfMembers) {
                if (member.getName().equalsIgnoreCase(name) && member.getPhone() == phone) {
                    return member;
                }
            }
            return null;
        }
}
