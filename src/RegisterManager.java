public class RegisterManager extends Register {

    // Removers
    public static void deleteTrainer(Trainer trainer) {
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
            if (member.memberID.equals(memberID)) {
                return member;
            }
        }
        return null;
    }

    public static Trainer trainerWithID(String trainerID) {
        for (Trainer trainer : Register.listOfTrainers) {
            if (trainer.trainerID.equals(trainerID)) {
                return trainer;
            }
        }
        return null;
    }

    public static Competition competitionWithID(String competitionID) {
        for (Competition competition : Register.listOfCompetitions) {
            if (competition.competitionID.equals(competitionID)) {
                return competition;
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
