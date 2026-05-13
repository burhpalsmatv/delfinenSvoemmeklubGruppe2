import java.io.Serializable;

public class Competitor extends Member implements /* Comparable<Competitor>, */ Serializable {
    private static final long serialVersionUID = 3L;

    private Trainer trainer;
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
        this.trainer = null;
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
        this.trainer = null;
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
                Medlemstype: %s

                Navn: %s
                Alder: %s
                Træner: %s
                ---------------------
                
                """, this.memberID, this.membership, this.name, this.age, this.trainer, this.inArrear);
    }

   // GETTERS
    public Trainer getTrainer() {
        return trainer;
    }

    public String getPR_butterfly() {
        return PR_butterfly;
    }

    public String getPR_crawl() {
        return PR_crawl;
    }

    public String getPR_back_crawl() {
        return PR_back_crawl;
    }

    public String getPR_breast() {
        return PR_breast;
    }

    // SETTERS
    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
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
