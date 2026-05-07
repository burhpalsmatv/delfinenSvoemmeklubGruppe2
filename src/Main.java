import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        ArrayList<Member> theGang = new ArrayList<Member>();
        Member mads = new Member("Mads", MemberType.SENIOR, "22334455");
        Member emma = new Member("Emma", MemberType.JUNIOR, "99999999");
        Member mattie = new Member("Mattie", MemberType.PASSIVE, "80081350");
        Member valdemar = new Member("Valdemar", MemberType.JUNIOR, "00000001");

        theGang.add(mads);
        theGang.add(emma);
        theGang.add(mattie);
        theGang.add(valdemar);

        SwimmingCategory swimtest1 = new SwimmingCategory("Lars Henrik");
        Trainer tester1 = new Trainer("Poul", swimtest1);

        Member.setNameAt(0, "Morten");
        Member.removeMemberAt(0);
        Trainer.deleteTrainer(0);

        System.out.println(Member.listOfMembers);
        PricingManager.changeMembershipPrice(MemberType.JUNIOR, 1200);

        Competitor comptest1 = new Competitor(emma);
        Competition stævne1 = new Competition("Title1", "idag", comptest1);

        System.out.println(comptest1);
        System.out.println(stævne1);


        mads.setIsPaid();
    }
}
