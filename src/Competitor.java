import java.io.Serializable;
import java.util.ArrayList;

public class Competitor extends Member implements /* Comparable<Competitor>, */ Serializable {
    private static final long serialVersionUID = 3L;

    ArrayList<Trainer> trainersAssigned;
    final static String memberType = "Competitor";
    String PR_butterfly; // MIDLERTIDIG INDTIL FIKS
    String PR_crawl; // MIDLERTIDIG INDTIL FIKS
    String PR_back_crawl; // MIDLERTIDIG INDTIL FIKS
    String PR_breast; // MIDLERTIDIG INDTIL FIKS

    // Fra Casual Member
    public Competitor(MemberCasual memberCasual) {
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
        Register.listOfCompetitors.add(this);
    }

    // Fra Passive Member
    public Competitor(MemberPassive memberPassive) {
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
        Register.listOfCompetitors.add(this);
    }

    public String toString(){
        return String.format("""
                
                ---------------------
                MemberID: %s
                Medlemsskab: %s
                Medlemstype: %s

                Navn: %s
                Alder: %s
                Træner: %s
                I restance?: %s
                ---------------------
                
                """, this.memberID, this.membership, memberType, this.name, this.age, this.trainersAssigned, this.inArrear);
    }

   // GETTERS
    public ArrayList<Trainer> getTrainer() {
        return this.trainersAssigned;
    }

    public String getPR_butterfly() {
        return this.PR_butterfly;
    }

    public String getPR_crawl() {
        return this.PR_crawl;
    }

    public String getPR_back_crawl() {
        return this.PR_back_crawl;
    }

    public String getPR_breast() {
        return this.PR_breast;
    }

    // SETTERS
    public void addTrainer(Trainer trainer) {
        this.trainersAssigned.add(trainer);
    }

    public void removeTrainer(Trainer trainer) {
        this.trainersAssigned.remove(trainer);
    }

    public void setPR_butterfly(String PR_butterfly) {
        this.PR_butterfly = PR_butterfly;
    }

    public void setPR_crawl(String PR_crawl) {
        this.PR_crawl = PR_crawl;
    }

    public void setPR_back_crawl(String PR_back_crawl) {
        this.PR_back_crawl = PR_back_crawl;
    }

    public void setPR_breast(String PR_breast) {
        this.PR_breast = PR_breast;
    }
}
