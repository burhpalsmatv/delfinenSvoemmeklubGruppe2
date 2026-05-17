import java.io.Serializable;

public class MemberCasual extends Member implements Serializable {
    private static final long serialVersionUID = 5L; // Til serialization. Niks pille
    final static String memberType = "Casual";

    /* Custom MemberID for TESTING
    public Member(String name, String memberID) {
        this.name = name;
        //
        this.memberID = memberID;
        Register.listOfMembers.add(this);
    }
    */

    // Fra oprettelse
    public MemberCasual(String name, int age, String phone, Gender gender) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.gender = gender;
        this.inArrear = false;
        this.membership = setMembershipByAge(this);
        this.memberID = IDgenerator.generateMemberID();

        Register.listOfCasualMembers.add(this);
        Register.listOfMembers.add(this);
    }

    // Fra Passive Member
    public MemberCasual(MemberPassive memberPassive) {
        this.name = memberPassive.name;
        this.age = memberPassive.age;
        this.phone = memberPassive.phone;
        this.gender = memberPassive.gender;
        this.inArrear = memberPassive.inArrear;
        this.memberID = memberPassive.memberID;
        this.membership = setMembershipByAge(this);

        Register.listOfPassiveMembers.remove(memberPassive);
        Register.listOfMembers.remove(memberPassive);

        Register.listOfCasualMembers.add(this);
        Register.listOfMembers.add(this);


    }

    // Fra Competitor
    public MemberCasual(Competitor competitor) {
        this.name = competitor.name;
        this.age = competitor.age;
        this.phone = competitor.phone;
        this.gender = competitor.gender;
        this.inArrear = competitor.inArrear;
        this.memberID = competitor.memberID;
        this.membership = competitor.membership;

        Register.listOfCompetitors.remove(competitor);
        Register.listOfMembers.remove(competitor);

        Register.listOfCasualMembers.add(this);
        Register.listOfMembers.add(this);

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

