public class Competitor extends Member {

    private SwimmingCategory swimmingCategory;
    private Trainer trainer;
    private double speed;
    private int result;
    private String name;
    private Medals medals;
    private int amtOfMedals;
    private Competition competition;
    private String time;
    private double pr;
    private String timeForCategory;


    public Competitor(Member member) {
        super();
        this.name = member.getName();

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
                Konkurrencer: &s
                Mængden af medaljer: %d
                PR: %d
                ---------------------
                
                """, this.name, this.swimmingCategory, this.swimmingCategory, this.trainer, this.amtOfMedals, this.pr);
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

    public Competition getCompetition() {
        return competition;
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

    public void setCompetition(Competition competition) {
        this.competition = competition;
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
}
