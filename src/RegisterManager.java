public class RegisterManager extends Register {

    // Removers
    public static void deleteTrainer(Trainer trainer) {
        Register.listOfUsedTrainerIDs.remove(trainerWithID(trainer.getTrainerID()));
        Register.listOfTrainers.remove(trainer);
    }

    public static void removeMember(Member member) {
        if (Register.listOfPassiveMembers.contains(member)) {
            Register.listOfPassiveMembers.remove(member);
        }
        if (Register.listOfCasualMembers.contains(member)) {
            Register.listOfCasualMembers.remove(member);
        }
        if (Register.listOfCompetitors.contains(member)) {
            Register.listOfCompetitors.remove(member);
        }
        Register.listOfUsedMemberIDs.remove(memberWithID(member.getMemberID()));
        Register.listOfMembers.remove(member);
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
