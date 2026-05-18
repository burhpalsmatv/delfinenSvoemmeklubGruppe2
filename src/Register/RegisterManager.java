package Register;

import members.*;
import menus.trainerMenu.Competition;
import menus.trainerMenu.Trainer;

public class RegisterManager extends Register {

    // Removers
    public static void removeTrainer(Trainer trainer) {
        Register.listOfUsedTrainerIDs.remove(trainerWithID(trainer.getTrainerID()));
        Register.listOfTrainers.remove(trainer);
    }

    public static void removeMember(Member member) {
        if (Register.listOfPassiveMembers.contains(memberWithID(member.getMemberID()))) {
            Register.listOfPassiveMembers.remove(memberWithID(member.getMemberID()));
        }
        if (Register.listOfCasualMembers.contains(memberWithID(member.getMemberID()))) {
            Register.listOfCasualMembers.remove(memberWithID(member.getMemberID()));
        }
        if (Register.listOfCompetitors.contains(memberWithID(member.getMemberID()))) {
            Register.listOfCompetitors.remove(memberWithID(member.getMemberID()));
        }
        Register.listOfUsedMemberIDs.remove(memberWithID(member.getMemberID()));
        Register.listOfMembers.remove(memberWithID(member.getMemberID()));
    }

    // Finders
    public static Member memberWithID(String memberID) {
        for (Member member : Register.listOfMembers) {
            if (member.getMemberID().equals(memberID)) {
                return member;
            }
        }
        return null;
    }

    public static Trainer trainerWithID(String trainerID) {
        for (Trainer trainer : Register.listOfTrainers) {
            if (trainer.getTrainerID().equals(trainerID)) {
                return trainer;
            }
        }
        return null;
    }

    public static Competition competitionWithID(String competitionID) {
        for (Competition competition : Register.listOfCompetitions) {
            if (competition.getCompetitionID().equals(competitionID)) {
                return competition;
            }
        }
        return null;
    }

    public static Competitor competitorWithID(String memberID) {
        for (Member competitor : Register.listOfCompetitors) {
            if (competitor.getMemberID().equals(memberID)) {
                return (Competitor) competitor;
            }
        }
        return null;
    }

    // With Name AND Phone together
    public static Member memberWithNamePhone(String name, String phone) {
        for (Member member : Register.listOfMembers) {
            if (member.getName().equalsIgnoreCase(name) && member.getPhone().equals(phone)) {
                return member;
            }
        }
        return null;
    }
}
