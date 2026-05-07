import java.util.ArrayList;

public class Competition {

    private ArrayList<Competitor> competitors;
    public String date;
    public String title;
    public String prize;
    public boolean ended;

    public Competition(String title, String date
            , Competitor... competitors) {

        this.title = title;
        this.date = date;
        this.competitors = new ArrayList<>();

        for(Competitor competitor : competitors){
            this.competitors.add(competitor);

        }
    }

    public String toString(){
        return String.format("""
                Titel: %s
                Dato: %s
                Deltagere: %s""", this.title, this.date, this.competitors);
    }
}
