import java.time.LocalDate;
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

        Member.setNameAt(0, "Morten");
        Member.removeMemberAt(0);
        Trainer.deleteTrainer(0);
        Member.setAgeAt(0, 75);
        Member.setAgeAt(1, 74);
        Member.setAgeAt(2, 73);
        valdemar.setAge(73);

        // Når system stoppes så gemmes alle filer
        File.writeFileMembers();
        File.writeFileTrainers();
        File.writeFileCompetitors();
        File.writeFileCompetition();


        Competitor comptest1 = new Competitor(emma);
        Competition stævne1 = new Competition("Title1", LocalDate.of(2002,12,12), comptest1);

        mads.setIsPaid();
        mattie.setIsPaid();
        valdemar.setIsPaid();

        System.out.println(comptest1);
        System.out.println(stævne1);

        System.out.println("her er expected quota\n" + PaymentManager.getExpectedQuota(theGang)+"\n");
        System.out.println("her er actual quota\n" + PaymentManager.getActualQuota(theGang)+"\n");
        TrainerScreen.trainerScreen();


    }
}
