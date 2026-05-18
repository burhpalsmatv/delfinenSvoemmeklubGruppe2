package Register;

import members.*;
import menus.trainerMenu.Competition;
import menus.trainerMenu.Trainer;

import java.util.ArrayList;

public abstract class Register {

    // members.Member lists
    static ArrayList<Member> listOfMembers = new ArrayList<>(); // Alle slags members
    static ArrayList<MemberPassive> listOfPassiveMembers = new ArrayList<>();
    static ArrayList<MemberCasual> listOfCasualMembers = new ArrayList<>();
    static ArrayList<Competitor> listOfCompetitors = new ArrayList<>();

    // Trainers
    public static ArrayList<Trainer> listOfTrainers = new ArrayList<>();

    // Competitions
    public static ArrayList<Competition> listOfCompetitions = new ArrayList<>();

    // IDs
    public static ArrayList<String> listOfUsedMemberIDs = new ArrayList<>();
    public static ArrayList<String> listOfUsedTrainerIDs = new ArrayList<>();
    public static ArrayList<String> listOfUsedCompetitionIDs = new ArrayList<>();

    //GETTER
    public static ArrayList<Member> getListOfMembers() {
        return listOfMembers;
    }
    public static ArrayList<MemberPassive> getListOfPassiveMembers() {
        return listOfPassiveMembers;
    }
    public static ArrayList<Competitor> getListOfCompetitors() {
        return listOfCompetitors;
    }
    public static ArrayList<MemberCasual> getListOfCasualMembers() {
        return listOfCasualMembers;
    }
    public static ArrayList<Competition> getListOfCompetitions() {
        return listOfCompetitions;
    }
}
