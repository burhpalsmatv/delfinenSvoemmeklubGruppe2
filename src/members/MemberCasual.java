package members;

import enums.Gender;
import Register.Register;

import java.io.Serializable;

public class MemberCasual extends Member implements Serializable {
    private static final long serialVersionUID = 2L; // Til serialization. Niks pille

    // Fra oprettelse
    public MemberCasual(String name, int age, String phone, Gender gender) {
        this.memberType = "Normal svømmer";

        this.name = name;
        this.age = age;
        this.phone = phone;
        this.gender = gender;
        this.inArrear = false;
        this.membership = setMembershipByAge(this);
        this.memberID = IDgenerator.generateMemberID();

        Register.getListOfCasualMembers().add(this);
        Register.getListOfMembers().add(this);
    }

    // Fra Passive members.Member
    public MemberCasual(MemberPassive memberPassive) {
        this.memberType = "Normal svømmer";

        this.name = memberPassive.name;
        this.age = memberPassive.age;
        this.phone = memberPassive.phone;
        this.gender = memberPassive.gender;
        this.inArrear = memberPassive.inArrear;
        this.memberID = memberPassive.memberID;
        this.membership = setMembershipByAge(this);

        Register.getListOfPassiveMembers().remove(memberPassive);
        Register.getListOfMembers().remove(memberPassive);

        Register.getListOfCasualMembers().add(this);
        Register.getListOfMembers().add(this);


    }

    // Fra members.Competitor
    public MemberCasual(Competitor competitor) {
        this.memberType = "Normal svømmer";

        this.name = competitor.name;
        this.age = competitor.age;
        this.phone = competitor.phone;
        this.gender = competitor.gender;
        this.inArrear = competitor.inArrear;
        this.memberID = competitor.memberID;
        this.membership = competitor.membership;

        Register.getListOfCompetitors().remove(competitor);
        Register.getListOfMembers().remove(competitor);

        Register.getListOfCasualMembers().add(this);
        Register.getListOfMembers().add(this);

    }

    public String toString(){
        return String.format("""
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~
                MemberID: %s
                I restance: %s

                Navn: %s
                Alder: %d
                Telefon: %s
                Køn: %s
                Medlemstype: %s
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~
                """, this.memberID, this.inArrear, this.name, this.age, this.phone,
                this.gender, this.membership);
    }
}

