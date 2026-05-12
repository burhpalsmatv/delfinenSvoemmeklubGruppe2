import java.io.Serializable;
import java.util.ArrayList;

public class Competitor extends Member implements Comparable<Competitor>, Serializable {
    private static final long serialVersionUID = 3L;

    private ArrayList<SwimmingCategory> swimmingCategory;
    private Trainer trainer;
    private double speed;
    private int placing;
    private String name;
    private Medals medals;
    private int amtOfMedals;
    private String time;
    private double pr;
    private String timeForCategory;


    public Competitor(Member member) {
        super(member.name, member.age,
                member.address, member.postcode,
                member.phone, member.email,
                member.gender, member.membership);

        this.name = member.name;
        this.membership = member.membership;
        this.phone = member.phone;
        this.isPaid = false;
        //
        Register.listOfCompetitors.add(this);
        Register.listOfMembers.remove(member);

    }

    public void addTrainer(Trainer  trainer){
        this.trainer =  trainer;
    }



    public String toString(){
        return String.format("""
                
                ---------------------
                Navn: %s
                Kategori: %s
                Træner: %s
                Resultat: %s
                Medlemstype: %s
                Er betalt?: %s
                ---------------------
                
                """, this.name, this.swimmingCategory, this.trainer, this.placing, this.membership, this.isPaid);
    }


   // GETTERS
    public ArrayList<SwimmingCategory> getSwimmingCategory() {
        return swimmingCategory;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public double getSpeed() {
        return speed;
    }

    public int getPlacing() {
        return placing;
    }

    public String getName() {
        return name;
    }

    public Medals getMedals() {
        return medals;
    }

    public String getTime() {
        return time;
    }

    public double getPr() {
        return pr;
    }

    public String getTimeForCategory() {
        return timeForCategory;
    }

    public int getAmtOfMedals() {
        return amtOfMedals;
    }

    // SETTERS

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setPlacing(int placing) {
        this.placing = placing;
    }

    public void setMedals(Medals medals) {
        this.medals = medals;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setPr(double pr) {
        this.pr = pr;
    }

    public void setTimeForCategory(String timeForCategory) {
        this.timeForCategory = timeForCategory;
    }

    public void setAmtOfMedals(int amtOfMedals) {
        this.amtOfMedals = amtOfMedals;
    }

    @Override
    public int compareTo(Competitor competitor) {
        return Integer.compare(this.placing, competitor.placing);
    }
}
