import java.io.Serializable;
import java.util.ArrayList;

public class Competitor extends Member implements /* Comparable<Competitor>, */ Serializable {
    private static final long serialVersionUID = 3L;

    // COMPETITOR PLACINGS (TOP 5 BEDSTE SVØMMERE) SKAL KUNNE SES INDENFOR HVER KATEGORI
    // OG SKAL ADSKILELS I HVER KATEGORI
    // FX PRINT TOP 5 BEDSTE SVØMMERE I BRYST
    // & PRINT TOP 5 BEDSTE SVØMMERE I CRAWL


    private Trainer trainer;
    // PR i hver kategori
    String PR_butterfly; // MIDLERTIDIG INDTIL FIKS
    String PR_crawl; // MIDLERTIDIG INDTIL FIKS
    String PR_back_crawl; // MIDLERTIDIG INDTIL FIKS
    String PR_breast; // MIDLERTIDIG INDTIL FIKS

    // Find måde at track tid og PR på hver swimming category

    public Competitor(Member member) {
        // Fra memberen
        this.name = member.name;
        this.age = member.age;
        this.address = member.address;
        this.postcode = member.postcode;
        this.phone = member.phone;
        this.email = member.email;
        this.gender = member.gender;
        this.isPaid = member.isPaid;
        this.membership = member.membership;
        this.seniorDiscount = member.seniorDiscount;
        this.memberID = member.memberID;

        // Competitor unique variables
        this.trainer = null;

        // Find en måde at holde PR's og tjekke om participant (som er denne Competitor)
        // har slået PR i stævne
        this.PR_butterfly = null;
        this.PR_crawl = null;
        this.PR_back_crawl = null;
        this.PR_breast = null;

        // Remove member fra sin ArrayList og add Competitor til sin ArrayList
        Register.listOfCompetitors.add(this);
        Register.listOfMembers.remove(member);

    }

    public void addTrainer(Trainer  trainer){
        this.trainer = trainer;
    }

    public void addMedal() {
        // Find måde at add medalje fra stævne
        // this.achievedMedals.add();
    }

    public String toString(){
        return String.format("""
                
                ---------------------
                Navn: %s
                Kategori: IKKE INDFØRT
                Træner: %s
                Resultat: IKKE INDFØRT
                Medlemstype: %s
                Er betalt?: %s
                ---------------------
                
                """, this.name, this.trainer, this.membership, this.isPaid);
    }

   // GETTERS

    public Trainer getTrainer() {
        return trainer;
    }

    public String getName() {
        return name;
    }

    // SETTERS

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

//    @Override
//    public int compareTo(Competitor competitor) {
//        return Integer.compare(this.placing, competitor.placing);
//    }
}
