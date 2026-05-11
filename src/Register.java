import java.util.ArrayList;

public class Register {
    static ArrayList<Member> listOfMembers = new ArrayList<>();
    static ArrayList<Trainer> listOfTrainers = new ArrayList<>();
    static ArrayList<Competitor> listOfCompetitors = new ArrayList<>();
    static ArrayList<Competition> listOfCompetitions = new ArrayList<>();

    public Register () {}

    public static void showListOfMembers() {
        if (listOfMembers.isEmpty()) {
            System.out.println("Listen er tom");
        }else {
            for (Member member : listOfMembers) {
                System.out.println(member);
            }
        }
    }
}
