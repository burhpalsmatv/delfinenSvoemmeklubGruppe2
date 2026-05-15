import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Competition {

    private String title;
    private LocalDate date;
    String competitionID;

    private ArrayList<Competitor> competitions = new ArrayList<>();
    private boolean ended = false;

    public Competition(String title, LocalDate date) {
        this.title = title;
        this.date = date;
        this.competitionID = IDgenerator.generateCompetitionID();
        //
        Register.listOfCompetitions.add(this);
    }

    public String toString(){
        return String.format("""
                -------------------
                STÆVNE INFO
                ID: %s
                Titel: %s
                Dato: %s
                Deltagere: IKKE INDFØRT
                Afsluttet?: IKKE INDFØRT
               
                -------------------""",
                this.competitionID, this.title, this.date);
    }

    //GETTERS
    public String getTitle() {
        return this.title;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public String getCompetitionID() {
        return this.competitionID;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void addCompetitor(Competitor competitor){
        this.competitions.add(competitor);
    }
}