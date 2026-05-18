import java.io.Serializable;
import java.util.ArrayList;

public class Competitor extends Member implements /* Comparable<Competitor>, */ Serializable {
    private static final long serialVersionUID = 4L;

    ArrayList<Trainer> trainersAssigned;
    int[] PR_butterfly = {0, 0};
    int[] PR_crawl = {0, 0};
    int[] PR_back_crawl = {0, 0};
    int[] PR_breast = {0, 0};

    // Fra Casual Member
    public Competitor(MemberCasual memberCasual) {
        this.memberType = "Konkurrencesvømmer";

        this.name = memberCasual.name;
        this.age = memberCasual.age;
        this.phone = memberCasual.phone;
        this.gender = memberCasual.gender;
        this.inArrear = memberCasual.inArrear;
        this.membership = memberCasual.membership;
        this.memberID = memberCasual.memberID;

        // Competitor unique variables
        ArrayList<Trainer> trainersAssigned = new ArrayList<>();
        this.PR_butterfly = null;
        this.PR_crawl = null;
        this.PR_back_crawl = null;
        this.PR_breast = null;

        //
        Register.listOfCasualMembers.remove(memberCasual);
        Register.listOfMembers.remove(memberCasual);

        Register.listOfCompetitors.add(this);
        Register.listOfMembers.add(this);
    }

    // Fra Passive Member
    public Competitor(MemberPassive memberPassive) {
        this.memberType = "Konkurrencesvømmer";

        this.name = memberPassive.name;
        this.age = memberPassive.age;
        this.phone = memberPassive.phone;
        this.gender = memberPassive.gender;
        this.inArrear = memberPassive.inArrear;
        this.membership = setMembershipByAge(this);
        this.memberID = memberPassive.memberID;

        // Competitor unique variables
        ArrayList<Trainer> trainersAssigned = new ArrayList<>();
        this.PR_butterfly = null;
        this.PR_crawl = null;
        this.PR_back_crawl = null;
        this.PR_breast = null;

        //
        Register.listOfPassiveMembers.remove(memberPassive);
        Register.listOfMembers.remove(memberPassive);

        Register.listOfCompetitors.add(this);
        Register.listOfMembers.add(this);
    }

    public String toString(){
        return String.format("""
                
                ---------------------
                MemberID: %s
                Medlemsskab: %s
                Medlemstype: %s

                Navn: %s
                Alder: %s
                Træner: %s-
                I restance?: %s
                ---------------------
                
                """, this.memberID, this.membership, getMemberType(), this.name, this.age, this.trainersAssigned, this.inArrear);
    }

   // GETTERS
    public ArrayList<Trainer> getTrainer() {
        return this.trainersAssigned;
    }

    public int[] getPR_butterfly() {
        return this.PR_butterfly;
    }

    public int[] getPR_crawl() {
        return this.PR_crawl;
    }

    public int[] getPR_back_crawl() {
        return this.PR_back_crawl;
    }

    public int[] getPR_breast() {
        return this.PR_breast;
    }

    public String getMemberType() {
        return memberType;
    }

    // SETTERS
    public void addTrainer(Trainer trainer) {
        this.trainersAssigned.add(trainer);
    }

    public void removeTrainer(Trainer trainer) {
        this.trainersAssigned.remove(trainer);
    }

    public void setPR_butterfly(int minutes, int seconds) {
        this.PR_butterfly[0] = minutes;
        this.PR_butterfly[1] = seconds;
    }

    public void setPR_crawl(int minutes, int seconds) {
        this.PR_crawl[0] = minutes;
        this.PR_crawl[1] = seconds;
    }

    public void setPR_back_crawl(int minutes, int seconds) {
        this.PR_back_crawl[0] = minutes;
        this.PR_back_crawl[1] = seconds;
    }

    public void setPR_breast(int minutes, int seconds) {
        this.PR_breast[0] = minutes;
        this.PR_breast[1] = seconds;
    }
}
