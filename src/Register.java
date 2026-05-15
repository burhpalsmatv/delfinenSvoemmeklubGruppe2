import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Register {

    // Member lists
    static ArrayList<Member> listOfMembers = new ArrayList<>(); // Alle slags members
    static ArrayList<MemberPassive> listOfPassiveMembers = new ArrayList<>();
    static ArrayList<MemberCasual> listOfCasualMembers = new ArrayList<>();
    static ArrayList<Competitor> listOfCompetitors = new ArrayList<>();

    // Trainers
    static ArrayList<Trainer> listOfTrainers = new ArrayList<>();

    // Competitions
    static ArrayList<Competition> listOfCompetitions = new ArrayList<>();

    // IDs
    static ArrayList<String> listOfUsedMemberIDs = new ArrayList<>();
    static ArrayList<String> listOfUsedTrainerIDs = new ArrayList<>();
    static ArrayList<String> listOfUsedCompetitionIDs = new ArrayList<>();
}
