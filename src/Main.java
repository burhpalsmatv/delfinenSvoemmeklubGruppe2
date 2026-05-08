import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        File.readTest();

        SwimmingCategory categoryTest1 = new SwimmingCategory("Brystsvømning");

        Member testMember1 = new Member("Peter Elev", Membership.JUNIOR, "12345678");
        Trainer testTrainer1 = new Trainer("Thomas Træner", categoryTest1);
        Competitor testCompetitor1 = new Competitor(testMember1);
        Competition testCompetition1 = new Competition("Stævne 1", "I dag", testCompetitor1);

        // Når system stoppes så gemmes alle filer
        File.writeFileMembers();
        File.writeFileTrainers();
        File.writeFileCompetitors();
        File.writeFileCompetition();


    }
}
