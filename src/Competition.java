import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Competition{

    private ArrayList<Competitor> competitors;
    private String date;
    private String title;
    private String prize;
    private boolean ended;

    public Competition(String title, String date
            , Competitor... competitors) {

        this.title = title;
        this.date = date;
        this.competitors = new ArrayList<>();

        for(Competitor competitor : competitors){
            this.competitors.add(competitor);
        }

        //

        Register.listOfCompetitions.add(this);
    }

    public void sortCompetitors(){
        Collections.sort(competitors);
    }

    public String toString(){
        return String.format("""
                -------------------
                STÆVNE INFO
                Titel: %s
                Dato: %s
                Præmie: %s
                Deltagere: %s
               
                -------------------""", this.title, this.date, this.prize, this.competitors);
    }
}