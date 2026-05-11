import java.io.Serializable;

public class Competitor extends Member implements Comparable<Competitor>, Serializable {
    private static final long serialVersionUID = 3L;

    private SwimmingCategory swimmingCategory;
    private Trainer trainer;
    private double speed;
    private int result;
    private String name;
    private Medals medals;
    private int amtOfMedals;
    private String time;
    private double pr;
    private String timeForCategory;


    public Competitor(Member member) {
        super();
        this.name = member.getName();
        this.membership = member.getMemberType();
        this.phone = member.getPhone();
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
                
                """, this.name, this.swimmingCategory, this.trainer, this.result, this.membership, this.isPaid);
    }


   // GETTERS
    public SwimmingCategory getSwimmingCategory() {
        return swimmingCategory;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public double getSpeed() {
        return speed;
    }

    public int getResult() {
        return result;
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
    public void setSwimmingCategory(SwimmingCategory swimmingCategory) {
        this.swimmingCategory = swimmingCategory;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setResult(int result) {
        this.result = result;
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
        return Integer.compare(this.result, competitor.result);
    }
}
