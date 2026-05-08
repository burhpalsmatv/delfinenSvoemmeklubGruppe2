import java.time.LocalDate;
import java.util.ArrayList;

public class Competition {

    private ArrayList<Competitor> competitors;
    private LocalDate date;
    private String title;
    private String prize;
    private boolean ended;

    public Competition(String title, LocalDate date
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
                -------------------
                STÆVNE INFO
                Titel: %s
                Dato: %s
                Deltagere: %s
                Præmie: %s
                -------------------""", this.title, this.date, this.competitors, this.prize);
    }
}
