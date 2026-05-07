public class Competitor extends Member {

    private SwimmingCategory swimmingCategory;
    private Trainer trainer;
    private double speed;
    private int result;
    private String name;
    private Medals medal;
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
                Navn: %s
                Kategori: %s
                Træner: %s
                """, this.name, this.swimmingCategory, this.trainer);
    }
}
