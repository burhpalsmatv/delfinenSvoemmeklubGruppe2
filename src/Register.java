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

    public static Member findMember(String memberID){
        for (Member member : listOfMembers){
            if(member.getMemberID() == memberID){
                return member;
            }
        }
        return null;
    }

}
