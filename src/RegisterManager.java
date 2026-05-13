public class RegisterManager extends Register {

    // Removers
    public static void deleteTrainer(Trainer trainer) {
        Register.listOfUsedTrainerIDs.remove(trainerWithID(trainer.getTrainerID()));
        listOfTrainers.remove(trainer);
    }

    public static void removeMember(Member member) {
        if (listOfPassiveMembers.contains(member)) {
            listOfPassiveMembers.remove(member);
        }
        if (listOfCasualMembers.contains(member)) {
            listOfCasualMembers.remove(member);
        }
        if (listOfCompetitors.contains(member)) {
            listOfCompetitors.remove(member);
        }
        Register.listOfUsedMemberIDs.remove(memberWithID(member.getMemberID()));
        listOfMembers.remove(member);
    }

    // Finders
    public static Member memberWithID(String memberID) {
        for (Member member : listOfMembers) {
            if (member.memberID.equals(memberID)) {
                return member;
            }
        }
        return null;
    }

    public static Trainer trainerWithID(String trainerID) {
        for (Trainer trainer : listOfTrainers) {
            if (trainer.trainerID.equals(trainerID)) {
                return trainer;
            }
        }
        return null;
    }

    // With Name AND Phone together
    public static Member memberWithNamePhone(String name, String phone) {
        for (Member member : listOfMembers) {
            if (member.getName().equalsIgnoreCase(name) && member.getPhone().equals(phone)) {
                return member;
            }
        }
        return null;
    }
}
