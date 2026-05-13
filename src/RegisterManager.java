public class RegisterManager extends Register {

    // Removers
    public static void deleteTrainer(Trainer trainer) {
        listOfTrainers.remove(trainer);
    }

    public static void removeMember(Member member) {
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
