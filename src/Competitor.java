public class Competitor extends Member {

    private SwimmingCategory swimmingCategory;
    private Trainer trainer;
    private double speed;

    public Competitor(Member member) {
        super();

    }

    public void addTrainer(Trainer  trainer){
        this.trainer =  trainer;
    }

    public String toString(){
        return String.format("""
                Kategori: %s
                Træner: %s
                """, this.swimmingCategory, this.trainer);
    }
}
