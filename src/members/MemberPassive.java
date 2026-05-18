package members;

import enums.Gender;
import enums.Membership;
import Register.Register;

import java.io.Serializable;

public class MemberPassive extends Member implements Serializable {
    private static final long serialVersionUID = 3L; // Til serialization. Niks pille


    // Fra oprettelsen
    public MemberPassive(String name, int age, String phone, Gender gender) {
        this.memberType = "Passiv";

        this.name = name;
        this.age = age;
        this.phone = phone;
        this.gender = gender;
        this.inArrear = false;
        this.membership = Membership.PASSIVE;
        this.memberID = IDgenerator.generateMemberID();

        Register.getListOfPassiveMembers().add(this);
        Register.getListOfMembers().add(this);
    }

    // Fra Casual members.Member
    public MemberPassive(MemberCasual memberCasual) {
        this.memberType = "Passiv";

        this.name = memberCasual.name;
        this.age = memberCasual.age;
        this.phone = memberCasual.phone;
        this.gender = memberCasual.gender;
        this.inArrear = memberCasual.inArrear;
        this.memberID = memberCasual.memberID;
        // Unique
        this.membership = Membership.PASSIVE;

        Register.getListOfCasualMembers().remove(memberCasual);
        Register.getListOfMembers().remove(memberCasual);

        Register.getListOfPassiveMembers().add(this);
        Register.getListOfMembers().add(this);
    }

    // Fra competitor
    public MemberPassive(Competitor competitor) {
        this.memberType = "Passiv";

        this.name = competitor.name;
        this.age = competitor.age;
        this.phone = competitor.phone;
        this.gender = competitor.gender;
        this.inArrear = competitor.inArrear;
        this.memberID = competitor.memberID;
        // Unique
        this.membership = Membership.PASSIVE;

        Register.getListOfCompetitors().remove(competitor);
        Register.getListOfMembers().remove(competitor);

        Register.getListOfPassiveMembers().add(this);
        Register.getListOfMembers().add(this);

    }
}
