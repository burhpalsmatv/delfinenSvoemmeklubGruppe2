package menus.trainerMenu;

import members.Competitor;
import members.IDgenerator;
import register.Register;

import java.io.Serializable;
import java.sql.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Competition implements Serializable {
    private static final long serialVersionUID = 6L; // Til serialization. Niks pille

    private String title;
    private LocalDate date;
    String competitionID;

    public ArrayList<Competitor> competitors = new ArrayList<>();

    public Competition(String title, LocalDate date) {
        this.competitors = new ArrayList<>();
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
        this.competitors.add(competitor);
    }
}