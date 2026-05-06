import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        ArrayList<Member> theGang = new ArrayList<Member>();
        Member mads = new Member("Mads", MemberType.SENIOR, "22334455");
        Member emma = new Member("Emma", MemberType.JUNIOR, "99999999");
        Member mattie = new Member("Mattie", MemberType.PASSIVE, "80081350");
        Member valdemar = new Member("Valdemar", MemberType.JUNIOR, "00000001");

        mads.setPaid();

        theGang.add(mads);
        theGang.add(emma);
        theGang.add(mattie);
        theGang.add(valdemar);

        System.out.println(PaymentManager.getMembersInArrear(theGang).toString());
        Competitor madsComp = new Competitor(mads);
        SwimmingCategory crawl = new SwimmingCategory("crawl");
        Trainer mattie1 = new Trainer("Mattie", crawl);
        madsComp.addTrainer(mattie1);

        System.out.println(madsComp);

        System.out.println(mads);

    }
}
