import java.util.ArrayList;

public class Competition {
    private ArrayList<SwimmingCategory> swimmingCategories;
    //private ArrayList<Competitor> competitors;
    public String date;
    public String title;
    public String prize;
    public boolean ended;

    public Competition(ArrayList<SwimmingCategory> swimmingCategories, String title, String date
            , String prize) {
        this.swimmingCategories = swimmingCategories;
        this.title = title;
        this.date = date;
        this.prize = prize;
        this.ended = false;
    }
}
