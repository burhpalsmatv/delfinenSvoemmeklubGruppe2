import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){



        ArrayList<Member> theGang = new ArrayList<Member>();
        Member mads = new Member("Mads", Membership.SENIOR, "22334455");
        Member emma = new Member("Emma", Membership.JUNIOR, "99999999");
        Member mattie = new Member("Mattie", Membership.PASSIVE, "80081350");
        Member valdemar = new Member("Valdemar", Membership.JUNIOR, "00000001");

        theGang.add(mads);
        theGang.add(emma);
        theGang.add(mattie);
        theGang.add(valdemar);

        SwimmingCategory swimtest1 = new SwimmingCategory("Lars Henrik");
        Trainer tester1 = new Trainer("Poul", swimtest1);

        Member.setNameAt(0, "Morten");
        Member.removeMemberAt(0);
        Trainer.deleteTrainer(0);

        PricingManager.changeMembershipPrice(Membership.JUNIOR, 1200);

        Competitor comptest1 = new Competitor(emma);
        Competitor comptest2 = new Competitor(mads);
        Competition stævne1 = new Competition("Title1", "idag", comptest1, comptest2);
        System.out.println(comptest1.getMedals());

        System.out.println(comptest1);
        System.out.println(stævne1);

        stævne1.competitionEnded();
        stævne1.enterResults();


        mads.setIsPaid();
    }
}
