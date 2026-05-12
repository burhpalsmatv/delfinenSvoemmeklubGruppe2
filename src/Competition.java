import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Competition{

    private ArrayList<Competitor> competitors;
    private LocalDate date;
    private String title;
    private String prize;
    private boolean ended = false;
    private ArrayList<Participants> participants;

    public Competition(String title, LocalDate date
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

    public void sortCompetitors() {
        Collections.sort(competitors);
    }
    public void competitionEnded() {
        this.ended = true;
        System.out.println("Konkurrencen: " + title + ", er nu markeret som afsluttet");

    }

    public  void enterResults() {
        Scanner scanner = new Scanner(System.in);

        for (Competitor competitor : competitors) {
            System.out.println("Indtast resultat for: " + competitor.getName());

            while(!scanner.hasNextDouble()) {
                System.out.println("Udyldigt! Indtast et tal");
                scanner.nextLine();
            }

            int result = scanner.nextInt();
            competitor.setPlacing(result);
        }

        System.out.println("Alle resultater er nu gemt");

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

    //GETTERS + SETTERS:

    public String getTitle() {
        return title;
    }

    public void addParticipants(Participants participant) {
        participants.add(participant);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}