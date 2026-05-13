public class MemberPassive extends Member {
    final static String memberType = "Passive";

    // Fra oprettelsen
    public MemberPassive(String name, int age, String phone, Gender gender) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.gender = gender;
        this.inArrear = false;
        this.membership = Membership.PASSIVE;
        this.memberID = memberIDgenerator.generateMemberID();

        Register.listOfPassiveMembers.add(this);
        Register.listOfMembers.add(this);
    }

    // Fra Casual Member
    public MemberPassive(MemberCasual memberCasual) {
        this.name = memberCasual.name;
        this.age = memberCasual.age;
        this.phone = memberCasual.phone;
        this.gender = memberCasual.gender;
        this.inArrear = memberCasual.inArrear;
        this.memberID = memberCasual.memberID;
        // Unique
        this.membership = Membership.PASSIVE;

        Register.listOfCasualMembers.remove(memberCasual);
        Register.listOfPassiveMembers.add(this);
    }

    // Fra competitor
    public MemberPassive(Competitor competitor) {
        this.name = competitor.name;
        this.age = competitor.age;
        this.phone = competitor.phone;
        this.gender = competitor.gender;
        this.inArrear = competitor.inArrear;
        this.memberID = competitor.memberID;
        // Unique
        this.membership = Membership.PASSIVE;

        Register.listOfCompetitors.remove(competitor);
        Register.listOfPassiveMembers.add(this);
    }
}
